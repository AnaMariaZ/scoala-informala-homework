package homework;

import java.util.Scanner;

public class JavaHomework
{
    public static void main(String[] args) {
//   /* 1. Calculate the sum of the first 100 numbers higher than 0. */
        //    System.out.println("Suma primelor 100 de numere este " + sumFirstNumbers());
//   /*   2. Display the smallest number from a collections of number */
        //  int[] tablouFix={101,57,80,69,35,45,50,99};
        //  System.out.println("Cel mai mic numar din tablou de numere este " + smallestFromCollection(tablouFix));
//   /*  3. Display the max digit from a number. Read the number from keyboard */
        //System.out.println("Cifra cea mai mare din numar este " + maxDigitFromNumber(-8795));
   /* 4. Check if a number is palindrom( e.g palindrom 1221, 34143)  */
        //System.out.println(checkPalindrome(3553));
   /*  5. Display all the prime numbers lower than a given number */
        // checkPrimeNumbers();
   /* 6. Input the dimensions of a rectangle and display area and perimeter  */
//        System.out.println("Aria dreptunghiului este  " + rectangleArea(4, 20));
//        System.out.println("Perimetrul dreptunghiului este  " + rectanglePerimeter(4, 20));
//   /* 7. Input the length of the side of a square, and display its area.  Produce an error message if the length is negative  */
        // System.out.println("Aria patratului este  " + squareArea(4));
//   /* 8. Input 3 numbers, and display the biggest. */
        System.out.println("Numarul maxim este "+displayTheBiggest());
//   /* 9. Input 2 values: start and finish, then display the numbers from start to finish.*/
        //int result = displayFromStartToFinish(50);


    }

    /* 1. Calculate the sum of the first 100 numbers higher than 0. */

    /**
     *
     * @return
     */
    public static int sumFirstNumbers()
    {
        int sum=0;
        for (int i=0;i<101;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    //
//    /*   2. Display the smallest number from a collections of number */
    public static int smallestFromCollection(int tablouFix[])
    {
        int i;
        int minimul=tablouFix[0];
        for (i=1;i<tablouFix.length; i++)
        {
            System.out.println("min: "+minimul);
            System.out.println("tablouFix[i]: "+tablouFix[i]);
            if(minimul>tablouFix[i])
                minimul=tablouFix[i];
        }
        return minimul;
    }
////
//      /*  3. Display the max digit from a number. Read the number from keyboard */

    /**
     *
     * @param number to check
     * @return max digit
     */
    public static int maxDigitFromNumber(int number)
    {

        int r;
        int maximul=0;
        while (number>0)
        {
            r=number%10;

            if (r>maximul)
            {
                maximul=r;
            }

            number=number/10;
        }

        return maximul;
    }
    //
    /* 4. Check if a number is palindrom( e.g palindrom 1221, 34143)  */
    public static boolean checkPalindrome(int number)
    {
        int i=number;
        int r;
        int reversed=0;
        while(i>0)
        {
            r=i%10;
            reversed=reversed*10+r;
            i=i/10;
        }

        if (number==reversed)
        {
            System.out.println("Nnumarul este palindrom");
            return true;
        }

        else
        {
            System.out.println("Numarul nu este palindrom");
            return false;
        }

    }


    //
       /*  5. Display all the prime numbers lower than a given number */
    public static void checkPrimeNumbers()
    {
        System.out.println("Insert number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i = 2; i <= number; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }

    }

    //
    /* 6. Input the dimensions of a rectangle and display area and perimeter  */
    public static int rectangleArea(int latimea, int lungimea)
    {

        int aria = 1;
        if (latimea > 0 && lungimea > 0)
        {
            aria = latimea * lungimea;
        }
        return aria;
    }

    public static int rectanglePerimeter(int latimea, int lungimea)
    {

        int perimeter=0;
        if (latimea > 0 && lungimea > 0)
        {
            perimeter = 2*latimea +2* lungimea;
        }
        return perimeter;
    }
////

    ///* 7. Input the length of the side of a square, and display its area.  Produce an error message if the length is negative  */
    public static int squareArea(int latura)
    {
        int aria=1;
        if (latura>0)
        {
            aria=latura*latura;
        }
        else
        {
            System.out.println("error");
        }
        return aria;
    }
    ////
//    /* 8. Input 3 numbers, and display the biggest. */
    public static int displayTheBiggest() {
        // int maxim = 0;
        System.out.println("Insert first number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Insert second number:");
        int b = scanner.nextInt();

        System.out.println("Insert third number:");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            //maxim = a;
            //System.out.println("Numarul maxim este"+maxim);
            return a;
        } else if (a >= b && a <= c) {
            //maxim = c;
            //System.out.println("Numarul maxim este"+maxim);
            return c;
        } else if (a <= b && b >= c) {
            // maxim = b;
            //System.out.println("Numarul maxim este"+maxim);
            return b;
            //  } else if (a <= b && b <= c) {
        }else{
            //maxim = c;
            //System.out.println("Numarul maxim este"+maxim);
            return c;
        }


        // return maxim;

    }
    //
     /* 9. Input 2 values: start and finish, then display the numbers from start to finish.*/
    public static int displayFromStartToFinish(int i)
    {
        System.out.println("Insert start number:");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();

        System.out.println("Insert finish number:");
        int finish = scanner.nextInt();

        int result=0;

        for (i=start; i<finish; i++)
        {
            result=i;
            System.out.println("Numerele sunt " + result);
        }
        return result;
    }


}
