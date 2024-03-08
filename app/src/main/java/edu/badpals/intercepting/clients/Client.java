package edu.badpals.intercepting.clients;

import edu.badpals.intercepting.administrador.ProgramadorTasques;

public interface Client {
    public void setProgramadorTasques(ProgramadorTasques tasques);
    public void enviarPeticio(String cadena);
}
