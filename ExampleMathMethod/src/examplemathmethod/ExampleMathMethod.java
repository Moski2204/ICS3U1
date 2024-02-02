/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplemathmethod;

/**
 * Date: 04/29/2021
 * Name: Muhammad Naseem
 * File: ExampleMathMethod.java
 * Function:    
 */
 
public class ExampleMathMethod {

  //main calss ()
    public static void main(String[] args) {
    //How to use Math.pow 
     
    //Step 1: declare variable
        double result, base = 5, power = 2;
        
    //Step 2: find result by calling Math.pow()
        result = Math.pow(base, power);
        
        System.out.println("The result of " + base + " with the power of " + power + " is " + result);
        System.out.println("------------------------------------------------");
    //Example Number 2, How To Use Math.abs, Math.sqrt and Math.pow.
    // Math.abs returns the postive value of a negative number
    // Math.sqrt will only return a double value, and tell you the square root of a number
        int number1, number2, number3, num;
        double num1, num2, sum3, a;
     
        number1 = -5;
        number2 =  16;
        number3 = 10;
        num1 = 4.5; 
        num2 = 52.999;
  
    //DIFFERENT WAYS TO DISPLAY THE RESULT 
        System.out.println("The absolute value of -5 is : " + Math.abs(number1) );
        System.out.println("The square root of 16 is : " + Math.sqrt(number2) );
        System.out.println("10 to the power of 2 is : " + Math.pow(10,2) );
     
    //Math.random generates a random value between 0.0-0.9.
        int diceRoll = (int) (6*Math.random());
        System.out.println(diceRoll);
        System.out.println();
    
    //Cast to int  
        num = (int)(num2);
        System.out.println("num is " + num);
      
    // Cast to double
        a = (double) number2; 
        System.out.println("\na is " + a);
     
    }//end main ()
    
}//end class
