package Beginner;
import java.util.Scanner;

public class Salary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int workerNumber = sc.nextInt();
        int monthly_Worked_Hours = sc.nextInt();
        double hourly_Wage = sc.nextDouble();

        System.out.println("NUMBER = " + workerNumber);
        System.out.println("SALARY = U$ " + String.format("%.2f", monthly_Worked_Hours * hourly_Wage));  
        
        sc.close();
    }
}