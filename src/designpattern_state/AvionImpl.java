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
/*
Nous allons creer nos classe A l'exterieur  ce qui va ce traduit comme une relation =>"bidirectionnelle"<=
car dans les classe qui herite de State nous ne pouvons pas manipuler l'attribut "state"

Par cotre lorsque vous souhaitez effectuer une Manipulation simple il faut utiliser les classe interne
*/

public class AvionImpl implements Avion {

    //une relation(association,composition ou agregation)  est etablis entre une Implementation et  une Interface et non une Interfece et une Interface
    //il est aussi possible d'etablir une relation(association,composition ou agregation) entre une Classe Abstraite et une Classe Abstraite.
    //--une Relation peut exister entre une classe et une classe quelle soi abstraite ou pas mais pas entre une interface et une interface
   protected State state;
   
 /**il existe toujours une implementation par defaut pour ce qui concerne l'Etat D'un Objet et je rappel qu'il sagit d'une realation Bidirectionelle et Donc un état est composer d'un avion
  * Ainsi donc un Constructeur parametrer est utiliser qui prends En Parametre l'objet Avion et Donc tous les Etats vont Prendre En parametre le type Avion 
  * Vous Pouvez le remarquer [ State = new EtatEnPiste(this); this etant le parametre 
  **/  
    public AvionImpl()
    {
      state=new EtatEnPiste(this);
    }
    
    @Override
    public void sortirDuGarage() {
        
     /* l'appel a la methode SortirDuGarage Delegue la responsablité au State */ 
      state.executeSortirDuGarage();
    }

    @Override
    public void enterAuGarage() {
      state.executeEnterAuGarage();
    }

    @Override
    public void decoller() {
       state.executeDecoller();
    }

    @Override
    public void atterir() {
     state.executeAtterir();
    }

    @Override
    public void doActivity() {
      state.executeDoActivity();
    }
  

 

}
