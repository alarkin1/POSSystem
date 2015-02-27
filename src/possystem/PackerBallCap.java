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
public class PackerBallCap implements ProductStrategy {

    private int upc = 98532;
    private String productName = "Packer Ball Cap";
    private DiscountStrategy discount;
    private double price;

    public PackerBallCap(DiscountStrategy discount, double price) {
        this.discount = discount;
        this.price = price;
    }
    

    public DiscountStrategy getDiscountStrategy() {
        return discount;
    }

    public String getProductName() {
        return productName;
    }

    public int getUpc() {
        return upc;
    }

    public double getPrice() {
        return price;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

}
