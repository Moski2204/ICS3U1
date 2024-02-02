/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.program.assignment.pkg2;
import java.util.Scanner;

/**
 * Date: 05/06/2021
 * Name: Muhammad Naseem
 * File: MuhammadNaseemProgramAssignment#2  
 * Function: Write a Java program that asks for a length of time in hours 
 */

public class MuhammadNaseemProgramAssignment2 { //Start Of Class

//main ()
    public static void main(String[] args) { 
    Scanner In = new Scanner (System.in);
    
//Step 1: Variable Declaration
    double InputUserHour, AnyNumber, num4, num5, num6;
    int RealHour, minutes, seconds;
    
//Step 2: Ask User To Input Length Of Time          
    System.out.print("Insert length of time in hours: ");
    InputUserHour = In.nextDouble();
    
//Step 3: Output Will Be In No Decimals And Saves Decimal Numbers To A New Variable
    RealHour = (int) InputUserHour;  
    AnyNumber = InputUserHour - RealHour;

//Step 4: Converting Seconds To Minutes   
    num4 = AnyNumber * 3600;
    num5 = (num4 / 60);
    minutes = (int) num5;
    
//Step 5: Finding The Amount Of Seconds And Rounding It To The Nearest Whole Number
    num6 = (num4 % 60);
    num6 = Math.round(num6);
    seconds = (int) num6;
   
//Display The Information
    System.out.printf(InputUserHour + " hours = ");
    System.out.printf(RealHour + " hours, ");
    System.out.printf(minutes + " minutes, ");
    System.out.println(seconds + " seconds ");
    
   }//end main() 
  
}//end class
    
