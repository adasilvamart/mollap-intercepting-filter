package edu.badpals.intercepting.clients;

import edu.badpals.intercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client {
    ProgramadorTasques tasques = null;

    @Override
    public void setProgramadorTasques(ProgramadorTasques tasques) {
        this.tasques = tasques;
    }

    @Override
    public void enviarPeticio(String cadena) {
        tasques.executarTasques(cadena);
    }

}
