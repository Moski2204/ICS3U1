/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charexample;

/**
 * Date: 05/04/2021
 * Name: Muhammad Naseem
 * File: CharExample
 * Function: Examples of how to use char in java    
 */
public class CharExample {

    //main ()
    public static void main(String[] args) {
    char letter = 'z';
    int number = 121; 
    
    letter = (char) number;
    
    number = letter - 'A';
    
    letter = '<' + '<';
    
    System.out.println(letter);
    System.out.println(number);
    
    }// end main ()
    
}// end class ()
