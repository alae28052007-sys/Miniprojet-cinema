/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini.projet.cinema;

/**
 *
 * @author alae2
 */
public class MiniProjetCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Salle salle1 = new Salle(1, 100);

        Film film1 = new Film("Inception", "Nolan", 148);
        Film film2 = new Film("Titanic", "Cameron", 195);
        Film film3 = new Film("Intouchables", "Nakache", 112);

        Seance seance1 = new Seance(film1, salle1);
        Seance seance2 = new Seance(film2, salle1);
        Seance seance3 = new Seance(film3, salle1);

        salle1.ajouterSeance(seance1);
        salle1.ajouterSeance(seance2);
        salle1.ajouterSeance(seance3);

        System.out.println("=== Séances de la salle n°" + salle1.getNumeroSalle() + " ===");
        System.out.println(salle1.afficherseance());
    }
}

    
    

