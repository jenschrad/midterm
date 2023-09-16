
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
        }
        return dayStr; // added return statement
    }
}
