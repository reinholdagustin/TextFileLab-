/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.payrollsystem2;

import java.util.Scanner;
/**
 *
 * @author RR
 */
public class MonthlySalarywithMethod {
    public static void main(String[]args){
    
        /*This is what allows input into the system*/
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter Monthly Gross Salary: PHP ");
    
    if (scanner.hasNextDouble()) {
        double grossSalary = scanner.nextDouble();
        
        if (grossSalary >0){
            computeNetPay(grossSalary);  
            } else { 
                System.out.println("Error: Salary must be a positive number."); 
            } 
        } else { 
            System.out.println("Error: Invalid input. Please enter numbers only."); 
        } 
        scanner.close();}//
        
          
    public static double computePagIbig(double basicSalary) { 
       
        /*the salary is calculated by comparing wether or the number
          greater or lesser than on right within the bracket the money is 
        then increased by true/false statement*/
        double rate = (basicSalary > 1500) ? 0.02 : 0.01; 
        double contribution = basicSalary * rate; 
         
        /* the money here caps off at a 100, the rest of the methods don't have
        this but roughly do same thing here*/
        return Math.min(contribution, 100.0); 
    } 
    
    
     public static double computeSSS(double basicSalary) { 
         
        double rate = (basicSalary < 135) ? 0.02 : 0.01; 
        double contribution = basicSalary * rate; 
         
 return contribution;}//
    
    
    public static double computePhilHealth(double basicSalary) { 
        
        double rate = (basicSalary >=10000) ? 0.03:0.01; 
        double contribution = basicSalary * rate; 
         
   return contribution;}
     public static double computeIncomeTax(double basicSalary) { 
        
        double rate = (basicSalary <= 20833) ? 0.0 : 0.03; 
        double contribution = basicSalary * rate; 
         return contribution;}
    
        
          // Everything is now called out.
    public static double computeNetPay(double grossSalary) { 
         
        // Then deducted,
        double sssDeduction = computeSSS(grossSalary); 
        double philHealthDeduction = computePhilHealth(grossSalary); 
        double pagIbigDeduction = computePagIbig(grossSalary); 
 
        // Calculated by subtraction or addition
        double totalContributions = sssDeduction + philHealthDeduction + pagIbigDeduction; 
        double taxableIncome = grossSalary - totalContributions; 
         
        
        double withholdingTax = computeIncomeTax(taxableIncome); 
 
        double totalDeductions = totalContributions + withholdingTax; 
        double netPay = grossSalary - totalDeductions; 
        
           // The work done by the methods are displayed as follows: 
        System.out.println("----- PAYSLIP SUMMARY -----"); 
        System.out.printf("Gross Salary:      PHP %,10.2f%n", grossSalary); 
        System.out.println("---------------------------"); 
        System.out.printf("SSS:               PHP %,10.2f%n", sssDeduction); 
        System.out.printf("PhilHealth:        PHP %,10.2f%n", philHealthDeduction); 
        System.out.printf("Pag-IBIG:          PHP %,10.2f%n", pagIbigDeduction); 
        System.out.printf("Withholding Tax:   PHP %,10.2f%n", withholdingTax); 
        System.out.println("---------------------------"); 
        System.out.printf("Total Deductions:  PHP %,10.2f%n", totalDeductions); 
        System.out.printf("Taxable Income:    PHP %,10.2f%n", taxableIncome); 
        System.out.println("---------------------------"); 
        System.out.printf("NET PAY:           PHP %,10.2f%n", netPay); 
         
        return netPay; // the net payment is calculated and returned.
    
     } 
} 
        
        
        
        
