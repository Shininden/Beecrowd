import java.util.Scanner;

public class WeightedAverage
 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double gradeA = 3.5, gradeB = 7.5;
        
        System.out.print("Type the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Type the second grade: ");
        double grade2 = sc.nextDouble();
        
        double result = (grade1 * gradeA + grade2 * gradeB) / (gradeA + gradeB);
        
        System.out.printf("The average is: %.2f", result);

        sc.close();
    }
}