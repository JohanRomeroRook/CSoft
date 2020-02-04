/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionsoftware;

/**
 *
 * @author Netpp4
 */
abstract class Persona {
    private String nombre;
    private String edad;

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodo que devuelve los datos de la persona
    abstract String datos();
    abstract String edad();
}
