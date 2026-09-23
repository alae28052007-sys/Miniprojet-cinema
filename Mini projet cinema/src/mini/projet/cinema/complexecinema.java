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
public class ComplexeCinema {
    private ArrayList<Cinema> listcinema;
    
    public ComplexeCinema(){
        this.listcinema=new ArrayList<>();
    }
    public void ajoutercinema(Cinema c){
         this.listcinema.add(c);
    }
   
        
    
            
            
    public ArrayList<Cinema> getListcinema() {
        return listcinema;
    }

    public void setListcinema(ArrayList<Cinema> listcinema) {
        this.listcinema = listcinema;
    }
    
    
}
