package Classi.Utili;

public class Persona {
    private double peso;
    private double altezza;

    public Persona() {
        this.peso = 0;
        this.altezza = 0;
    }

    public Persona(double peso, double altezza) {
        this.peso = peso;
        this.altezza = altezza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltezza() {
        return this.altezza;
    }

    public String BMI() {
        double bmi = this.peso / (this.altezza * this.altezza);
        System.out.println(bmi);
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
