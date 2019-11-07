/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StockManagement extends Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product urun = new Product();
        Scanner sn = new Scanner(System.in);
        int secim = 0;
        while (secim != -1) {
            secim = Product.Secenekler();
            switch (secim) {
                case 0: {
                    urun.AddProducts(0);
                    System.out.println("\n");
                    secim = Product.Secenekler();
                    System.out.println("\n");
                }
                case 1: {
                    urun.ShowProducts();
                    System.out.println("\n");
                    secim = Product.Secenekler();
                    System.out.println("\n");

                }
                case 2:{
                    urun.DeleteProduct();
                    System.out.println("\n");
                    secim = Product.Secenekler();
                    System.out.println("\n");
                }
            }

        }

        // TODO code application logic here
    }

}
