# MIDTERM SDEV200

## INSTRUCTIONS
In this assignment you will demonstrate your knowledge of debugging by fixing the errors you find in the program below.  Fix the code, and paste it in this document, along with the list of the problems you fixed.
This example allows the user to display the string for the day of the week. For example, if the user passed the integer 1, the method will return the string Sunday. If the user passed the integer 2, the method will return Monday. This code has both syntax errors and logic errors. Hint: There are two logic errors to find and fix (in addition to the syntax errors).


# PREVIOUS CODE

## DaysOfWeek.java
```java
package daysAndDates

public class DaysOfWeek {
	public static String DayOfWeekStr(int NumberOfDay) {
		String dayStr = ""
		switch (NumberOfDay) {
			case 1:
				dayStr = "Sunday";
				break;
			case 2:
				dayStr = "Monday";
				break;
			case 3:
				dayStr = "Tuesday"
				break;
			case 4:
				dayStr = "Wednesday";
			case 5:
				dayStr = "Thursday";
				break;
			case 6:
				dayStr = "Thursday";
				break;
			case 7:
				dayStr = "Saturday";
				break;
		}
		
	}
}
```

## TestDaysOfWeek.java
```java
Inport daysAndDates.DaysOfWeek;

public class TestDaysOfWeek {

	public static void main(String[] args) {
		System.out.println("Days Of week: ");
		for (int i = 0;i < 8;i++) {
			System.out.println("Number: " + i + "\tDay Of Week: " + DaysOfWeek.DayOfWeekStr(i) )
		}

	}

}
```
# CORRECTED CODE

## DaysOfWeek.java
```java
package daysofweek; // changed from package daysAndDates

public class DaysOfWeek {
    
    // changed the var NumberOfDay to numberOfDay to reflect naming conventions
    public static String DayOfWeekStr(int numberOfDay) {
        String dayStr = ""; // added semicolon
        switch (numberOfDay) {
            case 1:
                dayStr = "Sunday";
                break;
            case 2:
                dayStr = "Monday";
                break;
            case 3:
                dayStr = "Tuesday"; // added semicolon
                break;
            case 4:
                dayStr = "Wednesday";
                break; // added break statement
            case 5:
                dayStr = "Thursday";
                break;
            case 6:
                dayStr = "Friday"; // changed to Friday
                break;
            case 7:
                dayStr = "Saturday";
                break;
            // exception handling
            default: 
                throw new IllegalArgumentException("You entered " + numberOfDay + " but there are only 7 days in a week.");
        }
        return dayStr; // added return statement
    }
}
```

## TestDaysOfWeek.java
```java
package daysofweek;

/** Inport daysAndDates.DaysOfWeek;
 * removing this import statement as it is unnecessary now
 * i would have changed Inport to import though
 * 
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
```

# LIST OF PROBLEMS FIXED

## DaysOfWeek.Java
+ changed ```package daysAndDates``` to ```packages daysofweek```
+ changed variable name ```NumberOfDays``` to ```numberOfDays``` to reflect naming conventions
+ added semicolon to ```String dayStr```
+ added semicolon to ```dayStr = "Tuesday"```
+ added break statement to ```case 4: dayStr = "Wednesday"```
+ changed ```case: 6 dayStr = "Thursday" to case 6: dayStr = "Friday"```
+ added ```default: throw new IllegalArgumentException("You entered " + numberOfDay + " but there are only 7 days in a week.");``` for exception handling
+ added return statement ```return dayStr```


## TestDaysOfWeek.java
+ removed ```Inport daysAnDates.DaysOfWeek;``` and replaced with ```package daysofweek;```
+ added ```import java.util.Scanner;``` to reflect assignment instructions for user "passing in #"
+ overhauled all logic in ```public static void main(String[] args)``` by:
  - adding ```Scanner input = new Scanner(System.in);``` to take user input
  - adding ```System.out.print("Enter a number from 1 through 7 to see the day of the week: ");``` and ```int numberOfDay = input.nextInt();``` to prompt and recieve user input
  - adding ```String dayStr = DaysOfWeek.DayOfWeekStr(numberOfDay);``` to call ```public class DaysOfWeek``` and method ```public static String DayOfWeekStr(int numberOfDay)``` to access logic with switch
  - adding ```System.out.print("Number entered: " + numberOfDay + " Day of week: " + dayStr);``` to display only the # entered and corresponding day string
  - adding try-catch block for exception handling


# RUNNING PROGRAM EXAMPLE
![midterm](https://github.com/jenschrad/midterm/assets/109177708/db8b7d1a-cab7-439b-8631-e47e3a245583)







