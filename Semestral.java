/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEN.SepsJ.SemestralProject;

import java.util.Scanner;

/**
 *10. Program converts an input number into the count of individual numbers
 * within the input number.
 * 
 * @author fiwie
 * @version 1.0 17/12/2022
 */
public class Semestral {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //in
        System.out.println("Zadej cislo: ");
        long num = sc.nextLong();
        
        while (num > 0) {
        // Count the number of occurrences of each digit
        int[] counts = countDigits(num);

        // Print the count and digit for each non-zero count
        String result = "";
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
            result += counts[i] + "" + i;
            }
        }

        // Compare the input number and result
        System.out.println("Cislo "+num+" ma soupisku "+result);
        if (result.equals(String.valueOf(num))) {
            System.out.println("Cislo"+num+" je zapisem sve soupisky");
        } else {
            System.out.println("Cislo "+num+" neni zapisem sve soupisky");
        }

        System.out.print("Zadej cislo: ");
        num = sc.nextLong();
        }
    }
}
