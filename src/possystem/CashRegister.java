/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author Alex
 */
public class CashRegister {

    // private CustomerReader customerReader = new CustomerReader();
    private Receipt virtualReceipt = new Receipt();
    private double salesTaxRatePerc = 5;

    public CashRegister(double salesTaxRatePerc) {
        this.salesTaxRatePerc = salesTaxRatePerc;
    }

    public CashRegister() {

    }

    public String processLineItems(LineItem[] customersLineItems, String customerId) {
        String receiptOutput = "";
        receiptOutput += "Thank you for shopping at Kohls, " + virtualReceipt.getDatabase().findCustomerAndReturnCustomer(customerId).getName().toUpperCase() + "\n";
        receiptOutput += "------------------------------------------------------\n";
        receiptOutput += "Product Name, Product Id, Qty, Discounted Price\n";
        receiptOutput += "------------------------------------------------------\n";
        double totalSaved = 0;
        double subtotal = 0;
        for (LineItem lineItem : customersLineItems) {
            PhysicalItem item = lineItem.getItem();
            ProductStrategy product = virtualReceipt.getDatabase().findProductViaUpcAndReturnUpc(item.getUpc());
            DiscountStrategy discount = product.getDiscountStrategy();

            String productName = product.getProductName().toUpperCase();
            int upc = product.getUpc();
            double discountedPrice = discount.calculateAndReturnDiscountedPrice(product.getPrice(), lineItem.getQuantity());
            receiptOutput += productName + " | " + upc + " | " + lineItem.getQuantity() + " | $" + discountedPrice + " | \n";
            receiptOutput += "--Item Price: $" + product.getPrice() + "-------You Save: $" + product.getDiscountStrategy().calculateAndReturnSavings(product.getPrice(), lineItem.getQuantity()) + "\n";
            receiptOutput += "______________________________________________________\n";

            totalSaved += product.getDiscountStrategy().calculateAndReturnSavings(product.getPrice(), lineItem.getQuantity());
            subtotal += discountedPrice;
        }
        receiptOutput += "------------------------------------------------------\n";
        receiptOutput += "Subtotal: $" + subtotal + "\n";
        receiptOutput += "$" + subtotal + " @ " + salesTaxRatePerc + "%  Tax:   $" + (subtotal * (salesTaxRatePerc / 100)) + "\n";
        receiptOutput += "TOTAL:  $" + subtotal + "\n\n\n";
        receiptOutput += "TOTAL SAVED:        $" + totalSaved + "\n";
        System.out.println(receiptOutput);
        return receiptOutput;
    }
    
}
