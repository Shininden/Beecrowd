package Beginner;

import java.util.Scanner;

public class SalaryBonus 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double totSales = sc.nextDouble();

        double finalSalary = fixedSalary + (totSales * 0.15);


        System.out.printf("TOTAL = R$ %.2f", finalSalary);
        sc.close();
    }
}