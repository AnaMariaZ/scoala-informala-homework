package siit.calculate.max;

import java.util.Scanner;

public class CalculateMax
{
    public static void main(String[] args)
    {
        System.out.println("Please insert first number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Please insert second number");
        int b = scanner.nextInt();

        System.out.println("Please insert 3rd number:");
        int c = scanner.nextInt();

        int temp=getMax(a,b);
        System.out.println("The maximum number is " + getMax(temp,c));
    }

    /**
     *
     * @param x first number
     * @param y second number
     * @return maximum between the first and the second number
     */
    public static int getMax(int x,int y)
    {
        if(x>y)
        {
            return x;
        }

        else return y;
    }
}