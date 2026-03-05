/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payrollsystem;

/**
 *
 * @author RR
 */
public class PayrollSystem {

    public static void main(String[] args) {
        
        String employeeName = "Reginald";
    
        double timeIn = 8.0;   
        double timeOut = 17.5;   
        double breakTime = 1.0;  
        
        double totalHoursWorked = (timeOut - timeIn) - breakTime;
        
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Time In: " + timeIn);
        System.out.println("Time Out: " + timeOut);
        System.out.println("Break Time: " + breakTime + " hour");
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        
        if (totalHoursWorked == 8.5) {
            System.out.println("Test passed: Computation is correct");
        } else {
            System.out.println("Test failed: Check your arithmetic logic");
        }
    }
}
