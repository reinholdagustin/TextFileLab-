/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week7activity;

import java.util.Scanner;
/**
 *
 * @author RR
 */
public class Week7Activity {

    public static double computePremium(double salary) {

        double premium = salary * 0.03;

        if (salary <= 10000) {
            premium = 300;
        } 
        else if (salary >= 60000) {
            premium = 1800;
        }

        return premium;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly net salary: ");
        double salary = scanner.nextDouble();

        double premium = computePremium(salary);
        double employeeShare = premium / 2;

        System.out.println("---- PhilHealth Contribution ----");
        System.out.println("Monthly Salary: " + salary);
        System.out.println("3% Premium: " + premium);
        System.out.println("Employee Share (50%): " + employeeShare);
}
}
    
    
    

