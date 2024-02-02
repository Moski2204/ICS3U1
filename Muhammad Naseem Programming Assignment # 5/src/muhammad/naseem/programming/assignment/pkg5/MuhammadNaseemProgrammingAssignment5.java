/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.programming.assignment.pkg5;
import java.util.Scanner;

/**
 * Date:05/27/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Programming Assignment #5
 * Function: Write a program to find both the thickness of the pile and the area 
 * of each piece after the procedure has been carried out forty times.
 */

public class MuhammadNaseemProgrammingAssignment5 {

    //main ()
    public static void main(String[] args) {
        Scanner In = new Scanner (System.in);
        
        //Step 1: Variable Declaration
        double area = 1, thickness = 0.09;
        int cutinhalf;
        
        //Step 2: Create The Program By Creating A For Loop
        for (cutinhalf = 1; cutinhalf <= 40; ++cutinhalf){
            area = area / 2;
            thickness = thickness * 2;
        }//end of for loop
        
        //Step 3: Display Output
        System.out.println("After 40 folds, the paper pile has a thickness of " + thickness +  " mm,");
        System.out.println("and an area of " + area + " m^2.");
        
        }//end main ()
    
}//end class 
