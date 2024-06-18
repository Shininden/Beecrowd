package Beginner;
import java.util.Scanner;

public class CircleArea 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        System.out.println("A=" + String.format("%.4f", r * r * 3.14159));  
        
        sc.close();
    }
}