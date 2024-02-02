/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmajorassignment;

/*************************
 * Date: 06/12/2021
 * Name: Muhammad Naseem
 * File: FinalMajorAssignment
 * Function: Creating A Georgian Calendar 
 *************************/
public class FinalMajorAssignment {

    //main
    public static void main(String[] args) { 
     Intro ();
     menu ();
     int days = 31;
     String month;
     month = "january";
     monthCalendarExample(days, month);   
     int day = 0;
     int year = 0; 
     goodBye ();
     
}//end main ()

   public static void Intro(){//start intro
   System.out.println("*****************************************");
   System.out.println("*                                       *");
   System.out.println("*                                       *");
   System.out.println("*            Greetings User!            *");
   System.out.println("*                                       *");
   System.out.println("*                                       *");
   System.out.println("*****************************************");
   System.out.println("");
}// end Intro()
    
   public static void menu(){
       System.out.println("Choose an option");
       System.out.println("1. Year calendar");
       System.out.println("2. Month calendar");
       System.out.println("3. Weekday name");
       System.out.println("4. Future date");
   }//end Menu ()
      
   //Part A: yearCalendar
   
    public static void yearCalendar(int year){//start yearCalendar
      //for loop  
      
     }//end yearCalendar
    
    //Part B:
     
        //leap year check
    public static boolean ifLeapYear (int year) {//start ifLeapYear
            if (  (year % 400 ==0) || (year % 4 == 0 && year %100 != 0))
                return true;
            else
                return false;
    }//end ifleapYear
                   
    //method to conbert month name to month number
    public static int monthNameToNumber (String month) {//start monthNameToNumber
      if (month.equals("January"))
          return 1;
      else if (month.equals("February"))
          return 2;  
      else if (month.equals("March"))
          return 3;         
      else if (month.equals("April"))
          return 4;          
      else if (month.equals("May"))
          return 5;          
      else if (month.equals("June"))
          return 6;         
      else if (month.equals("July"))
          return 7;         
      else if (month.equals("August"))
          return 8;        
      else if (month.equals("September"))
          return 9;         
      else if (month.equals("October"))
          return 10;          
      else if (month.equals("November"))
          return 11;      
      else if (month.equals("December"))
          return 12;
      else
          return 0;  
       
    }//end monthNameToNumber
    
    //method: dayNumber() will return the day number of the year after user enter a date
    public static int dayNumber(int year, String month){//start dayNumber
      int dayNumber = 0;
      
      for (int monthNumber = 1; monthNumber < monthNameToNumber(month); monthNumber++ ){
          if ( monthNumber == 2 && ifLeapYear(year) )
              dayNumber += 29; //leap year has 29 days in february 
          else if (monthNumber == 2)
              dayNumber += 28;
          else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11)
              dayNumber += 30;     
      }
      return dayNumber;
       
    }//end dayNumber ()
    
    //Calculating The TotalDays
    public static int theTotalDays (int year){//start theTotalDays
        int totalDay = 0;
        
        for (int count = 1900;count < year; count++){
            if (ifLeapYear (year)){
                totalDay += 366;
            }
            else {
                totalDay += 365;
            }
        }
        return totalDay;
    }//end theTotalDays
    
   //monthCalendarExample()
    public static void monthCalendarExample(int days, String month){//start monthCalendarExample      
        int space = 0;
        
          //step 1: display name of weekdays
            System.out.println("\n     Mon     Tue     Wed     Thurs    Fri     Sat     Sun");
        
          //step 2: display the number of empty spaces needed on the first row before numbers
          if (month.equals("Tuesday"))
            System.out.printf("%1s", " ");
            space = 0;
            
          if (month.equals("Tuesday"))
            System.out.printf("%8s", " ");
            space = 1;
            
          if (month.equals("Wednesday"));
            System.out.printf("%16s", " ");
            space = 2;
            
          if (month.equals ("Thursday"));
            System.out.printf("%24s", " ");
            space = 3;
            
          if (month.equals("Friday"));
            System.out.printf("%32s", " ");
            space = 4;
            
          if (month.equals("Saturday"));
            System.out.printf("%40s", " ");
            space = 5;
            
          if (month.equals("Sunday"));
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
    
    //Part C: weekDayNameFind
    
    public static void weekDayNameFind (String multiplemonths, int day, int year){//start weekDayNameFind
    int month = 0;
    
    if (multiplemonths.equals("January")){
        month = 1;
    }
    else if (multiplemonths.equals("February")){
    }
    else if (multiplemonths.equals("March")){
        month = 3;
    }
    else if (multiplemonths.equals("April")){
        month = 4;
    }
     else if (multiplemonths.equals("May")){
        month = 5;
    }
     else if (multiplemonths.equals("June")){
        month = 6;
     }
     else if (multiplemonths.equals("July")){
        month = 7;
     }
     else if (multiplemonths.equals("August")){
        month = 8;
     }
     else if (multiplemonths.equals("September")){
        month = 9;
    }
     else if (multiplemonths.equals("October")){
        month = 10;
     }
     else if (multiplemonths.equals("November")){
        month = 11;
     }
     else if (multiplemonths.equals("December")){
        month = 12;
     }
    }//end weekDayNameFind  
      
      //Part D: futureDateFind
      
      public static void futureDateFind (int  n) {//start futureDateFind
           int year = 2021, month = 7, day = 1, m=n;
        
            if (n < 184){
            
        }
        else {
            while(n>365){}
        }
            while (n > dayNumber(month, year)){
            n -= dayNumber(month, year);
            month++;
            
            if (month == 12 && n >= 31){
                year++;
                month=1;
            }
        }
        
        day += n;
        
        System.out.println("\n" + m + " days after 2021/07/01 is:");
        System.out.println(year + "/" + month + "/" + day + "\n");
      }
      
        public static void goodBye (){
        System.out.println("\n*****************************");
        System.out.println("*                           *");
        System.out.println("*   Thank you, good bye!    *");
        System.out.println("*                           *");
        System.out.println("*****************************");        
                
        }//end futureDateFind
    
 }//end class


    
    


                










