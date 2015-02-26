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
public class DiscountCalcFlat implements DiscountCalcStrategy {

    private double amountOff = 1;

    
    
    public DiscountCalcFlat(double amountOff) {
        this.amountOff = amountOff;
    }   
    
        //calls twice becduase the LineItem calls this method once and then calculateAndReturnDiscountedPrice calls it also
    @Override
    public double calculateAndReturnSavings(double price, int quantity) {
        return amountOff;
    }

    @Override
    public double calculateAndReturnDiscountedPrice(double price, int quantity) {
        return (price * quantity) - calculateAndReturnSavings(price, quantity);
    }
    
    
}
