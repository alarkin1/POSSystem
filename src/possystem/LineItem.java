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
public class LineItem {

    private int quantity;
    private ProductStrategy product;
    private double costOfLineItem;
    private double totalSavingsForLineItem;

    public LineItem(ProductStrategy product, int quantity) {
        this.quantity = quantity;
        this.product = product;
        costOfLineItem = product.getDiscountStrategy().calculateAndReturnDiscountedPrice(product.getPrice(), quantity);
        totalSavingsForLineItem = product.getDiscountStrategy().calculateAndReturnSavings(product.getPrice(), quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductStrategy getProduct() {
        return product;
    }

    public void setProduct(ProductStrategy product) {
        this.product = product;
    }

    public double getCostOfLineItem() {
        return costOfLineItem;
    }

    public void setCostOfLineItem(double costOfLineItem) {
        costOfLineItem = product.getDiscountStrategy().calculateAndReturnDiscountedPrice(product.getPrice(), quantity);
    }

    public double getTotalSavingsForLineItem() {
        return totalSavingsForLineItem;
    }

    public void setTotalSavingsForLineItem() {
        totalSavingsForLineItem = product.getDiscountStrategy().calculateAndReturnSavings(costOfLineItem, quantity);//.calculateAndReturnSavings(product.getPrice(), quantity);
    }

}
