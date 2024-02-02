/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.program.assignment.pkg1;

/**
 * Date: 04/29/2021
 * Name: Muhammad Naseem
 * File: MuhammadNaseemProgramAssignment1.java
 * Function:Program Assignment 
 */
public class MuhammadNaseemProgramAssignment1 {

  //main ()
    public static void main(String[] args) {
       
    //Step 1: Variable declaration
        double Dinner, Dessert, Musical, Drinks, Coffee, tax, Totalcostbeforetax, GrandTotal;
        
    //Step 2: Assign the values to the variables
        Dinner = 87.75;
        Dessert = 19.20;
        Musical = 200.00;
        Drinks = 35.00;
        Coffee = 8.46;
        tax = 1.13;
          
    //Step 3: Finding the total cost before tax
        Totalcostbeforetax = Dinner + Dessert + Musical + Drinks + Coffee;
        
    //Step 4: Finding the grand total
        GrandTotal = Totalcostbeforetax * 1.13;
        
    //Step 5 Display the information
    
         //This code from line 39-42 will make the output look like a reciept. 
         System.out.println("                Mike's Bar and Grill           ");
         System.out.println("-------------------------------------------------------");
         System.out.println("                     Receipt                   ");
         System.out.println("-------------------------------------------------------");
         
        //The Name and Prices Of The Items.
         System.out.println("                 Dinner:  $" + Dinner);
         System.out.println("                 Dessert: $" + Dessert);
         System.out.println("                 Musical: $" + Musical);
         System.out.println("                 Drinks: $" + Drinks);
         System.out.println("                 Coffee: $" + Coffee);
         
         //The Prices Of Each Items After Tax.
         System.out.printf("\n             Dinnner after tax = $%.2f", Dinner * (tax - 1));
         System.out.printf("\n             Dessert after tax = $%.2f", Dessert * (tax - 1));
         System.out.printf("\n             Musical after tax = $%.2f", Musical *(tax - 1));
         System.out.printf("\n              Drinks after tax = $%.2f", Drinks * (tax - 1));
         System.out.printf("\n              Coffee after tax = $%.2f", Coffee * (tax - 1));
        
         //The Total Cost Of All The Items Before Tax.
         System.out.println("\n-------------------------------------------------------");
         System.out.printf("                Total cost = $%.2f", Totalcostbeforetax);
       
         //The Total Amount Of Tax.
         System.out.printf("\n            Total amount of tax = $%.2f\n" , Totalcostbeforetax * (tax - 1) );
         
         //The Grand Total.
         System.out.println("-------------------------------------------------------");
         System.out.printf("                Grand total =  $%.2f \n\n", GrandTotal);
         
    }//end main ()
    
}//end class
