/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightlost;
import java.util.Scanner;
/**
 * Date: 05/07/2021
 * Name: Muhammad Naseem
 * File: WeightLost  
 * Function:
 */
public class WeightLost {

    //main ()
    public static void main(String[] args) {
    Scanner In = new Scanner (System.in);    
   
    //Step 1: Declare Variables
    double hoursBcyl, hoursJog, hoursSwim, totalWeightLost;
    
    //Ask User To Input Hours For Each
    System.out.println("Enter hours for Swimming:");
    hoursSwim = In.nextDouble();
    System.out.println("Enter hours for Bicycling:");
    hoursBcyl = In.nextDouble();
    System.out.println("Enter hours for Jogging:");
    hoursJog = In.nextDouble();
    
    //Calculate total weight lost
     totalWeightLost = (hoursSwim * 275 + hoursBcyl * 200 + hoursJog + 475)/3500;
    
    //Display The Information
    System.out.printf("The weight lost is %.2f pounds: ", totalWeightLost);
    
    System.out.println("The dog said, \"Hello."\");
    }//end main ()
    
}//end class
