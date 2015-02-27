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
    private LineItem[] custLineItems;

    public Customer(String customerID, LineItem[] custLineItems) {
        this.customerID = customerID;
        this.custLineItems = custLineItems;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public LineItem[] getCustomerItems() {
        return custLineItems;
    }

    public void setCustomerItems(LineItem[] custLineItems) {
        this.custLineItems = custLineItems;
    }

}
