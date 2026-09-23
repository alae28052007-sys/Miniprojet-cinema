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
public class Cinema {
    private String ville;
    private ArrayList<Salle> listSalle;
    
    public Cinema(String ville){
        this.ville = ville;
        this.listSalle = new ArrayList<>();
    }
    
    public void ajouterSalle(Salle s){
        this.listSalle.add(s);
    }
    
    public ArrayList<Salle> getListSalles() {
        return listSalle;
    }
    
    public String afficherseance() {
        String resultat = "";
        for (Salle salle : listSalle) {
            resultat += salle.afficherseance() + " ";
        }
        return resultat;
    }

    public String getVille() {
        return ville;
    }
}


