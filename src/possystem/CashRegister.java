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

    //private ReceiptPrinter receiptPrinter = new ReceiptPrinter();
    //private CustomerReader customerReader = new CustomerReader();
    public CashRegister() {
        
    }

    public void processLineItems(LineItem[] customersLineItems) {
        System.out.println(customersLineItems[0].getCostOfLineItem());
        System.out.println(customersLineItems[0].getProduct().getProductName());
        System.out.println(customersLineItems[0].getQuantity());
    }

    private double getTotalCostOfItems(LineItem[] customersLineItems) {
        double runningTotalCost = 0;
        for (LineItem lineItem : customersLineItems) {
            runningTotalCost += lineItem.getCostOfLineItem();
        }
        return runningTotalCost;
    }

}
