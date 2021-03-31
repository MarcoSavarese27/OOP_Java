package basics;

import java.util.Scanner;

/**
 * Write a Java program to print a String object in reverse order.
 *
 * @author Nicola Bicocchi
 */

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Type a word or a phrase you want to reverse");
        Scanner keyboard = new Scanner(System.in);
        String toRev = keyboard.nextLine();
        keyboard.close();
        StringBuilder reverser = new StringBuilder(toRev);
        String reversed = reverser.reverse().toString();
        System.out.print("Your reversed word or phrase is ");
        System.out.println(reversed);
    }

}
