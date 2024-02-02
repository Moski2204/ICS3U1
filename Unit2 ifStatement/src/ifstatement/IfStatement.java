/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;

import java.util.Scanner;

/**
 *
 * @author liboo
 */
public class IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  In = new Scanner (System.in);
        
        double temp;
        boolean freezing;

        //Getting temperature from user
        System.out.println ("Enter the temperature.");
        temp = In.nextDouble ();

        
        /*if Statement
        if (temp <= 0)
            System.out.println ("It is freezing!");*/

       
        /*if else statement with one statement
        if (temp <= 0)
            System.out.println ("It is freezing!");
        else
            System.out.println ("It is above freezing."); */


        //Multiple statements
        if (temp <= 0)
        {
            System.out.println ("It is freezing!");
            freezing = true;
        }
        else
        {
            System.out.println ("It is above freezing.");
            freezing = false;
        }
        
        System.out.println (freezing); 

    }
    
}
