/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3.m.n.major.assignment.pkg3.a;
import java.util.Scanner;

/**
 * Date:05/26/2021
 * Name: Muhammad Naseem
 * File: Unit3 M.N Major Assignment #3 A
 * Function: Create A Program That Solves The Riddle. Write A Program That Will Modify The Riddle Program In Part A
 */

public class Unit3MNMAJORASSIGNMENT3A {

   //main ()
    public static void main(String[] args) {
      Scanner In = new Scanner (System.in);
      
    //Step 1: Variable Declaration  
     int variable, days;
     double Climb, Well, Again, Fall, Total;
     char repeat = 'y';
     
     while (repeat != 'n' && repeat != 'N'){//start of main while loop
         
     //Resets Variables For Next Loop (If User Wants To Play Again)
           days = 0;
           Well = 0;
           Climb = 0;
           Fall = 0;
          
        do {
            System.out.println("How many meters deep is the well?");//asks user for an input and saves it to the Well variable
            Well = In.nextDouble();
            if (Well > 0 )//ends loop if user does not input a number/value that is greater than 0
                System.out.println("The wall is " + Well + "m deep.\n");
            else //restarts loop and asks user to re-enter a value
            System.out.println("\nEnter a number higher than 0.\n");
        }
        while (Well < 1);
       
        Total = Well;    
            
    //Step 2: Asks User To Input How Many Meters Is The Frog Going To Climb Each Day?
     
        do {   
            System.out.println("How many meters is the frog going to climb each day?");//asks the user for an input and saves it to the Climb variable
            Climb = In.nextDouble();
            if (Climb > 0) //ends loop if user does not input a number/value that is greater than 0
                System.out.println("The frog will climb " + Climb + "m.\n");
            else //restarts loop and asks user to re-enter a value
            System.out.println("\nEnter a number higher than 0.\n");
        }
        while (Climb < 1);
           
    //Step 3: Asks User To Input How Many Meters Does The Frog Fall Daily?
        do {
            System.out.println("How many meters does the frog fall daily?");//asks the user for an input
            Fall = In.nextDouble();
            if (Fall >= 0 && Climb > Fall) //ends loop if user does not input a number/value that is greater than 0
                System.out.println("The frog will fall " + Fall + "m per day.");
            else //restarts loop and asks user to re-enter a value
            System.out.println("\nEnter a number that is higher than 0, but is lower than the climb meters per day.");
        }
        while (Fall >= Climb || Fall < 0);
           
    //Step 4: Calculate And Display The Output     
     
        do {
          days = days + 1;
          Total = Total - (Climb - Fall);
        }
        while (Total > Climb);
        
        days = days + 1;
        variable = days%10; //detects when to use nd, th, or st
      
        if (variable == 1 && days != 11) 
                System.out.println("\nThe frog climbed out of the well on the " + days + "st day.");  
        else if (variable == 2 && days != 12)
                System.out.println("\nThe frog climbed out of the well on the " + days + "nd day."); 
        else if(variable == 3 && days != 13)
                System.out.println("\nThe frog climbed out of the well on the " + days + "rd day.");
        else    
                System.out.println("\nThe frog climbed out of the well on the " + days + "th day.");
        
           //If The User Wants To Decide To Play Again
           
        do {
            System.out.println("\nWould you like to play again?\n\nY = Yes\nN = No\n");//asks the user for an input to play again
            repeat = In.next(".").charAt(0);
            if (repeat == 'y' || repeat == 'Y')
                System.out.println("\nTHE GAME IS RESTARTING...\n");
            else if (repeat == 'n' || repeat == 'N')
                System.out.println("\nGAME OVER!");
            else 
                System.out.println("Enter Y or N");                        
        }
          while (repeat != 'y' && repeat != 'y' && repeat != 'n' && repeat != 'N');
       
     }//end of main while
      
   }//end main ()
  
}// end class
