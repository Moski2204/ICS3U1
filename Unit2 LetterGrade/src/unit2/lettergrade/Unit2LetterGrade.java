/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.lettergrade;
import java.util.Scanner;

/**
 * Date: 05/12/2021
 * Name: Muhammad Naseem
 * File: Unit 2 LetterGrade
 */
public class Unit2LetterGrade {

    //main ()
    public static void main(String[] args) {
       Scanner  In = new Scanner (System.in); 
       
       //Step 1:
       int mark;
       
       //Step 2:
       System.out.println("Enter ");
       mark = In.nextInt();
        
       //Step 3:
       if (mark < 50) //check F
            System.out.println("Grade: F");
        else if (mark <= 61) //check 50---> 60---> D
            System.out.println("Grade: D ");
        else if (mark <= 70) //check 60---> 69---> C
            System.out.println("Grade: C");
        else if (mark <= 80) //check 70---> 79---> B
            System.out.println("Grade: B");
        else if (mark <= 90) //check 80---> 90---> A
            System.out.println("Grade: A");
        else  //check mark > 91
            System.out.println("Grade: A+");
       
    }//end main ()
    
}// end class
