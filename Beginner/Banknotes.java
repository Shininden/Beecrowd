package Beginner;
import java.util.Scanner;

public class Banknotes 
{
    static double digit = 0;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How much money do you want to withdraw? ");
        double requestedValue = sc.nextInt();

        int power = 0;
        int real_2 = 0, real_5 = 0, real_10 = 0, real_20 = 0, real_50 = 0, real_100 = 0;
        //double cent_1 = 0, cent_050 = 0, cent_025 = 0, cent_010 = 0, cent_005 = 0, cent_001 = 0; 

        while(requestedValue > 0)
        {
           digit += (requestedValue % 10) * Math.pow(10, power);

           if(digit == 0)
           {
             power++;
             requestedValue /= 10;
           }

            while (digit > 0) 
            {
               /*check(100, real_100);
               check(50, real_50);
               check(20, real_20);
               check(10, real_10);
               check(5, real_5);
               check(2, real_2);
               check(1, real_1);*/

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
                  //cent_1++;
                  digit -= 1;
               }

               power++;
               requestedValue /= 10;
            } 
         }
            
        System.out.println("Foram precisas: ");
        System.out.println(real_100 + " nota(s) de R$ 100,00");
        System.out.println(real_50 + " nota(s) de R$ 50,00");
        System.out.println(real_20 + " nota(s) de R$ 20,00");
        System.out.println(real_10 + " nota(s) de R$ 10,00");
        System.out.println(real_5 + " nota(s) de R$ 5,00");
        System.out.println(real_2 + " nota(s) de R$ 2,00");
       // System.out.println(cent_1 + " nota(s) de R$ 1,00");

        sc.close();
    }

    static int check(int value, int nota)
    {
      while ((digit - value) >= 0)
      {
        nota++;
        digit -= value;
      }
      return nota;
    }
}