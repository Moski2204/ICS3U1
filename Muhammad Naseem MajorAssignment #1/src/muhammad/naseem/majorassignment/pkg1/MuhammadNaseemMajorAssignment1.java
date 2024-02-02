/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.majorassignment.pkg1;
import java.util.Scanner;
/**
 * Date: 05/10/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Major Assignment 1
 */
public class MuhammadNaseemMajorAssignment1 { //Start Of Class

//main ()
  public static void main(String[] args) {
    Scanner In = new Scanner (System.in);  
    
//Step 1: Variable Declaration
   double tax = 0.15, totalTax, GrandTotal, totalPrice, firstPrice, secondPrice, thirdPrice, fourthPrice, firstTax, secondTax, thirdTax, fourthTax, firstTotal, secondTotal, thirdTotal, fourthTotal;
   String name, itemOne, itemTwo, itemThree, itemFour;
    
//Step 2: Ask User to Input The Price and Name Of The Four Items. 
   System.out.print("Enter your name: ");
   name = In.next();
    
   System.out.printf("Item #1: ");
   itemOne = In.next();
   System.out.printf("Price of item one: ");
   firstPrice = In.nextDouble();
    
   System.out.printf("Item #2: ");
   itemTwo = In.next();
   System.out.printf("Price of item two: ");
   secondPrice = In.nextDouble();
   
   System.out.printf("Item #3: ");
   itemThree = In.next();
   System.out.printf("Price of item three: ");
   thirdPrice = In.nextDouble();
    
   System.out.printf("Item #4: ");
   itemFour = In.next();
   System.out.printf("Price of item four: ");
   fourthPrice = In.nextDouble();
    
//Step 3: Calculate The Tax on Each Item
   firstTax = firstPrice * tax;
   secondTax = secondPrice * tax;
   thirdTax = thirdPrice * tax;
   fourthTax = fourthPrice * tax;
    
//Step 4: Calculate Total Tax
   totalTax = firstTax + secondTax + thirdTax + fourthTax;
    
//Step 5: Calculate The Price Of Each Item With Tax.
   firstTotal = firstPrice + firstTax;
   secondTotal = secondPrice + secondTax;
   thirdTotal = thirdPrice + thirdTax;
   fourthTotal = fourthPrice + fourthTax;
    
//Step 6: Calculate The Total Price without tax
   totalPrice = firstPrice + secondPrice + thirdPrice + fourthPrice;
    
//Step 7: Calculate The Total Price With Tax  
   GrandTotal = totalPrice + totalTax;
    
//Seperate The User Input Withh The Output 
   System.out.println("");
   System.out.println("");
    
//Step :Display The Information (Output)
    
   System.out.println("\t\tSales Summary for " + name);
   System.out.println("      ---------------------------------------------");
   System.out.printf("Item");
   System.out.printf("%17s", "Price($)");
   System.out.printf("%19s", "Tax($)");
   System.out.printf("%17s\n", "Total($)");
   
   System.out.println("-----------------------------------------------------------");
    
   System.out.printf(itemOne);
   System.out.printf("%15.2f", firstPrice);
   System.out.printf("%19.2f", firstTax);
   System.out.printf("%17.2f\n", firstTotal);
    
   System.out.printf(itemTwo);
   System.out.printf("%18.2f", secondPrice);
   System.out.printf("%19.2f", secondTax);
   System.out.printf("%17.2f\n", secondTotal);
    
   System.out.printf(itemThree);
   System.out.printf("%18.2f", thirdPrice);
   System.out.printf("%19.2f", thirdTax);
   System.out.printf("%17.2f\n", thirdTotal);
    
   System.out.printf(itemFour);
   System.out.printf("%11.2f", fourthPrice);
   System.out.printf("%19.2f", fourthTax);
   System.out.printf("%17.2f\n", fourthTotal);
    
   System.out.println("-----------------------------------------------------------");
   System.out.printf("Grand Total");
   System.out.printf("%10.2f", totalPrice);
   System.out.printf("%19.2f", totalTax);
   System.out.printf("%17.2f\n", GrandTotal);
    
    }//end main ()
    
}//end class
