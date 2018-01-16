package siit.fahrenheit.to.celsius.conversion;

import java.util.Scanner;

public class Conversion
{
    public static void main(String[] args)
    {
        System.out.println("Please enter temperature");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();

        System.out.println("Your body temperature in Celsius degrees is " + transformTemperature(temp));
    }

    /**
     *
     * @param f temperature in Fahrenheit degrees
     * @return temperature in Celsius degrees
     */
    public static double transformTemperature(double f)
    {
        double c;
        c=((f+40)/1.8) - 40;

        if(c>37)
        {
            System.out.println("You are ill!");
        }
        return c;
    }
}
