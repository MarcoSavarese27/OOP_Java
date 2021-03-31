package basics;

import java.util.Scanner;

/**
 * Write a Java program to break an integer into a sequence of individual
 * digits. Test Data Input six non-negative digits: 123456
 * <p>
 * Expected Output
 * <p>
 * 1 2 3 4 5 6
 *
 * @author Nicola Bicocchi
 */

public class NumberSplitter {
    public static int dim(int n){
        int i = 0;
        while (n != 0){
           n /= 10;
           ++i;
        }
        return i;
    }
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Put here the integer number you want to split: ");
        int n = keyboard.nextInt();
        keyboard.close();
        System.out.println("");
        System.out.print("Your output is: ");
        int i = dim(n);
        int[] s = new int[i];
        while (n != 0){
           s[i - 1] = n % 10;
           --i;
           n /= 10;
        }
        for (int o: s){
            System.out.print(o + " ");
        }
    }
}
