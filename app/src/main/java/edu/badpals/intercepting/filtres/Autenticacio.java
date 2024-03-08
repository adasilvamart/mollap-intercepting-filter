package edu.badpals.intercepting.filtres;

public class Autenticacio implements Filtre{
    
    public Autenticacio() {}
    
    @Override
    public void execucio(String id) {
        System.out.println("Autenticacio OK para " + id);
    }

}
