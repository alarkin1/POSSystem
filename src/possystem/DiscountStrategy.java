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
public interface DiscountStrategy {

    public abstract void setDiscountCalculationMethod(DiscountCalcStrategy discountCalculationMethod);
    
    public abstract DiscountCalcStrategy getDiscountCalculationMethod();
}
