import java.util.Scanner;

public class FuelSpent 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("The car consumes 12 Liters per km");

        System.out.print("How many hours did the trip take ");
        int hours = sc.nextInt();

        System.out.print("What was the speed? ");
        int kmPerHour = sc.nextInt();

        double totalFuel = hours * kmPerHour;

        totalFuel /= 12;

        totalFuel *= 2;

        System.out.printf("The trip will cost in total: %.2f", totalFuel, " liters");


        sc.close();
    }
}