package edu.badpals.intercepting.administrador;

import edu.badpals.intercepting.filtres.Filtre;
import edu.badpals.intercepting.targets.Target;

public class ProgramadorTasques {
    private Tasques tasques = null;

    public ProgramadorTasques(Target target){
        tasques = new Tasques();
        tasques.setTarget(target);
    }

    public Tasques getTasques(){
        return this.tasques;
    }

    public void setTasca(Filtre filtre) {
        getTasques().agregarTarea(filtre);
    }

    public void executarTasques(String cadena) {
        tasques.execucio(cadena);
    }
}
