package edu.badpals.intercepting.targets;


public class Vehicle implements Target{
    
    public Vehicle(){
    }

    public void execucio(String cadena) {
        System.out.println("Puerta abierta " + cadena + "!");
    }
}
