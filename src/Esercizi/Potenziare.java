package Esercizi;

import Classi.Potenza;
/**
 * Crea un programma dotato di una classe 'potenza' che implementa la potenza del 2 dei numeri (interi) associati agli
 * oggetti istanziati nella classe . La classe deve essere dotata di costruttore, di un metodo pow() che stampi a video
 * la potenza del numero associato all'oggetto, e di un metodo cambiobase() che deve permettere di cambiare base alla potenza da calcolare.
 */

public class Potenziare {
    public static void main(String[] args) {
        Potenza num = new Potenza(2);
        int ris = num.pow();
        System.out.println(ris);
        num.cambiobase(4);
        ris = num.pow();
        System.out.println(ris);
    }
}
