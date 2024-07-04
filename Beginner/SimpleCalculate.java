package Beginner;

import java.util.Scanner;

public class SimpleCalculate 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt(); 
        int units = sc.nextInt();
        double price = 0;

        switch (code) 
        {
            case 1:
                price = units * 4;
                break;

            case 2:
                price = units * 4.5;
                break;

            case 3:
                price = units * 5;
                break;

            case 4:
                price = units * 2;
                break;

            case 5:
                price = units * 1.5;
                break;
        }
        System.out.printf("Total: R$ %.2f", price);
        System.out.println();

        sc.close();
    }
}