/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import Data.Message;
import Data.Observateur;

/**
 *
 * @author milleree
 */
public abstract class Propriete extends Carreau {
    private Joueur proprietaire;
    private int prixAchat;
    private int prixLoyer;
    


    
    public Propriete (int num, String nom, Joueur proprietaire, int prixAchat, int prixLoyer){
        super(num, nom);
        this.setProprietaire(proprietaire);
        this.prixAchat = prixAchat;
        this.prixLoyer = prixLoyer;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }
    
    public int getPrixAchat(){
        return this.prixAchat;
    }
    
    public int getPrixLoyer(){
        return this.prixLoyer;
    }
    

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
    
    public abstract int calculLoyer(int sommeLances);
    
    public abstract boolean acheterPropriete(Joueur j);
    
    public abstract Message action(Joueur aJ, int sommeLances, String choix);

    /**
     * @param prixLoyer the prixLoyer to set
     */
    public void setPrixLoyer(int prixLoyer) {
        this.prixLoyer = prixLoyer;
    }
        
    
    

    
}
