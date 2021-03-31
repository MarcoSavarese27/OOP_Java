package basics;

import java.util.Scanner;

/**
 * Write a program in Java to display the multiplication table of a given
 * integer. n = 5, expected Output:
 * <p>
 * 5 X 0 = 0
 * <p>
 * 5 X 1 = 5
 * <p>
 * 5 X 2 = 10
 * <p>
 * 5 X 3 = 15
 * <p>
 * 5 X 4 = 20
 * <p>
 * 5 X 5 = 25
 * <p>
 * …
 *
 * @author Nicola Bicocchi
 */

public class Multiplication {
    public static void main(String[] args) {
        System.out.print("Choose the number that you want to multiply: ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println("The multiplication table of this number is: ");
        keyboard.close();
        for (int i = 0; i <= n; ++i) {
            System.out.println(n + " X " + i + " = " + (i * n));
        }
    }
}
