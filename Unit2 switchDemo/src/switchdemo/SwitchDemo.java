/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdemo;

import java.util.Scanner;

/**
 *
 * @author liboo
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner  In = new Scanner (System.in);
         
        char operator;
        int operand1, operand2;

        //enter for operator '+' '-' '*' '/'
        System.out.println ("Please enter operator: '+' '-' '*' '/'");
        operator = In.next().charAt(0);

        //enter two values for computer
        System.out.println ("Please enter first number: ");
        operand1 = In.nextInt ();
        System.out.println ("Please enter second number: ");
        operand2 = In.nextInt ();

        //switch statement
        switch (operator)  //only int or char in ( ) 
        {
            case '+': //add two numbers and display
                System.out.print (operand1 + " + " + operand2 + " = ");
                System.out.println (operand1 + operand2);
                break;
                
            case '-': //subtract and display
                System.out.print (operand1 + " - " + operand2 + " = ");
                System.out.println (operand1 - operand2);
                break;
                
            case '*': //multiply and display
                System.out.print (operand1 + " * " + operand2 + " = ");
                System.out.println (operand1 * operand2);
                break;
                
            case '/': //divide and display
                System.out.print (operand1 + " / " + operand2 + " = ");
                System.out.println (operand1 / operand2);
                break;
                
            default: //not correct operator
                System.out.println ("No correct operator found!!");
                break;
    }
    
}
