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
public class QuantityDiscount implements DiscountStrategy {

    private int baselineQuantity;

    public QuantityDiscount(int baselineQuantity) {
        this.baselineQuantity = baselineQuantity;
    }

    @Override
    public double getSavings(double price, int quantity) {
        if (quantity >= baselineQuantity) {
            return 20;
        } else {
            return 0;
        }
        
    }

    @Override
    public double getDiscountedPrice(double price, int quantity) {
        return (price * quantity) - getSavings(price, quantity);
    }

}
