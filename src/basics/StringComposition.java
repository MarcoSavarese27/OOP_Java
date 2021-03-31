package basics;

import java.util.Scanner;

/**
 * Write a program for composing a String using StringBuilder
 *
 * @author Nicola Bicocchi
 */

public class StringComposition {
    public static void main(String[] args){
        System.out.println("Write a word or a string");
        Scanner keyboard = new Scanner(System.in);
        String in = keyboard.nextLine();
        StringBuilder str = new StringBuilder(in);
        str.append(" ");
        System.out.println("Write now a word or a string that you want after the last one");
        in = keyboard.nextLine();
        keyboard.close();
        str.append(in);
        System.out.print("Your result is: " + str);

    }
}
