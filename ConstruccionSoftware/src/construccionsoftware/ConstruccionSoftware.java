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
        // TODO code application logic here
        //se declaran las variables que vamos a utilizar
        String Nombre="Yisus";
        String Apellildo=" de Nazareth";
        int Edad=2020;
        //se debe de crear una instancia de la clase persona
        Persona p=new Persona(Nombre,Apellildo,Edad);
        //se muestran los datos de la persona en un mensaje.-
        JOptionPane.showMessageDialog(null,"Nombre Completo:\n"+ p.datos()+"\n"
                + "Edad: "+p.edad()+" años");
    }
    
}