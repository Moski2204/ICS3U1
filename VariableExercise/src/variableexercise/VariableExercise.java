/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableexercise;

/**
 * Date: 04/28/2021
 * Name: Muhammad Naseem
 * File: VariableExercise
 * Function: Variable Exercise
 */
public class VariableExercise {

    //main ()
    public static void main(String[] args) {
     
  // Question 1 and 2 are the same
        
    //Step 1 Variable declaration    
    String name = "Muhammad";
    int age;    
   
    //Step 2 assign values to variables 
    
    // the varible "name" is already assigned to a value so you dont need to add a value here, but you can if you want to
    name = "Muhammad";
    age = 16;
    
    //Step 3 display information
    System.out.println("Your name is " + name);
    System.out.println("Your age is " + age);
    
    // Question 3
    
    double myMark = 100.0;
            
    System.out.println("My mark is "+ myMark);
        
    //Quetion 4
    
    String name2 = "Muhammad", color = "blue";
   
    System.out.println(name2 + ", your favourite color is " + color);
        
    // Question 5
    
    //Step 1 declare variable as double type
    double mark1, mark2, mark3, mark4, mark5, averageMark, totalMark;
    
    //Step 2: assign values to the variable
    mark1 = 90;
    mark2 = 85;
    mark3 = 76;
    mark4 = 88;
    mark5 = 94.5;
    
    //Find the total mark and averageg mark 
    totalMark = mark1 + mark2 + mark3 + mark4 + mark5;
    averageMark = totalMark/5;
    
    //Step 3: Display the average mark 
    System.out.println("The average mark of 5 is " + averageMark);
    
    //Another Question 
    
/*Write a program that can be used to calculate the area of a rectangle. Your program 
should ask user to enter the values for length and width of the rectangle, and then 
calculate the area */

    //Step 1 Variable declaration
    double width, length, areaRectangle; 
    
    //Step 2: Assign values to variable
    width = 5;
    length = 6;
    
    //Step 3 Find/Calculate the Area
    areaRectangle = width * length;
          
    System.out.println("length: 5");
    System.out.println("width: 6");
    System.out.println("The area of the rectangle is " + areaRectangle);  
     
    }//end main()
        
}//end class
