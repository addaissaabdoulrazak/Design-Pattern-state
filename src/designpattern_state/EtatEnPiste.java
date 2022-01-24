/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern_state;

/**
 *
 * @author Adda-Issa-Abdoul-Razak
 */
/*
* Toutes Les Classe qui Herite de la classe State sont des Types State et herite de façon abstraite du type "AvionImpl avion" Declarer dans la Classe Abstraite State.
                                                                                                                              
*/
    public class EtatEnPiste extends State{

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }
        @Override
        void executeSortirDuGarage() {
            System.out.println("Impossible de sortir du garage. c'est a dire que la transition n'est pas Possible\n"
                    + " lorsque vous etes en piste vous ne pouvez pas sortir du Garage ");
        }

        @Override
        void executeEnterAuGarage() {
        /*Particularité de changer d'état sachant que nous Somme dans un autre état Différent*/   
          System.out.println("Transition d'etat de En Piste =>Garage");
          avion.state = new EtatAuGarage(avion);
        }

        @Override
        void executeDecoller() {
            
        }

        @Override
        void executeAtterir() {
           
        }

        @Override
        void executeDoActivity() {
            
        }
    
    
    }
