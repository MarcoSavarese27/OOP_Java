package Esercizi;

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
