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
    private ArrayList<Seance> listsceance;
    
    public Cinema(String ville){
        
        this.ville=ville;
        this.listsceance=new ArrayList<>();
    }
    
 
}
