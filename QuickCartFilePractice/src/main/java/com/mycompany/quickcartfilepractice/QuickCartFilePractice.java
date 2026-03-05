/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickcartfilepractice;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author RR
 */
public class QuickCartFilePractice {
 public static double applyDiscount(double total) {
        double discount = 0;
        if (total > 500) {
            discount = total * 0.05; // 5% discount
            System.out.println("Discount applied: " + String.format("%.2f",discount));
        } else {
            System.out.println("No discount applied.");
            System.out.println("Your cash's barely tampered.");
        }
        return total - discount;
        
         }
    // Reads each line from items.txt and stores them in a list
    public static ArrayList<String> readItemsFromFile() {
        ArrayList<String> items = new ArrayList<>();

        try {
            // BufferedReader lets us read the file line by line
            BufferedReader reader = new BufferedReader(new FileReader("items.txt"));
            String line;

            // Read until the end of the file
            while ((line = reader.readLine()) != null) {
                items.add(line);  // Add each item line to the list
            }

            reader.close(); // Always close files after reading
        } catch (IOException e) {
            System.out.println("Error reading items.txt");
        }

        return items;
    }

    // Writes a receipt message to receipt.txt
    public static void writeReceiptToFile(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("receipt.txt"));

            writer.write(message);  // Write the entire receipt
            writer.close();         // Save and close the file

            System.out.println("Receipt successfully written to receipt.txt");
        } catch (IOException e) {
            System.out.println("Error writing receipt.txt");
        }
    }

    // Extracts the price from a line like "Milk,80"
    public static double parsePrice(String line) {
        String[] parts = line.split(",");    // Split item and price
        return Double.parseDouble(parts[1]); // Convert price to double
    }

    public static void main(String[] args) {

        // Load item lines from items.txt
        ArrayList<String> items = readItemsFromFile();
        double total = 0;

        System.out.println("Checkout Summary:");

        // Process each item and add up the prices
        for (String item : items) {
            
            double price = parsePrice(item); // Get the numeric price
            System.out.println(item);        // Display the item line
            total += price;                  // Update total
        }
        
        
        
        double finalamount = applyDiscount(total);

        
        
        
         
       if (total > 500)
           System.out.println("Total before deduction: " + total);
       else System.out.println("Total: " + total);

        // Build the receipt text to be written into receipt.txt
        String receipt = "QuickCart Receipt\n"
                        + "-------------------\n"
                        + "Total: " + total + "\n";

        // Save the receipt to a file
        writeReceiptToFile(receipt);
    }
}
