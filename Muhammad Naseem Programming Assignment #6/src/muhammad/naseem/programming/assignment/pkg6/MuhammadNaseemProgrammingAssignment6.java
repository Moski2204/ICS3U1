/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.programming.assignment.pkg6;
import java.util.Scanner;

/**
 * Date:05/30/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Programming Assignment #6
 * Function: Write A Program Using Nested Loop That Will Print 
 * The Following Pattern. Let User Enter For The Maximum Width
 .**/
public class MuhammadNaseemProgrammingAssignment6 {

    //main ()
    public static void main(String[] args) {
       Scanner In = new Scanner (System.in);
      
     //Step 1: Variable Declaration
       int numberOfmaxWidth;
     
     //Step 2: Display Output and Create The Program
        System.out.println("Enter a maxium width:");//asks the user to enter an input and saves it to the "numberOfmaxWidth" variable
        numberOfmaxWidth = In.nextInt();
       
        for (int num = numberOfmaxWidth; num > 0; num--) { //start of nested for loop
            for (int variable = numberOfmaxWidth - num; variable > 0; variable--) {
            System.out.print(" "); //creates spaces before each line
        }//end of nested for loop
  
        for (int length = num; length > 0; length--) { //start of nested if loop
            System.out.print(length);      
        }//end of nested loop
        
            System.out.println(""); //starts next line
            
       }//end of main for loop
             
    }//end main ()
    
}//end class
