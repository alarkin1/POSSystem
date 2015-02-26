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
    private LineItem[] customersLineItems;

    public Customer(String customerID, LineItem[] customersLineItems) {
        this.customerID = customerID;
        this.customersLineItems = customersLineItems;
    }
    
    

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public LineItem[] getCustomersLineItems() {
        return customersLineItems;
    }

    public void setCustomersLineItems(LineItem[] customersLineItems) {
        this.customersLineItems = customersLineItems;
    }

}
