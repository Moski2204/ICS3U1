/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3.whileexample;

import java.util.Scanner;

/**
 *
 * @author mahru
 */
public class Unit3WhileExample {

    //main ()
    public static void main(String[] args) {
      Scanner In = new Scanner (System.in);
      
        int input, password = 1234, age;               
        
        // step 1. initialize "age" 
        System.out.print ("Enter age: ");
        age = In.nextInt ();        
        
        // step 2. set boolean expression
        while (age >= 18)
        {
            //ask user enter value repeatedly until 0
            System.out.println ("You age: " + age + ". You can vote.");
            age = In.nextInt ();  //step 3. change value of age                 
        }
        
        System.out.println ("You age: " + age + ". You can not vote.");
         //stop loop when num == 0
         
      
   
        //Step 1: Declare and Initial For "number:
        int number = 1,  sum = 0;
            
        //Step 2: Set Up The Boolean Expression For While () Loop
        while (number <=5){
            System.out.println(number);
        
        //Step 3: Update Value For "number" 
        sum = sum + number; //add number to sum 
        number++;
        
    }
    
        System.out.println("The sum is " + sum);
           
    }//end main ()
}//end class


