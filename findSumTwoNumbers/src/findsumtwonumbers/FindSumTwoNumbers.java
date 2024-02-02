/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsumtwonumbers;

import java.util.Scanner;
/**
 * Date: 05/04/2021
 * Name: Muhammad Naseem
 * File: FindSumTwoNumbers
 * Function: Examples of finding sum of two double numbers entered by user
 */
public class FindSumTwoNumbers {

   //main ()
    
    public static void main(String[] args) {
        
        Scanner In = new Scanner (System.in);
      
        //Step 1: Declare Variables (double) Needed For Program
        double num1, num2, sum;
        
        //Step 2:Get Values For The Variables From The User 
        System.out.println("Enter first number:");
        num1 = In.nextDouble();
        System.out.println("Enter second number:");
        num2 = In.nextDouble();
        
        //Find The Sum Of Two Numbers
        sum = num1 + num2;
        
        //Step 3: Display The Sum Of The Two Numbers
        System.out.println("\nThe sum of " + num1 + " and " + num2 + " is " + sum);        
         
    }//end main ()
    
}//end class
