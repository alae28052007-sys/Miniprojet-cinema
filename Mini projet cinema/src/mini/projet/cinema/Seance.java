/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini.projet.cinema;

/**
 *
 * @author alae2
 */
public class Seance {
    private Film film;
    private Salle salle;
    
    
    public Seance(Film film,Salle salle){
        this.film=film;
        this.salle=salle;
        
    }
    public String afficherseance(){
         return "Film : " + film.getTitre() + " - Salle : " + salle.getNumeroSalle();
    }

    public Film getFilm() {
        return film;
    }

    public Salle getSalle() {
        return salle;
    }
    
}
