package basics;

import java.util.Scanner;

/**
 * Write program in java that accepts users input and validates if the input is
 * a palindrome. A palindrome is a word that reads the same forwards as it does
 * backwards. For this exercise we will consider a palindrome a palindrome
 * without punctuation.
 *
 * @author Justin Musgrove
 */
public class PalindromeDiscoverer {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Write your string here: ");
        String pal = keyboard.nextLine();
        boolean palindroma = palindrome(pal);
        if (palindroma){
            System.out.println("Your string is a palindrome");
        }else{
            System.out.println("Your string is not a palindrome");
        }
        keyboard.close();
    }

    public static boolean palindrome(String pal){
        String s = pal.replaceAll("\\s+", "");
        /**
         * remember the replaceAll method, seems cool
         * the regex \\s+ is useful for a series of whitespaces, while \\s for only one whitespace
         */
        StringBuilder rev = new StringBuilder(s);
        String s_r = rev.reverse().toString();
        /**
         *  equalsIgnoreCase() is very useful, it compares two strings, ignoring the fact that they may have
         *  uppercase or lowercase letters
         */
        if(s_r.equalsIgnoreCase(s))
            return true;
        return false;
    }
}
