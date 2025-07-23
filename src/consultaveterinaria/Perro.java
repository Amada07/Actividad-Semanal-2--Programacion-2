/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author amada
 */
public class Perro extends Mascota implements Vacunable {
  
    @Override
    public void hacerSonido(){
       System.out.println("El perro ladra: Guau"); 
  }
   @Override 
    public void vacunar(){
        System.out.println("Vacunando al perro ");
    }
}