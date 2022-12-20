/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEN.SepsJ.SemestralProject;

import java.util.Scanner;

/**
 * @author fiwie
 */
public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jaky program chcete spustit?");
        System.out.println("1 pro spusteni vanocni ulohy");
        System.out.println("2 pro spusteni semestralni prace");
        System.out.println("0 pro ukonceni programu.");
        boolean startUp=true;
        while(startUp){
            int choose=sc.nextInt();
            switch(choose){
                case 1 ->
                {
                    System.out.println("Spoustim vanocni ulohu");
                    ChristmasSepsJiri.main(args);
                }
                case 2 ->
                {
                    System.out.println("Spoustim semestralni praci");
                    Semestral.main(args);
                }
                case 0 ->
                {
                    System.out.println("Ukoncuji program");
                    startUp=false;
                }
                default ->
                {
                    System.out.println("Spatny parametr");
                }
            }
        }
    }
}

