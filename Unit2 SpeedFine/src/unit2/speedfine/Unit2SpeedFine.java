/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.speedfine;
import java.util.Scanner;
/**
 * Date: 05/12/2021
 * Name: Muhammad Naseem
 * File: Unit 2 SpeedFine
 */
public class Unit2SpeedFine {

    //main ()
    public static void main(String[] args) {
        Scanner  In = new Scanner (System.in);  
        
        //Step 1:
        int overSpeed; 
        
        //Step 2:
        System.out.println("Enter the amount of over speed limit:");
        overSpeed = In.nextInt();
        
        //Step 3:
        if (overSpeed <= 10) //check over limit  between 1 - 9 
            System.out.println("Warning: Speed over the limit but less than 10.");
        else if (overSpeed < 21) //check over limit 10-20
            System.out.println("Fine: $80! ");
        else if (overSpeed < 41) //check over limit 21-40
            System.out.println("Fine: $200!!");
        else   //check over  limit >= 41
            System.out.println("Fine: $375!!!");
        
        if (overSpeed > 40) //check over limit > 40 
            System.out.println("Fine: $375!!!");
        else if (overSpeed > 20) //check over limit for 21-40
            System.out.println("Fine: $200!! ");
        else if (overSpeed > 9) //check over limit for 10-20
            System.out.println("Fine: $80!");
        else   //check over  limit >= 41
            System.out.println("Warning: Speed over the limit but less than 10.");
        
        
    }//end main ()
    
}//end class
