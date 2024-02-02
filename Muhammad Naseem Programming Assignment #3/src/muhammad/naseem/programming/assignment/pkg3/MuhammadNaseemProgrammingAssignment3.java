/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.programming.assignment.pkg3;

import java.util.Scanner;

/**
 * Date: 05/14/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Programming Assignment #3
 */

public class MuhammadNaseemProgrammingAssignment3 {

  //main ()
    
    public static void main(String[] args) {
        Scanner  In = new Scanner (System.in); 
        
//Step 1: Variable Declaration 
      double sales;
        
    //Ask User To Input Number
        System.out.print("Enter the amount you have sold: ");
        sales = In.nextDouble();
        
//Step 2: Calculating The Commission For Each Commision Rate And Display The Information
        
    //Calculating The Commission Value Of $99 Or Less On Sales With 10% Commission Rate
        if (sales <= 90){
            System.out.println("\nYour commission is 10% $" + sales + " in sales.");
            System.out.printf("\n%s%.2f%s", "You earned $", (sales * 0.1), " on commissions!\n");
        }        
    //Calculating The Commission Value Of $100 - $499 On Sales With 20% Commission Rate
        //Using "&&" To Keep The Code Short And Simple
        else if (sales >= 100 && sales <= 499){
            System.out.println("\nYour commission is 20% because you've sold $" + sales + " in sales.");
            System.out.printf("\n%s%.2f%s", "You earned $", (sales * 0.2), " on commissions!\n");
        }   
    //Calculating The Commission Value Of $500 - $999 On Sales With 30% Commission Rate
        //Using "&&" To Keep The Code Short And Simple
        else if (sales >= 500 && sales <= 999){
            System.out.println("\nYour commission is 30% because you've sold $" + sales + " in sales.");
            System.out.printf("\n%s%.2f%s", "You earned $", (sales * 0.3), " on commissions!\n");   
        }    
    //Calculating The Commission Value  Of $1000 Or More On Sales With 40% Commission Rate
        else {
        System.out.println("\nYour commission is 40% because you've sold $" + sales + " in sales.");
        System.out.printf("\n%s%.2f%s", "You earned $", (sales * 0.4), " on commissions!\n");   
        } //end if 
        
    }//end main ()
    
}//end class
