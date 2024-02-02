/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputexample2;

/**
 * Date: 04/27/2021
 * Name: Muhammad Naseem
 * File: OutputExample2
 * Function: Format Output
 */
public class OutputExample2 {
    
    public static void main(String[] args) {// start class
      
    // calculate with numbers
        System.out.println(2+3);
        System.out.println("2-3"); // using "" will display a message 
        System.out.println(2*3);
        System.out.println(2/3);
        System.out.println(2.0/3.0); 
        
    // find the remainder  of 9/2, use module operator "%" (percent symbol)
        System.out.println(9 % 5);
        
    //how to combine a message
    //Remember, java follows the rule of bedmas
        System.out.println("2 * 3 = " + 2 * 3 ); // Multiplacation
        System.out.println("2 / 3 = " + 2 / 3 ); // Division
        System.out.println("2 % 3 = " + (2 & 3) ); // Remainder
        System.out.println("2 + 3 = " + (2 + 3) ); // Addition
        System.out.println("2 - 3 = " + (2 - 3) ); // Subtraction
        
    // Numbers after "6" are used as texts 
    // Numbers before "6" are adding up
         System.out.println(2 + 3 + 5 + "6" + 9 + 23);
         
    // If you put a string first, the rest of the line will become a string and not a text
         System.out.println("2" + 3 + 5 + 6 + 9);
        
    }//end class
    
}// end class
