package Beginner;

import java.util.Scanner;

public class Distance 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();

        System.out.println((distance * 2) + " minutos");

        sc.close();
    }
}