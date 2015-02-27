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
public class Database {

    private ProductStrategy[] tableOfProducts = {
        new PackerBallCap(new DiscountByProduct(new DiscountCalcFlat(10.0)), 20.0)
    };
    private Customer[] tableOfCustomers = {};

    public Database() {
        System.out.println(tableOfProducts[0].getProductName());
    }
}