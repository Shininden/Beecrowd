package Beecrowd.Beginner;
import java.util.Scanner;

public class FuelSpent 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int hours = sc.nextInt();
        int kmPerHour = sc.nextInt();

        double totalFuel = hours * kmPerHour;

        totalFuel /= 12;

        //System.out.printf("%.3f", totalFuel);
        System.out.printf("%.3f%n", totalFuel);

        sc.close();
    }
}