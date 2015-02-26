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
public class Customer {

    private String customerID;
    private PhysicalItem[] customerItems;

    public Customer(String customerID) {
        this.customerID = customerID;
    }
    
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public PhysicalItem[] getCustomerItems() {
        return customerItems;
    }

    public void setCustomerItems(PhysicalItem[] customerItems) {
        this.customerItems = customerItems;
    }
   
    
}
