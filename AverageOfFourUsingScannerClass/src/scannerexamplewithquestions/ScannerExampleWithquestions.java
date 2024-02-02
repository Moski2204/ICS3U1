/**
 * Date: 05/05/2021
 * Name: Muhammad Naseem
 * File: AverageOfFourUsingScannerClass
 * Function: Finding average of marks with names using scanner 
 */
package scannerexamplewithquestions;

import java.util.Scanner;

public class ScannerExampleWithquestions {
    
  //main class ()
    public static void main(String[] args) {
    Scanner In = new Scanner (System.in);
        
    /* Write a program that asks for a person’s name and their marks in 4 different classes. The
program should then calculate the average of 4 classes and print out a message that 
includes the person’s name and average mark. Limit average to zero decimal place. 
Example output should be: “Jack, you average mark of 4 classes is 65”. */
    
   //Step 1 Variable Declaration
   String name;
   double mark1, mark2, mark3, mark4, averageMark;
   
   //Get Values From User Using Scanner  In() and Then Calculate Average
   System.out.println("Enter your name");
   name = In.nextLine();
   System.out.println("Enter mark1:");
   mark1 = In.nextDouble();
   System.out.println("Enter mark2:");
   mark2 = In.nextDouble();
   System.out.println("Enter mark3:");
   mark3 = In.nextDouble();
   System.out.println("Enter mark4:");
   mark4 = In.nextDouble();
    
   averageMark = (mark1 + mark2 + mark3 + mark4)/4; 
   
   System.out.printf("%-8s average out of the four marks is %.0f\n ",name, averageMark);
   //Another Way To Display Using Println
   System.out.println(name + " average out of the four makrs is: " + Math.round(averageMark));
    
  }//end main ()
    
}//end class    
