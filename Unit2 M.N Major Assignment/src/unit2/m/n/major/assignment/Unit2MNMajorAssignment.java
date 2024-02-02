/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.m.n.major.assignment;
import java.util.Scanner;

/**
 * Date:05/18/2021
 * Name: Muhammad Naseem
 * File: Unit 2 M.N Major assignment
 */

public class Unit2MNMajorAssignment {

  //main ()
    public static void main(String[] args) {
        
    //Step 1: Insert Scanner Class and Declare Variables
      Scanner In = new Scanner (System.in); 
      int nickels, cents, dimes, quarters, QUARters, DIMes, NICKels, Remaining;
      
    //Step 2: Assign Values To Variables 
      QUARters = 25;
      DIMes = 10;
      NICKels = 5;
      Remaining = 1;
      
    //Step 3: Ask The User For An Input
      System.out.println("How many cents do you have?");
      cents = In.nextInt();
      
    //Step 4:
      //Calculate Total Quarters
      quarters = cents/QUARters;
      Remaining = cents % QUARters;
      
      //Calculate Total Dimes
      dimes = Remaining/DIMes;
      Remaining = Remaining % DIMes;
           
      //Calculate Total Cents and Nickels
      nickels = Remaining/NICKels;
      Remaining = Remaining % NICKels;
      
    //Step 5: Display Output
      System.out.print(cents + " cents: ");
      
      if (quarters == 1)
          System.out.print(quarters + " quarter ");
      if (quarters >= 2)
           System.out.print(quarters + " quarters");
      if (quarters >= 1)
          if (dimes >= 1 || nickels >= 1 || Remaining >= 1)
              System.out.print(", ");
      
      if (dimes == 1)
          System.out.print(dimes + " dime" );
      if (dimes >= 2)
          System.out.print(dimes + " dimes");
      if (dimes >= 1)
          if (nickels >= 1 || Remaining >= 1)
              System.out.print(", ");
      
      if (nickels == 1)
          System.out.print(nickels + " nickel" );
      if (nickels >= 2)
          System.out.print(nickels + " nickels");
      if (nickels >= 1)
          if (nickels >= 1 && Remaining >= 1)
              System.out.print(", ");
      
      if (Remaining == 1)
          System.out.print(Remaining + " cent");
      if (Remaining >= 2)
          System.out.print(Remaining + " cents");
     
        // end if   
        
        System.out.print("\n");
        
  }//end main ()
    
}//end class
