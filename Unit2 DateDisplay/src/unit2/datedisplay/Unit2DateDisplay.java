/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.datedisplay;
import java.util.Scanner;
/**
 * Date: 05/17/2021
 * Name: Muhammad Naseem
 * File: Unit 2 Date Display
 */


public class Unit2DateDisplay {
Scanner  In = new Scanner (System.in); 

    //main 
    public static void main(String[] args) {
       
        //Declare Year, Month, Day
        int year, month, day;
                
        //Ask User For Input Of Year, Month, Day
        System.out.println("Enter Year");
        year = In.nextInt();
        System.out.println("Enter Month");
        month = In.nextInt();        
        System.out.println("Enter Day");
        day = In.nextInt();
        
        //Use Switch Statement To Display Date
        switch(month){
            case 1: System.out.println("January " + day + "," + year);
                    break;
            case 2: System.out.println("January " + day + "," + year);
                    break;
            default: System.out.println("Invalid input for month ");
                    break;
        }
        
    }//end main ()
    
    
}//end class 
