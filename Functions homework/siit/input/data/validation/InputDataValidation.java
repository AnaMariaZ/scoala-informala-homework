package siit.input.data.validation;

import java.util.Scanner;

public class InputDataValidation
{
    public static void main (String[] args)

    {
        System.out.println("What time is it?");
        System.out.println("Please insert hour:");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        System.out.println("Please insert minutes:");
        int minutes = scanner.nextInt();

        if(validateHour(hour)&& validateMinutes(minutes))
        {
            System.out.println("The time is "+ hour + ":" + minutes + " now.");
        }
        else
        {
            System.out.println( " Incorrect time!");
        }
    }


    /**
     *
     * @param hour represents the hour we want to validate
     * @return true if the data is between 0 and 23, false otherwise
     */
    public static boolean validateHour(int hour)
    {
//        if (hour>=0 && hour<=24)
//        {
//            return true;
//        }
//
//        else
//            return false;

        if (validateValue(hour, 0,23))
        {
            return true;
        }
        else return false;
    }

    /**
     *
     * @param minutes represents the minutes we want to validate
     * @return true if the data is between 0 and 59, false otherwise
     */
    public static boolean validateMinutes(int minutes)
    {
//        if (minutes>=0 && minutes<=24)
//        {
//            return true;
//        }
//
//        else
//            return false;

        if( validateValue(minutes,0,59))
        {
            return true;
        }
        else return false;
    }

    /**
     *
     * @param value hour or minutes, read from keyboard
     * @param min is the minimum value that hour or minutes can take
     * @param max is the maximum value that hour or minutes can take
     * @return true if the data is between the given values, false otherwise
     */
    public static boolean validateValue(int value, int min, int max)
    {
        if (value>=min && value <=max)
        {
            return true;
        }

        else
            return false;
    }

}