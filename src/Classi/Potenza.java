package Classi;

/**
 * Crea un programma dotato di una classe 'potenza' che implementa la potenza del 2 dei numeri (interi) associati agli
 * oggetti istanziati nella classe . La classe deve essere dotata di costruttore, di un metodo pow() che stampi a video
 * la potenza del numero associato all'oggetto, e di un metodo cambiobase() che deve permettere di cambiare base alla potenza da calcolare.
 */
public class Potenza {
    //Parameters
    private int number;
    private int base = 2;

    //Constructor
    public Potenza(){
        number = 0;
    }
    public Potenza(int number){
        this.number = number;
    }
    public Potenza(Potenza number){
        this.number = number.number;
    }

    //Getters and Setters
    public int getNumber(){
        return this.number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    //toString
    @Override
    public String toString() {
        return "Potenza{" +
                "number=" + number +
                '}';
    }

    //Methods
    public int pow(){
        if (this.number == 0){
            return 1;
        }
        int s = base;
        for (int i = 1; i < this.number; ++i){
            s *= base;
        }
        return s;
    }

    public void cambiobase(int number){
        base = number;
    }
}

