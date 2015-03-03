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
public class SaleService {

    private Customer newCustomer;
    private CashRegister newCashRegister;
    private LineItem[] itemsToBePurchased;

    public SaleService(Customer newCustomer, CashRegister newCashRegister) {
        this.newCustomer = newCustomer;
        this.newCashRegister = newCashRegister;
        itemsToBePurchased = newCustomer.getCustomerItems();
    }

    public void startSale(Customer newCustomer) {
        setNewCustomer(newCustomer);
    }

    public void endSale() {
        newCashRegister.processLineItems(itemsToBePurchased, newCustomer.getCustomerID());
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
        LineItem[] temp = new LineItem[itemsToAdd.length + itemsToBePurchased.length];
        System.out.println(temp.length);
        System.out.println(itemsToBePurchased.length);
        System.arraycopy(itemsToBePurchased, 0, temp, 0, itemsToBePurchased.length);
        System.arraycopy(itemsToAdd, 0, temp, itemsToBePurchased.length, itemsToAdd.length);
        itemsToBePurchased = temp;
        temp = null;
    }
}