/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionsoftware;

import javax.swing.JOptionPane;

/**
 *
 * @author Netpp4
 */
public class ConstruccionSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Persona empleado = new Empleado("Johan","15");
 
        
        System.out.println(empleado.datos());
        System.out.println(empleado.edad());
        
        Persona alumno = new Alumno("Alex","16");
        
        System.out.println(alumno.datos());
        System.out.println(alumno.edad());


    } 
    }
    
