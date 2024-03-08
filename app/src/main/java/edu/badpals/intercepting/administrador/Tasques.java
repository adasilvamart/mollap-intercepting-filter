package edu.badpals.intercepting.administrador;

import edu.badpals.intercepting.filtres.Filtre;
import edu.badpals.intercepting.targets.Target;

import java.util.List;
import java.util.ArrayList;

public class Tasques {
    private List<Filtre> tareas = new ArrayList<>(); 
    private Target target;

    public Tasques() {
    }

    public void execucio(String cadena) {

        getTareas().forEach(o -> o.execucio(cadena));
        getTarget().execucio(cadena);
    }

    public List<Filtre> getTareas(){
        return this.tareas;
    }

    public void agregarTarea(Filtre filtre) {
        tareas.add(filtre);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Target getTarget() {
        return this.target;
    }
}
