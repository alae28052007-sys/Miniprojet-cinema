/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet.cinema;
import java.util.ArrayList;
/**
 *
 * @author alae2
 */
public class Film {
    private String titre;
    private String realisateur;
    private int duree;
    
    
    public Film(String titre,String realisateur,int duree){
        this.titre=titre;
        this.realisateur=realisateur;
        this.duree= duree;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    
}
