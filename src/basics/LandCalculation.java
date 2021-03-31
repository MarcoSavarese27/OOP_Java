package basics;

import java.util.Scanner;

/**
 * One acre of land is equivalent to 43,560 square feet. Write a program that
 * calculates the number of acres in a tract of land (expressed in square
 * feet).
 *
 * @author Justin Musgrove
 */

public class LandCalculation {
    private static final int acresinfeet = 43560;

    public static void main(String[] args){
        double feet;
        double acres;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Put here the tract of land in square feet: ");
        feet = keyboard.nextDouble();
        acres = feet/acresinfeet;
        System.out.println("Your land is " + acres + " acres");
        keyboard.close();
    }

}
