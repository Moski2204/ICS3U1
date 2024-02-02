/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.programming.assignment.pkg4;

import java.util.Scanner;

/**
 * Date:05/26/2021
 * Name: Muhammad Naseem
 * File: Programming Assignment #4
 * Function: Create A Program That Asks The User To Enter A Set Of Integers One At A Time, Using Zero As The End 
 * Of Output
 */

public class MuhammadNaseemProgrammingAssignment4 {

  //main ()
    public static void main(String[] args) {
      Scanner In = new Scanner (System.in);
      
      //Step 1: Variable Declaration
      int newNum, oldNum, numbers = 0;      
      
      //Step 2: Ask User To Input A Number That Is Not 0
      System.out.println("Enter your first number:");
      oldNum  = In.nextInt();
      
      //Step 3: Display Output And Create The Program
     while (oldNum !=0) { //loop will stop once the user inputs the number 0
        System.out.println("Enter your second number:");//asks user to input a second number 
        newNum = In.nextInt();
        if (oldNum == newNum)
            ++numbers; //adds more consecutive numbers if the user inputs the first number again
        oldNum = newNum;
     }
      System.out.println("You have " + numbers + " consecutive numbers.");//displays the amount of consecutive numbers to the user 
      
   }//end main ()
    
}//end class
 