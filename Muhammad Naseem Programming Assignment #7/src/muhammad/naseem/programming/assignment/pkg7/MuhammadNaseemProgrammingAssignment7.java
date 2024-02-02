/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.programming.assignment.pkg7;

/*************************
 * Date: 06/03/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Programming Assignment #7
 * Function: Write A Complete Java Program To Test 
 * The Method printTriangle That Has A Char Parameter c and an int parameter n.
 *************************/

public class MuhammadNaseemProgrammingAssignment7 {

    //main()
    public static void main(String[] args) {
        printTriangle('*', 5);     
    }//end main
    
    //method printTriangle():
    public static void printTriangle (char c, int n)
            
    {//start of printTriangle () method   
        
        for (int numberOfrows = 1; numberOfrows <= n; numberOfrows++) //this line of controls the number of rows shown in the output
        {//start of outer loop     
             if (numberOfrows == 1 || numberOfrows == 5 || numberOfrows == n) 
            {//start of if       
                for (int output = 1; output <= numberOfrows; output++)
                System.out.print(c); //displays char c     
            }//end of if
     
            else 
                 
            {//start of else 
                System.out.print(c); //displays starting char c              
                for (int spaces = 1; spaces <= numberOfrows - 2; spaces++)
                    System.out.print(" "); //prints a space
                System.out.print(c); //displays ending char c
            }//end of else
     
            System.out.println();
            
        }//end of outer loop

    }//end printTriangle () method
    
}//end class
