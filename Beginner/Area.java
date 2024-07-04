package Beginner;

import java.util.Scanner;

public class Area 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double rectangledTriangle = (a * c) / 2;
        double radiusCircle = 3.14159 * Math.pow(c, 2);
        double trapeziumArea = ((a + b) * c) / 2;
        double squareArea = b * b;
        double rectangleArea = a * b;
        
        System.out.println("TRIANGULO: " + String.format("%.3f", rectangledTriangle));
        System.out.println("CIRCULO: " + String.format("%.3f", radiusCircle));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeziumArea));
        System.out.println("QUADRADO: " + String.format("%.3f", squareArea));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangleArea));


        sc.close();
    }
}