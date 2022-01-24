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

    
  /*cette classe est Ecrit dans ce fichier parceque c'est Etat(State) ne  concerne que les Avion(classe Avion )
    Par contre vous pouvez l' externaliser

------------------------------------------------------------------------------------------------------------------------
L’État peut être considéré comme une extension de la Stratégie. Ces deux patrons de conception sont basés sur la composition :
ils changent le comportement du contexte en déléguant certaines tâches aux objets assistant.
La stratégie rend ces objets complètement indépendants sans aucune visibilité l’un sur l’autre.
** Cependant, l’état n’impose pas de restrictions sur les dépendances entre les états concrets, et leur laisse modifier l’état du contexte à volonté. **
*/
public abstract class State {

   protected AvionImpl avion;
    public State(AvionImpl avion) {
       this.avion=avion; 
    }
    
    
       abstract void executeSortirDuGarage();//opération de trasition d'etat
       abstract void executeEnterAuGarage();//Opération de transition d'etat
       abstract void executeDecoller();//opération de transition d'etat
       abstract void executeAtterir();//operation de transition d'etat
       abstract void executeDoActivity();//Activité
}
