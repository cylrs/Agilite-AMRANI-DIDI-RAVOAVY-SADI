package Stepdefinition;

import java.util.Objects;

/**
 * Décrivez votre classe Plat ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Plat
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom; 
    private int prix;
    private int composition;
    private Recette recetteP;
    private Menu menu;
    /**
     * Constructeur d'objets de classe Plat
     */
    public Plat()
    {
    }
    public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public String getNom(){
        return this.nom;
    }

    public void setNom(String s){
        nom = s;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plat plat = (Plat) o;
        return Objects.equals(nom, plat.nom) &&
                Objects.equals(prix, plat.prix)&&Objects.equals(composition, plat.composition);
    }
    
    public void setRecetteP(Recette r){
        this.recetteP =r;
    }
    
    public String commanderPlat(String name, int price)
    {
        return("vous avez commande le plat "+name+", il coute "+price+" euro\n");
    }

   /* public int preparerPlat(int nbIng){
        this.composition = this.recette.ajouterIng(nbIng);
        return this.composition;
       }*/
  
}
