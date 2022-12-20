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
    public static String toString(int[] counts) {
        String result = "";
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                result += counts[i] + "" + i;
            }
        }
        return result;
    }

    public static void compare(long num, String result) {
        System.out.println("Cislo " + num + " ma soupisku " + result);
        if (result.equals(String.valueOf(num))) {
            System.out.println("Cislo" + num + " je zapisem sve soupisky");
        } else {
            System.out.println("Cislo " + num + " neni zapisem sve soupisky");
        }

    }
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

