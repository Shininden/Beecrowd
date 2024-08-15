package Beecrowd.Beginner;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Triangle_Types 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Double[] values = new Double[3];

        for (int i = 0; i < values.length; i++)
            values[i] = sc.nextDouble();
        
        Arrays.sort(values, Collections.reverseOrder(null));    

        if(values[0] >= values[1] + values[2])
            System.out.println("NAO FORMA TRIANGULO");

        else
        {
            if(values[0] * values[0] == (values[1] * values[1])  + (values[2] * values[2]))
                System.out.println("TRIANGULO RETANGULO");

            else if((values[0] * values[0]) > (values[1] * values[1]) + (values[2] * values[2]))
                System.out.println("TRIANGULO OBTUSANGULO");

            else if(values[0] * values[0] < (values[1] * values[1]) + (values[2] * values[2]))
                System.out.println("TRIANGULO ACUTANGULO");

            if(values[0].equals(values[1]) && values[1].equals(values[2]))
                System.out.println("TRIANGULO EQUILATERO");

            else if(values[0].equals(values[1]) || values[1].equals(values[2]) || values[0].equals(values[2]))
                System.out.println("TRIANGULO ISOSCELES");
        }     

        sc.close();
    }
}