/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timestableformat;
import java.util.Scanner;
/**
 * Date: 05/05/2021
 * Name: Muhammad Naseem
 * File: TimesTableFormat
 * Function: How To Create A Table 
 */ 
    
public class TimesTableFormat {
Scanner In = new Scanner (System.in);

    //main class ()
    public static void main(String[] args) {
       
      System.out.printf("%8s%8s%8s%8s%8s%8s\n",1,2,3,4,5,6);
       System.out.printf("%8s%8s%8s%8s%8s%8s\n",2,2*2,2*3,2*4,2*5,2*6);
       System.out.printf("%8s%8s%8s%8s%8s%8s\n",3,3*2,3*3,3*4,3*5,3*6);
       System.out.printf("%8s%8s%8s%8s%8s%8s\n\n",1,2,3,4,5,6);  
    
       System.out.println("              Western Music\n");
       
       System.out.printf("%2s%12s%5s%2s%-8.2f%2s%4s%8s\n\n", 3, "Guitars", "at", "$", 350.00, "=", "$", 3*350.00);
       System.out.printf("%2s%12s%5s%2s%-8.2f%2s%4s%8s\n\n", 2, "Keyboards", "at", "$", 1250.00, "=", "$", 2*1250.00);
       System.out.printf("%2s%12s%5s%2s%-8.2f%2s%4s%8s\n\n  ", 1, "Amplifier", "at", "$", 195.00, "=", "$", 3*195.00);
        
    }//end main ()  
    
}//end class    
