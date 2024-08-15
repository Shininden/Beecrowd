package Beecrowd.Beginner;

import java.util.Scanner;

public class BeeFibonacci 
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        
        if(n1 == 1)
            System.out.println("0");
            
        else
        {
            int vector[] = new int[n1];
            vector[0] = 0;
            vector[1] = 1;
            System.out.print("0 1 ");
            int i;
            
            for(i = 2; i < vector.length-1; i++)
            {
                vector[i] = vector[i-1] + vector[i-2];
                System.out.print(vector[i] + " ");
            }
            vector[i] = vector[i-1] + vector[i-2];
            System.out.print(vector[i] + "\n");
        }
        sc.close();
    }
}