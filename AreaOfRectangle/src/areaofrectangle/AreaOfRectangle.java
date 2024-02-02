/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofrectangle;
import java.util.Scanner;
/**
 * Date: 05/04/2021
 * Name: Muhammad Naseem
 * File: AreaOfRectangle
 * Function: Finding Area of a Rectangle 
 */
public class AreaOfRectangle {

    //main class ()
    public static void main(String[] args) {
      Scanner In = new Scanner (System.in);
        //Step 1: Declare Variables (double) Needed For Program
        double length, width, area;
        
        //Step 2:Get Values For The Variables From The User 
        System.out.println("Enter length:");
        length = In.nextDouble();
        System.out.println("Enter width:");
        width = In.nextDouble();
        
        //Find The SArea Of The Rectangle
        area = length * width;
        
        //Step 3: Display The Sum Of The Two Numbers
        System.out.println("\nThe area of " +length + " and " + width + " is " + area);
        
    }//end main ()
    
}//end class
