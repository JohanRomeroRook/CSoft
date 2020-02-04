/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionsoftware;

/**
 *
 * @author sala6
 */
public class Empleado extends Persona{
    
   public Empleado (String nombre ,String edad){
       super.setNombre(nombre);
       super.setEdad(edad);
   }
   public String datos(){
    return "El nombre es "+super.getNombre();
}
   public String edad(){
    return "la edad es "+super.getEdad();
}
 
}
