/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhammad.naseem.programming.assignment.pkg8;
import java.util.Scanner;

/*************************
 * Date: 06/07/2021
 * Name: Muhammad Naseem
 * File: Muhammad Naseem Programming Assignment #8
 * Function: Calendar.
 *************************/
public class MuhammadNaseemProgrammingAssignment8 {

    //main ()
    public static void main(String[] args) {      
    Scanner In = new Scanner (System.in);   
    System.out.print("Input any day of the month: ");
    int days = In.nextInt();
    System.out.print("Input any day of the week: ");
    String weekDay;
    weekDay = In.next();
    monthCalendarExample(days, weekDay);
    }//end main ()
       
    //monthCalendarExample()
    public static void monthCalendarExample(int days, String weekDay){      
        int space = 0;
          //step 1: display name of weekdays
            System.out.println("\n     Mon     Tue     Wed     Thurs    Fri     Sat     Sun");
        
          //step 2: display the number of empty spaces needed on the first row before numbers
          if (weekDay.equals("Tuesday"))
            System.out.printf("%8s", " ");
            space = 1;
            
          if (weekDay.equals("Wednesday"));
            System.out.printf("%16s", " ");
            space = 2;
            
          if (weekDay.equals ("Thursday"));
            System.out.printf("%24s", " ");
            space = 3;
            
          if (weekDay.equals("Friday"));
            System.out.printf("%32s", " ");
            space = 4;
            
          if (weekDay.equals("Saturday"));
            System.out.printf("%40s", " ");
            space = 5;
            
          if (weekDay.equals("Sunday"));
            System.out.printf("%48s", " ");
            space = 6;
            
          //step 3: display the numbers accordingly by "weekday"
            for (int i=1; i <= days; i++){
            System.out.printf("%8d", i); //use 8 spaces to display a day number
            
            if ( (i+space) % 7 == 0) //goes to a new line after 7 days
                System.out.println();
        }
        System.out.println();
        
     }//end monthCalendarExample()

 }//end class

                

    
 
    
