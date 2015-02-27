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
public class AnonymousCustomer implements DatabaseCustomer {

    String name = "Anonymous Customer";

    public String getName() {
        return name;
    }

}
