package basics;
/**
 * Write a program with a method named isEven() that accepts an int argument. The
 * method should return true if the argument is even, or false if otherwise. The
 * program's main method should use a loop to generate 100 random integers. It
 * should use the isEven method to determine whether each random number is even,
 * or odd. When the loop is finished, the program should display the number of
 * even and odd numbers that were generated.
 *
 * @author Justin Musgrove
 */
public class EvenOddCounter {
    private static final int numeri = 100;

    public static void main(String[] args){
        int num, evennum = 0, oddnum = 0;
        for (int i = 0; i < numeri; ++i){
            num =(int)(Math.random()*Integer.MAX_VALUE);
            if(isEven(num)){
                ++evennum;
            }
            else{
                ++oddnum;
            }
        }
        System.out.println("There where " + evennum + " even numbers");
        System.out.println("There where " + oddnum + " odd numbers");

    }
    static boolean isEven(int num){
        boolean s = false;
        if (num % 2 == 0)
            s = true;
        return s;
    }
}
