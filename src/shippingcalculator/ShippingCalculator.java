/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shippingcalculator;

import java.util.Scanner;

/**
 *
 * @author gshimkaveg
 */
public class ShippingCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double itemPrice;

        Scanner ask = new Scanner(System.in);

        System.out.println("Enter the price of your item: ");
        itemPrice = ask.nextDouble();

        if (itemPrice > 75) {
            System.out.println("Your shipping will be free.");

        }

        if (itemPrice <= 75 && itemPrice >= 50) {

            System.out.println("Your shipping will cost $5.");

        }

        if (itemPrice < 50 && itemPrice >= 25) {

            System.out.println("Your shipping will cost $10.");

        }
        if (itemPrice < 25) {

            System.out.println("Your shipping will cost $15");

        }
    }

}
