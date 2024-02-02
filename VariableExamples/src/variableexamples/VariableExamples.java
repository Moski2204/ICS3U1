/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableexamples;

/**
 * Date: 04/28/2021
 * Name: Muhammad Naseem
 * File: VariableExamples
 * Function: How to show variables in Kava program
 */
public class VariableExamples {

    //main ()
    public static void main(String[] args) {
    
//Step 1
    
   //Variable declarations
    String name;
    int age, student_Number;
    double cost, tax;
    char letter;
    boolean flag;
            
    
//Step 2 assign values to variables and process 
    name = "Bob";   
    age = 16;
    student_Number = 123456789; 
    cost = 30;
    flag = true;
    letter = 'y';
    
    tax = cost * 0.13; //find tax of cost using 13% rate  
    
    //Display the informatiion
    System.out.println("Your name is " + name);
    System.out.println("Your age is " + age);
    System.out.println("Your student number is " + student_Number);
    System.out.println("Your cost is " + cost);
    System.out.println("flag is " + flag);
    System.out.println("Your letter is " + letter);
    System.out.println("tax  is " + tax);
    
    }//end main ()
     
}// end class ()
