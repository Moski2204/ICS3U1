/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.reader;
import java.io.*;

/*************************
 * Date: 06/14/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Programming Assignment #9
 * Function: Write A Program That Takes A Single Word and Use It To Form A Simple Square Form
 *************************/

public class ReaderFile {

    //main ()
    public static void main(String[] args) {
    try
        {//start try ()
            
            // create an input stream using an object "fr" of "FileReader" class
           FileReader fr = new FileReader ("C:\\Users\\mahru\\Desktop\\ReaderFile\\DataTxt.Txt");
            
            //Buffer the data from "fr" using an object "br" of class "BufferedReader"
            BufferedReader br = new BufferedReader (fr);

            //use to store one line at a time from file
            String lineData = null;

            //read from buffer by using readline method, it returns "null" at the end of file
            while ( ( lineData = br.readLine ()) != null)
            {
                displayWord (lineData);
                System.out.println();          
            
            }//end while loop
            
            //close buffer
            br.close ();
        }// end try ()

        //catch exceptions
        catch (IOException e)
        {
            System.out.println ("Cannot find file. ");
        }
  
    }//end main ()
    
 public static void displayWord(String word)           
    {//Start displayWord ()
   
   //Step 1: Prints The First Line
   System.out.print("* ");
   for (int i=0; i<word.length(); i++){//start for loop
       
       System.out.print(word.charAt(i) + " "); //prints the first line
             
   }//end for loop
   System.out.println("*");
   System.out.print("");
   
   //Step 2: Prints The Middle Line
    for (int i = 0; i < word.length(); i++) {//start for loop
         
       System.out.println(word.charAt(word.length() - 1- i) + stars(word.length()) + word.charAt(i));
    }//end for loop
    
    //Step 3: Prints The Last Line
    System.out.print("* ");
    //reversing step 1 using decerasing order of 1
    for (int i = word.length() - 1; i > -1; i--) {//start for loop
            
       System.out.print(word.charAt(i) + " ");
    }//end for loop
    
    System.out.print("*");
    System.out.println(" ");
   }//end displayWord () 
     
 //this code returns a string with n number of stars 
    public static String stars(int n) {//start string stars ()
        
        String s = " ";
        for (int i = 0; i < n; i++) {
            s += "* ";
        }
        return s;
    }//end Sting starts ()
    
}//end class

