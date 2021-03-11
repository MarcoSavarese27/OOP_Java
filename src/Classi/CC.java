package Classi;


import java.util.Scanner;

/**
 *Crea un programma per la gestione di un controcorrente gestito dalla classe CC. Il programma deve essere in grado di
 * effettuare versamenti, prelievi, di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .
 */

public class CC {
    //Parameters
    private double conto;
    private String[] movimenti = new String[5];
    private int mov = movimenti.length - 1;

    //Constructors
    public CC(){
        this.conto = 0;
    }
    public CC(double conto){
        this.conto = conto;
    }
    public CC(CC conto){
        this.conto = conto.conto;
    }

    //Setters and Getters
    public double getConto() {
        return conto;
    }
    public void setConto(double conto) {
        this.conto = conto;
    }

    //toString
    @Override
    public String toString(){
        return "Il tuo conto è " + this.conto;
    }

    //Methods
    public void bancomat(){
        System.out.println("Seleziona cosa vuoi fare: ");
        System.out.println("v - versamento \np - prelievo \ns - mostra il saldo \nl - mostra la lista degli ultimi 5 movimenti");
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        s = s.toLowerCase();
        switch (s){
            case "v":
                System.out.println("Scegli la somma da versare: ");
                double ver = (keyboard.nextDouble());
                conto += ver;
                if (mov == 0)
                    mov = 4;
                movimenti[mov] = "Versamento";
                --mov;
                break;
            case "p":
                System.out.println("Scegli la somma da prelevare: ");
                double prel = (keyboard.nextDouble());
                if(prel <= conto){
                    conto -= prel;
                    System.out.println("Hai prelevato con successo " + prel + " euro");
                    if (mov == 0)
                        mov = 4;
                    movimenti[mov] = "Prelievo";
                    --mov;
                }else{
                    System.out.println("Importo non valido! Il tuo saldo è inferiore a " + prel + " euro, riprova.");
                }
                break;
            case "s":
                System.out.println("Il tuo saldo corrisponde a " + conto + " euro");
                if (mov == 0)
                    mov = 4;
                movimenti[mov] = "Visione del Saldo";
                --mov;
                break;
            case "l":
                System.out.println("Questa è la lista degli ultimi movimenti");
                boolean contr = true;
                for (String i: movimenti) {
                    if (i != null) {
                        System.out.println(i);
                        contr = false;
                    }
                }
                if (contr){
                    System.out.println("Non ci sono azioni recenti!");
                }
                break;
            default:
                System.out.println("COMANDO NON VALIDO!");
                break;
        }
        bancomat();
    }

}
