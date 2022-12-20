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
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // in
        System.out.println("Zadej cislo: ");
        long num = sc.nextLong();

        while (num > 0) {
            // Count the number of occurrences of each digit
            int[] counts = Tools.countDigits(num);

            // Print the count and digit for each non-zero count
            String result = Tools.toString(counts);
            // Compare the input number and result
            Tools.compare(num, result);

            System.out.print("Zadej cislo: ");
            num = sc.nextLong();
        }
    }
}
