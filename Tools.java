/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEN.SepsJ.SemestralProject;

/**
 *
 * @author fiwie
 */
public class Tools {
    public static int[] countDigits(long num) {
        int[] counts = new int[10]; // array creation for digit storage
        
        while (num > 0) {
        int digit = (int) (num % 10);
        counts[digit]++;
        num /= 10;
        }

        return counts;
    }
}

