/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.quickcartpractice2;
import java.util.Scanner;
/**
 *
 * @author RR
 */
public class Quickcartpractice2 {

     // Method 1: Displays a greeting message
    public static void displayGreeting() {
        System.out.println("Welcome to QuickCart!");
        System.out.println("Let's compute your total for today’s purchase.\n");
    }
    public static void displayThankYou() {
        System.out.println("Thank you for shopping at QuickCart!");
       
    }

    // Method 2: Computes subtotal of two items
    // This method accepts two item prices and returns their sum.
    public static double computeSubtotal(double price1, double price2) {
        double subtotal = price1 + price2;
        return subtotal; // sends subtotal value back to main()
    }

    // Method 3: Applies a 10% discount if subtotal >= 1000
    // Otherwise, returns the same subtotal.
    public static double applyDiscount(double subtotal) {
        double discount = 0;
        if (subtotal >= 1000) {
            discount = subtotal * 0.05; // 5% discount
            System.out.println("Discount applied: ₱" + String.format("%.2f",discount));
        } else {
            System.out.println("No discount applied.");
            System.out.println("Your cash's barely tampered.");
        }
        return subtotal - discount; // return the new total
    }

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Call the greeting method
        displayGreeting();

        // Step 2: Ask for input prices
        System.out.print("Enter price of first item: ");
        double price1 = scanner.nextDouble();

        System.out.print("Enter price of second item: ");
        double price2 = scanner.nextDouble();

        // Step 3: Compute subtotal by calling the computeSubtotal() method
        double subtotal = computeSubtotal(price1, price2);
        System.out.println("Subtotal: ₱" + String.format("%.2f", subtotal));

        // Step 4: Apply discount using the applyDiscount() method
        double total = applyDiscount(subtotal);
        System.out.println("Total amount due: ₱" + String.format("%.2f", total));

        displayThankYou();//this is an automatic thank you message to the customer.
        // Close Scanner object
        scanner.close();
    }
}


