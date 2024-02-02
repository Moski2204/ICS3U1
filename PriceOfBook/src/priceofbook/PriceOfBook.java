/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priceofbook;
import java.util.Scanner;

/**
 * Date: 05/06/2021
 * Name: Muhammad Naseem
 * File: PriceOfBook
 * Function: The Program Is To Find The Price Of The Book With Discount And Tax
 */

public class PriceOfBook {
//main ()
    public static void main(String[] args) {
    Scanner In = new Scanner (System.in);
     
    //Step 1 Declare Variables
     double OrgPrice, discountRate, discountPrice, tax, finalPrice;
     
     //Step 2 Ask User To Input Values And Calculate Book Price 
     System.out.println("Enter the price of the book:");
     OrgPrice = In.nextDouble();
     System.out.println("Enter the discount rate in %:");
     discountRate = In.nextDouble();
     
    //Calculate Price With Equation
    discountPrice = OrgPrice * (1 - discountRate/100);
     
     //Find Tax
     tax = OrgPrice * 0.13;
     
     //Find The Final Price
     finalPrice = OrgPrice + tax;
     
     //Display the output
     System.out.printf("\n%-20s%.2f\n", "Book Price:", OrgPrice);
     System.out.printf("%-20s%.2f\n", "Discount:", OrgPrice * discountRate );
     System.out.printf("%-20s%.2f\n", "Discounted Price:", discountPrice );
     System.out.printf("%-20s%.2f\n", "Tax:", tax);
     System.out.println("--------------------------");
     System.out.printf("%-20s%.2f\n", "Final Price:", finalPrice);
     
    }//end main ()
    
}//end class
