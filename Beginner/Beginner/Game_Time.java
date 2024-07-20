package Beginner;

import java.util.Scanner;

public class Game_Time 
{
    static Scanner sc = new Scanner(System.in);

    static int startHour = sc.nextInt(), startMin = sc.nextInt(), finishHour = sc.nextInt(), finishMin = sc.nextInt();
    static int hours = 0, minutes = 0;

    public static void main(String[] args) 
    {
        if(startMin == finishMin)
            calculateHour();

        else if(startMin > finishMin )
        {
            hours --;
            calculateHour();

            minutes = 60 - (startMin - finishMin);
        }

        else if(startMin < finishMin && startHour == finishHour)
            minutes = finishMin - startMin;
            
        else if(startMin < finishMin && (startHour > finishHour || startHour < finishHour))
        {
            calculateHour();
            minutes = finishMin - startMin;
        }

        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");

        sc.close();
    } 
    
    static int calculateHour()
    {
        if(startHour > finishHour || startHour == finishHour)
            {
                for (int i = startHour; i < 24; i++) 
                    hours++;

                for (int i = 0; i < finishHour; i++) 
                    hours++;
            }
            else
                hours += finishHour - startHour;

        return hours;
    }
}

/*
 * hora = hora     min = min  O
 * hora = hora     min > min  O
 * hora = hora     min < min  O
 * 
 * hora > hora     min = min  O
 * hora > hora     min > min  O
 * hora > hora     min < min  O
 * 
 * hora < hora     min = min  O
 * hora < hora     min > min  O
 * hora < hora     min < min
 */