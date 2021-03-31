package basics;

import java.util.Scanner;

/**
 * Write a program to display the first n numbers of the Fibonacci series
 * (using recursion).
 *
 * @author Nicola Bicocchi
 */

public class Fibonacci_recursive {
    public static void fibrec(int n, int[] fib, int i){
        if (n == 0)
            return;
        if (i == 0 || i == 1) {
            fib[i] = 1;
            fibrec(n - 1, fib, i + 1);
        }else{
            fib[i] = fib[i - 1] + fib[i - 2];
            fibrec(n - 1, fib, i + 1);
        }
        return;
    }

    public static void main (String[] args){
        System.out.print("Quanti numeri della serie di Fibonacci vuoi vedere? ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[]Fib = new int[n];
        int i = 0;
        fibrec(n, Fib, i);
        System.out.println("I primi " + n + " numeri della serie di Fibonacci sono: ");
        for (int s:Fib){
            System.out.print(s + ", ");
        }
        System.out.print("...");
    }

}
