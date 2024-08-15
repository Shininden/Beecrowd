package Beecrowd.Beginner;
import java.util.Scanner;

public class AgeinDays 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type number");
        int days = sc.nextInt(); 

        int months = (days % 365);
        int years = days / 365;

        System.out.println(years + " ano(s)");
        System.out.println((months / 30) + " mes(es)");
        System.out.println((months % 30) + " dia(s)");

        sc.close();
    }
}