/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.weightedscire;
import java.util.Scanner;

/**
 * Date: 05/17/2021
 * Name:Muhammad Naseem
 * File: Unit 2 Weighted Scale
 */
public class Unit2WeightedScire {

   //main ()
    public static void main(String[] args) {
        Scanner  In = new Scanner (System.in);
      
      //Step 1: Variable Declaration 
      int testNumber;
      double   testMark, weightedMark, weightPercent = 0.0;
      
      //Step 2: Ask User for Input  
      System.out.println("Enter test number:");
      testNumber = In.nextInt();
      System.out.println("Enter test mark:");
      testMark = In.nextDouble();
      
      //Step 3: Use Switch To Decide The Percentage Of Each Test Weighted  
      switch (testNumber) {
          case 1: weightPercent = 0.1;
                  break;
          case 2:
          case 3:
          case 6: weightPercent = 0.2;
                  break;
          case 4:
          case 5: weightPercent = 0.15;
                  break;
          default: System.out.println("Invalid test number");
       
      }
      
      //Step 4: Calculate weighted Score
      weightedMark = testMark * weightPercent;
      
      //Step 5: Display Output  
      System.out.printf("A score of %f on test %d gives a weighted score of %.2f.\n", testMark, testNumber, weightedMark);
         
    }
    
}
