/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3.finddigitsandsum;
import java.util.Scanner;
/**
 * Date: 05/21/2021
 * Name: Muhammad Naseem
 * File: FInd Digits And Sum
 */
public class Unit3FindDigitsAndSum {

  //main ()
    public static void main(String[] args) {
      Scanner In = new Scanner (System.in);
        
        //declare variables for program
        int number, digit, sum=0, temp;
        
        //ask user to enter "number"
        System.out.println("Enter a positive integer:");
        number = In.nextInt();
        temp = number;
        //use while() loop to find digits of "number" and sum the digits
        //loop running while number is not a single digit
        while (number/10 != 0){ 
            digit = number%10;  //find last digit of number
            System.out.println(digit);
            sum += digit;  //add digit found to sum
            number = number/10; //get rid of the last digit
        }
        
        //get the last digit or number is a single digit
        System.out.println(number);
        sum += number;
        System.out.println("The sum of the digits of number " + temp + " is " + sum);

    }//end main ()
    
}//end class
