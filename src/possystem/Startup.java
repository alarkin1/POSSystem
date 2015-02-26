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
     * @param args the command line arguments                                                                          //amount discount calc method(dollars off)
     */
    public static void main(String[] args) {
        
                                             //cust id  customers line items        //product in line item  discount type                                 //ptice  quantity purchased, CashRegister
        Sale newSale = new Sale(new Customer("BOB-123", new LineItem[]{ new LineItem(new PackerBallCap(new QuantityDiscount(2, new DiscountCalcFlat(5.00)), 30.0), 2)}), new CashRegister());
        newSale.startSale();
        
    }
    
}
