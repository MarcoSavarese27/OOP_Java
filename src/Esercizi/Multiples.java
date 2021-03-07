package Esercizi;

/**
 * Write a program printing integers (1 < n < 100) divisible by 3 and 5
 *
 * @author Nicola Bicocchi
 */

public class Multiples {
    static final int MAX_NUMBER = 100;
    public static void main(String[] args){
        for (int i = 1; i <= MAX_NUMBER; ++i){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
