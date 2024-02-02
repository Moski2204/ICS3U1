/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.leapyearcheck;
import java.util.Scanner;
/**
 * Date: 05/14/2021
 * Name: Muhammad Naseem
 * File: Unit 2 LeapYearCheck
 */

public class Unit2LeapYearCheck {

//main ()
    public static void main(String[] args) {
        Scanner  In = new Scanner (System.in); 
     
     //Variable Declaration
     int year;
     boolean flag = false; //year is not leap year
     
     //Ask User
     System.out.print("Enter year number: ");
     year = In.nextInt();
     
     //If Year Is A Multiple Of 4 and Not A Multiple Of 100, Then Its A Leap Year
     if (year % 4 == 0 && 100 != 0)
        flag = true; //its  a leap year
     else if (year % 100 == 0 && year % 400 == 0) //multiple of 100 and 400, for example 2000
        flag = true; //leap year 
     else 
        flag = false; //not a leap year 
    
     //Display Output
     if (flag)
         System.out.println("The year " + year + " is a leap year.");
     else 
         System.out.println("The year " + year + " is not a leap year.");
    
    }//end main ()
    
}//end class
