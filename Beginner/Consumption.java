package Beginner;

import java.util.Scanner;

public class Consumption 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int totDistance = sc.nextInt();
        double spentFuel = sc.nextDouble();

        System.out.println(String.format("%.3f km/l", totDistance / spentFuel));
        
        sc.close();
    }
}