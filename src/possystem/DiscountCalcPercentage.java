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
public class DiscountCalcPercentage implements DiscountCalcStrategy {

    @Override
    public double calculateAndReturnSavings(double price, double amountOff) {
        
        return price * amountOff;
    }

}
