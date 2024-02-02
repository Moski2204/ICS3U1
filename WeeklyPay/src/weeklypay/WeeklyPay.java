/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weeklypay;
import java.util.Scanner;
/**
 * Date: 05/05/2021
 * Name: Muhammad Naseem
 * File: WEeeklyPay
 * Function: 
 */
//main class
public class WeeklyPay {
    
    public static void main(String[] args) {
        
        Scanner In = new Scanner (System.in);
        
        String name, companyName;
        double weekPay, hourPay, hours;
        
        System.out.println("Enter your name:");
        name = In.nextLine();
        System.out.println("Enter name of the company:");
        companyName = In.nextLine();
        System.out.println("Enter hourly pay rate:");
        hourPay = In.nextDouble();
        System.out.println("Enter work hours per week:");
        hours = In.nextDouble();
        
        weekPay = hourPay * hours;
        
        System.out.printf("Your weekly pay is %.2f.\n", weekPay);
     
    }//end main ()
    
}// end class
