package Classi;

/**
 * Creare una classe Java atleta per descrivere dei partecipanti di atletica leggera,
 * di conseguenza dovranno avere gli attributi
 * basi delle persone più la specialità scelta.
 * Creare poi un main in cui riempire un array di N atleti e estrapolare,
 * tramite metodi della classe, quali atleti praticano la disciplina ricercata.
 */

public class Persona {
    //Parameters
    private String nome;
    private String cognome;
    private int età;
    private double peso;
    private double altezza;

    //Construtors
    public Persona(){
        this.nome = " ";
        this.cognome = " ";
        this.età = 0;
        this.peso = 0.0;
        this.altezza = 0.0;
    }
    public Persona(String nome, String cognome, int età, double peso, double altezza){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.peso = peso;
        this.altezza = altezza;
    }
    public Persona(Persona persona){
        this.nome = persona.nome;
        this.cognome = persona.cognome;
        this.età = persona.età;
        this.peso = persona.peso;
        this.altezza = persona.peso;
    }

    //Getters and Setters
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public int getEtà() {
        return età;
    }
    public void setEtà(int età) {
        this.età = età;
    }

    //toString
    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", Cognome='" + cognome + '\'' +
                ", Età=" + età +
                ", Peso=" + peso +
                ", Altezza=" + altezza;
    }

    //Methods
    public String BMI() {
        double bmi = this.peso / (this.altezza * this.altezza);
        System.out.printf("%.2f\n", bmi);
        String ris;
        if (bmi < 18.5) {
            ris = "sottopeso";
        } else if (bmi > 25) {
            ris = "sovrappeso";
        } else {
            ris = "normopeso";
        }
        return ris;
    }
}
