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
public class PhysicalItem {

    private int upc;

    public PhysicalItem(int upc) {
        this.upc = upc;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }
}
