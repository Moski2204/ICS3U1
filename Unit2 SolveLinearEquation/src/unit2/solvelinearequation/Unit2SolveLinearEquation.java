/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2.solvelinearequation;
import java.util.Scanner;
/**
 * Date: 05/12/2021
 * Name: Muhammad Naseem
 * File: Unit 2: SolveLinearEquation
 */
public class Unit2SolveLinearEquation {

    //main ()
    public static void main(String[] args) { 
    Scanner In = new Scanner (System.in);  
        
       int  a, b;
       double x;
       
       System.out.println("Enter  value for a");
       a = In.nextInt();
       System.out.println("Enter  value for b");
       b = In.nextInt();
     
       if (a !=0){
           x = (double) - b/a;
           System.out.printf("The solution is: %.2f.\n");
       }
       else 
           System.out.println("a is 0.");
       
    }//end main ()    
    
}//end class
