/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem2;

/**
 *
 * @author RR
 */
public class Finallysomeexcercise {
    
    public static void main (String[] args) {
    
    int hoursWorked = 30;

    
    if (hoursWorked < 0){
    System.out.println("Invalid Input");}
    
    else if (hoursWorked == 0){
    System.out.println("Employee did not work this week");
    }
    
    else if (hoursWorked <= 40){
    System.out.println("Regular work hours");
    }
    
    else if (hoursWorked > 40){
    System.out.println("employee has worked overtime");}
}
}