package Beginner;

import java.util.Scanner;

public class Average3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double grade1 = sc.nextDouble();
        double grade2 = sc.nextDouble();
        double grade3 = sc.nextDouble(); 
        double grade4 = sc.nextDouble();  
        double extraGrade = 0;
        int weightA = 2, weightB = 3, weightC = 4, weightD = 1;

        double average = ((grade1 * weightA) + (grade2 * weightB) + (grade3 * weightC) + (grade4 * weightD)) / (weightA + weightB + weightC + weightD);

        System.out.println("Media: " + String.format("%.1f", average));

        if(average >= 7)
            System.out.println("Aluno aprovado.");

        else if(average < 5)
            System.out.println("Aluno reprovado.");
        
        else if(average >= 5 && average <= 6.9)
        {
            System.out.println("Aluno em exame.");
            extraGrade = sc.nextDouble();  
            System.out.println("Nota do exame: " + extraGrade);
            average = (average + extraGrade) / 2;

            if(average >= 5)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado."); 

            System.out.println("Media final: " + String.format("%.1f", average));
        }
            
        sc.close();
    }   
}