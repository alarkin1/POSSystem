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
public class Receipt {

    private Database database = new Database();
 
    public void outputReceipt(String customerId) {
        System.out.println(database.findCustomerAndReturnCustomer(customerId).getName());
    }
    
    public Database getDatabase(){
        return database;
    }
}
