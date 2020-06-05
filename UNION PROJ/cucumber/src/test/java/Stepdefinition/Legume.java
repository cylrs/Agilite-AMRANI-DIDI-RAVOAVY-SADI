package Stepdefinition;

public class Legume {
    private String nom;
    private Planete planeteMere;


    public Legume(String nom, Planete mere) {
        this.nom = nom;
        this.planeteMere = mere;
    }
    public String getName(){ return this.nom; }
    public Planete getMere(){return this.planeteMere;}
    public void setName(String nom){this.nom = nom;}
    public boolean isSoleil(){
        return (this.planeteMere.getEtoile() == "Soleil");
    }

}
