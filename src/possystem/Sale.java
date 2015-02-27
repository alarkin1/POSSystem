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
public class Sale {

    private Customer newCustomer;
    private CashRegister newCashRegister;
    private LineItem[] itemsToBePurchased;

    public Sale(Customer newCustomer, CashRegister newCashRegister) {
        this.newCustomer = newCustomer;
        this.newCashRegister = newCashRegister;
    }

    public void startSale(Customer newCustomer) {
        setNewCustomer(newCustomer);
    }

    public void endSale() {
        newCashRegister.processLineItems(newCustomer.getCustomerItems(), newCustomer.getCustomerID());
    }

    public Customer getNewCustomer() {
        return newCustomer;
    }

    public void setNewCustomer(Customer newCustomer) {
        this.newCustomer = newCustomer;
    }

    public CashRegister getNewCashRegister() {
        return newCashRegister;
    }

    public void setNewCashRegister(CashRegister newCashRegister) {
        this.newCashRegister = newCashRegister;
    }

    public void addCustItemsToSale(Customer newCustomer) {
        System.arraycopy(newCustomer.getCustomerItems(), 0, itemsToBePurchased, 0, newCustomer.getCustomerItems().length + 1);
    }

    public void addItemsToSale(LineItem[] itemsToAdd) {
        System.arraycopy(itemsToAdd, 0, itemsToBePurchased, 0, newCustomer.getCustomerItems().length + 1);
    }
}
