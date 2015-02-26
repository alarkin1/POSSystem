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
    private String productName;
    private ProductStrategy product;
    private double costOfLineItem;
    private double totalSavingsForLineItem;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
        this.costOfLineItem = costOfLineItem;
    }

    public double getTotalSavingsForLineItem() {
        return totalSavingsForLineItem;
    }

    public void setTotalSavingsForLineItem(double totalSavingsForLineItem) {
        this.totalSavingsForLineItem = totalSavingsForLineItem;
    }
    
    
}
