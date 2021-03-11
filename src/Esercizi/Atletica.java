package Esercizi;

import Classi.Atleta;

/**
 * Creare una classe Java atleta per descrivere dei partecipanti di atletica leggera,
 * di conseguenza dovranno avere gli attributi
 * basi delle persone più la specialità scelta.
 * Creare poi un main in cui riempire un array di N atleti e estrapolare,
 * tramite metodi della classe, quali atleti praticano la disciplina ricercata.
 */

public class Atletica {
    public static void main(String[] args){
        String specialità = "Giavellotto";
        System.out.println("Gli atleti che praticano la specialità " + specialità + " sono:");
        Atleta[] vettore = new Atleta[3];
        Atleta p = new Atleta();
        vettore[0] = new Atleta("Luca", "Giuliani", 15, 70.5, 1.90, "Giavellotto");
        vettore[1] = new Atleta("Maria", "Teresa", 15, 70.5, 1.90, "Giavellotto");
        vettore[2] = new Atleta("Luigi", "Neri", 21, 30.5, 1.60, "Schifo");
        p.PrintAtleti(specialità, vettore);
    }
}
