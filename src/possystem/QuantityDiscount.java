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

    private DiscountCalcStrategy discountCalculationMethod;
    private int quantity = 1;

    public QuantityDiscount(int quantity, DiscountCalcStrategy discountCalculationMethod) {
        this.discountCalculationMethod = discountCalculationMethod;
        this.quantity = quantity;
        
    }
    
    
    
    @Override
    public void setDiscountCalculationMethod(DiscountCalcStrategy discountCalculationMethod) {
        this.discountCalculationMethod = discountCalculationMethod;
    }

    @Override
    public DiscountCalcStrategy getDiscountCalculationMethod() {
        return discountCalculationMethod;
    }
    
    


}
