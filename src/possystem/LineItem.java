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
    private PhysicalItem item;

    public LineItem(int quantity, PhysicalItem item) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PhysicalItem getItem() {
        return item;
    }

    public void setItem(PhysicalItem item) {
        this.item = item;
    }
    
}
