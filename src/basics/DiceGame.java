package basics;

/**
 * Write a program that plays a simple dice game between the computer and the
 * user. When the program runs, a loop should repeat 10 times. Each iteration of
 * the loop should do the following:
 * <p>
 * Generate a random integer in the range of 1 through 6. This is the value of
 * the computer’s die. Generate another random integer in the range of 1 through
 * 6. This is the value of the user’s die. The die with the highest value wins.
 * In case of a tie, there is no winner for that particular roll of the dice. As
 * the loop iterates, the program should keep count of the number of times the
 * computer wins, and the number of times that the user wins. It should also
 * display the results of each roll.
 * <p>
 * After the loop performs all of its iterations, the program should display who
 * was the grand winner: the computer or the user.
 *
 * @author Justin Musgrove
 */
public class DiceGame {
    public static void main (String[] args){
        int user, computer, userscore = 0, computerscore = 0, winnerscore;
        int times =(int) (Math.random() * 100);
        System.out.println("Hai giocato " + times + " volte");
        for (int i = 0; i < times; ++i){
            if (userscore > (times/2) || computerscore> (times/2))
                break;
            user = (int) (Math.random() * 6);
            computer = (int) (Math.random()* 6);
            if (user > computer)
                ++userscore;
            else
                ++computerscore;
        }
        String winner;
        if (userscore != computerscore) {
            if (userscore > computerscore) {
                winner = "l'utente";
                winnerscore = userscore;
            }
            else {
                winner = "il computer";
                winnerscore = computerscore;
            }
            System.out.println("Ha vinto " + winner + " con " + winnerscore + " punti!");
        }
        else {
            System.out.println("Pareggio!");
        }
    }
}
