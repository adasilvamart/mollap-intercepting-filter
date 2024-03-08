package edu.badpals.intercepting.filtres;

public class Autoritzacio implements Filtre {
    
    public Autoritzacio() {}
    
    @Override
    public void execucio(String id) {
        System.out.println("Autorizacion OK para " + id);
    }
}
