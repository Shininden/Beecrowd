package Beginner;
import java.util.Scanner;

public class Banknotes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double requestedValue = sc.nextDouble();

        double digit = 0;
        double centDigit = 0;
        int power = 0;
        
        int real_1 = 0, real_2 = 0, real_5 = 0, real_10 = 0, real_20 = 0, real_50 = 0, real_100 = 0;
        double cent_50 = 0, cent_25 = 0, cent_10 = 0, cent_5 = 0, cent_1 = 0;

        while(requestedValue > 0)
        {
           digit += (requestedValue % 1) * Math.pow(10, power);

           if(digit == 0)
           {
             power++;
             requestedValue /= 10;
           }
           else
           {
            while (digit > 0) 
            {
               while ((digit - 100) >= 0)
               {
                 real_100++;
                 digit -= 100;
               }

               while ((digit - 50) >= 0)
               {
                 real_50++;
                 digit -= 50;
               }
               
               while ((digit - 20) >= 0)
               { 
                 real_20++;
                 digit -= 20;
               }
               
               while ((digit - 10) >= 0)
               { 
                 real_10++;
                 digit -= 10;
               }

               while ((digit - 5) >= 0)
               { 
                 real_5++;
                 digit -= 5;
               }

               while ((digit - 2) >= 0)
               {
                 real_2++;
                 digit -= 2;
               }

               while ((digit - 1) >= 0)
               {
                 real_1++;
                 digit -= 1;
               }

               while ((digit - 0.50) >= 0)
               {
                 cent_50++;
                 digit -= 0.50;
               }

               while ((digit - 0.25) >= 0)
               {
                 cent_25++;
                 digit -= 0.25;
               }

               while ((digit - 0.10) >= 0)
               {
                 cent_10++;
                 digit -= 0.10;
               }

               while ((digit - 0.05) >= 0)
               {
                 cent_5++;
                 digit -= 0.05;
               }

               while ((digit - 0.01) >= 0)
               {
                 cent_1++;
                 digit -= 0.01;
               }

               power++;
               requestedValue /= 10;
          }
           }
         }
        System.out.println("NOTAS:"); 
        System.out.println(real_100 + " nota(s) de R$ 100,00");
        System.out.println(real_50 + " nota(s) de R$ 50,00");
        System.out.println(real_20 + " nota(s) de R$ 20,00");
        System.out.println(real_10 + " nota(s) de R$ 10,00");
        System.out.println(real_5 + " nota(s) de R$ 5,00");
        System.out.println(real_2 + " nota(s) de R$ 2,00");

        System.out.println("MOEDAS:"); 
        System.out.println(real_1 + " moeda(s) de R$ 1,00");
        System.out.println(cent_50 + " moeda(s) de R$ 0,50");
        System.out.println(cent_25 + " moeda(s) de R$ 0,25");
        System.out.println(cent_10 + " moeda(s) de R$ 0,10");
        System.out.println(cent_5 + " moeda(s) de R$ 0,05");
        System.out.println(cent_1 + " moeda(s) de R$ 0,01");

        sc.close();
    }
}