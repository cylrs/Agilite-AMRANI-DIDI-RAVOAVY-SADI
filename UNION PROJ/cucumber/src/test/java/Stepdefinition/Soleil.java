package Stepdefinition;

import org.apache.commons.lang.ObjectUtils;

import javax.print.DocFlavor;

public class Soleil {
    private static  Soleil instance;
    private static String etoile;

    private  Soleil() { }

    public static Soleil getInstance()
    {
        if (instance == null){
            instance = new Soleil();
            etoile="Soleil";
        }
        return instance;
    }

    @Override
    public String toString()
    {
        return String.format("Je suis l'etoile : %s", etoile);
    }
    public String getEtoile() {return etoile; }
}

