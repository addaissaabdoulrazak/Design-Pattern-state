/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern_state;

/**
 *
 * @author USER-PC
 */
public interface Avion {
    
    void sortirDuGarage();//opération de trasition d'etat
    void enterAuGarage();//Opération de transition d'etat
    void decoller();//opération de transition d'etat
    void atterir();//operation de transition d'etat
    void doActivity();//Activité
}
