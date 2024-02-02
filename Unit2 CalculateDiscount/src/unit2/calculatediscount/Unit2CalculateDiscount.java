/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.calculatediscount;
import java.util.Scanner;
/**
 * Date: 05/12/2021
 * Name: Muhammad Naseem
 * File: Unit 2 LetterGrade
 */

public class Unit2CalculateDiscount {

    //main ()
    public static void main(String[] args) {
        Scanner  In = new Scanner (System.in);
        
        //Step 1
        int age;
         
        //Step 2
        System.out.println("Enter age of child:");
        age = In.nextInt();
        
        //Step 3
        if (age < 2){ // less than 2 years old
            System.out.println("Discount rate: 100%");
            System.out.println("Your ticket price is $0.");
        }
        else if (age < 6){ // 2 to 5 years old
            System.out.println("Discount rate: 50%");
            System.out.println("Your ticket price is $" + 2000*0.5);
        }
        else if (age < 12){ // 6 to 11 years old
            System.out.println("Discount rate: 20%");
            System.out.println("Your ticket price is $" + 2000*0.8);
        }
        else{  //12 years and older
            System.out.println("Discount rate: 0%");
            System.out.println("Your ticket price is $2000.");
        } //end if

    }//end main()
    
}//end class
