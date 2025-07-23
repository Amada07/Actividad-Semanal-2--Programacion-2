/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultaveterinaria;

import java.util.ArrayList;

/**
 *
 * @author amada
 */
public class ConsultaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mascota> listaMascotas= new ArrayList<>();
       
        Mascota perro =new Perro ();
        Mascota gato = new Gato();
        Mascota conejo = new Conejo();
        Mascota tortuga= new Tortuga();
        
        listaMascotas.add(perro);
        listaMascotas.add(gato);
        listaMascotas.add(conejo);
        listaMascotas.add(tortuga);
        
        for(Mascota m: listaMascotas){
            m.hacerSonido();
            m.descansar();
            
            if(m instanceof AtencionEspecial){
                ((AtencionEspecial)m).recibirAtencionEspecial();
            }
            
            if (m instanceof Vacunable){
                ((Vacunable)m).vacunar();
            }
        }
    }
    
}
