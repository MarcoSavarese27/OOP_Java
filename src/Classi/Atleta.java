package Classi;

public class Atleta extends Persona{
    //Parameters
    private String specialità;

    //Constructors
    public Atleta(){
        super();
        this.specialità = "";
    }
    public Atleta(String nome, String cognome, int età, double peso, double altezza, String specialità) {
        super(nome, cognome, età, peso, altezza);
        this.specialità = specialità;
    }
    public Atleta(Atleta atleta){
        super(atleta);
        this.specialità = atleta.specialità;
    }

    //Getter and Setter
    public String getSpecialità() {
        return specialità;
    }
    public void setSpecialità(String specialità) {
        this.specialità = specialità;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+ ", Specialità='" + specialità + "'";
    }

    //Methods
    public void PrintAtleti(String specialità, Atleta[] atleti){
        int dim = atleti.length;
        for (int i = 0; i < dim; ++i){
            if (specialità == atleti[i].getSpecialità()){
                System.out.println("Nome: " + atleti[i].getNome() + "\tCognome: " + atleti[i].getCognome() + "\tEtà: " + atleti[i].getEtà());
            }
        }
    }
}
