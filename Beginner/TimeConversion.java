package Beecrowd.Beginner;
import java.util.Scanner;

public class TimeConversion 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type number");
        int seconds = sc.nextInt();
        
        int minutes = seconds % 3600;
        int hours = seconds / 3600;

        if(seconds < 0)
            System.out.println("Invalid number");
        
        else
            System.out.println(hours + ":" + (minutes / 60) + ":" + minutes % 60);

        sc.close();
    }
}