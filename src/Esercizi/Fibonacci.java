package Esercizi;

import java.util.Arrays;

/**
 * Write a program to display the first n numbers of the Fibonacci series.
 *
 * @author Nicola Bicocchi
 */
public class Fibonacci {
    public static void main (String[] args){
        int n = (int)(Math.random() * 20);
        int[] fibonacci = new int [n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; ++i){
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
            System.out.println(Arrays.toString(fibonacci));
    }
}
