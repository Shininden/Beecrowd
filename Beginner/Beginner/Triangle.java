package Beginner;

import java.util.Scanner;
import java.util.Arrays;

public class Triangle 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);

      double[] values = new double[3];
      double[] auxVector = new double[3];

      for (int i = 0; i < values.length; i++)
         values[i] = sc.nextDouble();

      for (int i = 0; i < auxVector.length; i++)
         auxVector[i] = values[i];

      Arrays.sort(values);

      if(values[0] + values[1] == values[2])
         System.out.println("Area = " + ( (auxVector[0] + auxVector[1]) * auxVector[2] ) / 2 );

      else
         System.out.println("Perimetro = " + (auxVector[0] + auxVector[1] + auxVector[2]));


      sc.close();
   } 
}