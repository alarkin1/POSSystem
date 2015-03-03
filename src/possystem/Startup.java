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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                   
        SaleService newSale = new SaleService(new Customer("BOB-123", new LineItem[]{new LineItem(3, new PhysicalItem(98532))}), new CashRegister(new ReceiptPrinter(new OutputGUI())));
        newSale.endSale();
        SaleService newSale2 = new SaleService(new Customer("BOB-124", new LineItem[]{new LineItem(3, new PhysicalItem(98532)),new LineItem(3, new PhysicalItem(98932))}), new CashRegister(new ReceiptPrinter(new OutputGUI())));
        newSale2.addItemsToSale(new LineItem[]{new LineItem(3, new PhysicalItem(98532)),new LineItem(3, new PhysicalItem(98932))});
        newSale2.endSale();
    }
    
}
