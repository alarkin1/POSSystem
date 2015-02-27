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
public class RecordedCustomer implements DatabaseCustomer{
    String name;

    public RecordedCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
