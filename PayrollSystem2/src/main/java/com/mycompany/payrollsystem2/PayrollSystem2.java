/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payrollsystem2;

/**
 *
 * @author RR
 */
public class PayrollSystem2 {

    public static void main(String[] args) {
        
        //this is the name of the employee
        String employeeName = "Reginald";
        
        
    /*these are the calculations for time, timeout represents time away from work 
and timein represents vice versa breaktime is also considered time 
off but is in there for realism.*/

        double timeIn = 8.0;   
        double timeOut = 17.5;   
        double breakTime = 1.0;  
        
        /* the equation below will subtract the hours at work
        with the hours ours home the sum of which will be subtracted by
        breaktime giving the final total.
        */
        double totalHoursWorked = (timeOut - timeIn) - breakTime;
        
        //these are the labels that will write out the information.
        
        
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
    
