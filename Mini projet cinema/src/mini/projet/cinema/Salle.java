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
public class Salle {
    private int numeroSalle;
    private int nombreSiege;
    private ArrayList<Seance> listSeance;

    public Salle(int numeroSalle, int nombreSiege) {
        this.numeroSalle = numeroSalle;
        this.nombreSiege = nombreSiege;
        this.listSeance = new ArrayList<>();
    }

    public ArrayList<Seance> getListSeance() {
        return listSeance;
    }

    public void ajouterSeance(Seance s) {
        this.listSeance.add(s);
    }
    public String afficherseance() {
        String resultat = "";
        for (Seance s : listSeance) {
        resultat += s.afficherseance() + " ";
    }
    return resultat;

    }

    public int getNumeroSalle() {
        return numeroSalle;
    }
    
}
    

