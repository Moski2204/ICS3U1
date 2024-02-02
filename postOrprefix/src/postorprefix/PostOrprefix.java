/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postorprefix;

/**
 * Date: 05/3/2021
 * Name: Muhammad Naseem
 * File: postOrprefix
 * Function:    
 */
public class PostOrprefix {

   //main ()
   public static void main(String[] args) {

        int i = 1;
        int j = 4;
        
    //Prefix: ++j 
    // Postfix: j++
        
    // 5 * 2 + 6 * 3 + 7 * 4 = 56
    //++j increases by 1 left to right the more you use it.
        i = (++j * 2 + ++j * 3 + ++j * 4);  
        
        //Rempve this to see the answer for the one above ^
        i = (j++ * 2 + j++ * 3); //i = 4 * 2 + 5 * 3 = 8 + 15 = 23 
        
        System.out.println("i is " + i);
        System.out.println("j is " + j);
        
        
        int I = 1;
        int J = 4;
        
        J = 3*j-- + 2*j--; //J = 3 * 4 + 2 * 3 = 12 + 6 = 18
        
        System.out.println("I is " + I);
        System.out.println("J is " + j);
        
    } //end main () 
    
}//end class
