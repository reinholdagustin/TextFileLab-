/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem2;

/**
 *
 * @author RR
 */
public class MonthlySalary {
    
public static void main(String[] args) {
        
        
    
       //This is the employee's name
        String employeeName = "Reginald";
        //These are the hours they worked.
        double hourlyRate=500.00;
        double hoursWorked=80.5;  
        /* If there are no hours here, then it gives an error.
        */
        if (hoursWorked < 0 || hourlyRate < 0 ) {
            System.out.println("Error: Hours or rate cannot be negative" );}
        else {
            /*This multiplies how many hours the employee worked by the
            how much money is getting to get his salary.
                        */
        double semiMonthlySalary = hoursWorked * hourlyRate;
        
        //This simply prints out the information.
    System.out.println("----- MotorPH Payroll Report -----");
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Hourly Rate:   PHP " + hourlyRate);
            System.out.println("Total Hours:   " + hoursWorked);
            System.out.println("-----------------------------------");
            System.out.println("Gross Salary:  PHP " + semiMonthlySalary);
            System.out.println("-----------------------------------");
            System.out.println("Computation verified successfully!");

                }
        
    }
}
