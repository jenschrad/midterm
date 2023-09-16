package daysofweek;

/** Inport daysAndDates.DaysOfWeek;
 * removing this import statement as it is unnecessary now
 * i would have changed Inport to import though
 */

import java.util.Scanner; // import scanner so that user can pass #s

public class TestDaysOfWeek {

    public static void main(String[] args) {
        
        // scanner
        Scanner input = new Scanner(System.in); 
        
        // prompt user for number
        System.out.print("Enter a number from 1 through 7 to see the day of the week: ");
        int numberOfDay = input.nextInt();
        
        // try-catch block for error handling
        try {
        // call the DaysOfWeek class and the method to get the string day for number entered
        String dayStr = DaysOfWeek.DayOfWeekStr(numberOfDay);
        // display the number entered and the corresponding day
        System.out.print("Number entered: " + numberOfDay + " Day of week: " + dayStr);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        
    }
}

