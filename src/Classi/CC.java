package Classi;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *Crea un programma per la gestione di un controcorrente gestito dalla classe CC. Il programma deve essere in grado di
 * effettuare versamenti, prelievi, di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti .
 */
public class CC {
    //Parameters
    private double conto;
    List<String> movimenti = new LinkedList<String>();
    private int mov = 0;

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
        boolean quit = false;
        System.out.println("Seleziona cosa vuoi fare:");
        System.out.println("v - versamento \np - prelievo \ns - mostra il saldo \nl - mostra la lista degli ultimi 5 movimenti");
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        s = s.toLowerCase();
        switch (s){
            case "v":
                System.out.println("Scegli la somma da versare: ");
                double ver = (keyboard.nextDouble());
                conto += ver;
                movimenti.add(0, "Versamento");
                ++mov;
                if(mov > 5){
                    movimenti.remove(5);
                }
                System.out.println("Hai versato con successo " + ver + " euro");
                break;
            case "p":
                System.out.println("Scegli la somma da prelevare: ");
                double prel = (keyboard.nextDouble());
                if(prel <= conto){
                    conto -= prel;
                    System.out.println("Hai prelevato con successo " + prel + " euro");
                    movimenti.add(0, "Prelievo");
                    ++mov;
                    if(mov > 5){
                        movimenti.remove(5);
                    }
                }else{
                    System.out.println("Importo non valido! Il tuo saldo è inferiore a " + prel + " euro, riprova.");
                }
                break;
            case "s":
                System.out.println("Il tuo saldo corrisponde a " + conto + " euro");
                movimenti.add(0, "Visione del saldo");
                ++mov;
                if(mov > 5){
                    movimenti.remove(5);
                }
                break;
            case "l":
                System.out.println("Questa è la lista degli ultimi movimenti");
                int c = 0;
                boolean contr = true;
                for (String i: movimenti) {
                    if(!i.isEmpty()){
                        contr = false;
                        ++c;
                        System.out.print(c + ".");
                        System.out.println(i);
                    }
                }
                if (contr){
                    System.out.println("Non ci sono movimenti recenti!");
                }
                break;
            case "q":
                quit = true;
                break;
            default:
                System.out.println("COMANDO NON VALIDO!");
                break;
        }
        if (!quit) {
            bancomat();
        }
        keyboard.close();
    }
}
