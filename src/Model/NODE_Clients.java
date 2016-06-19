/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author DanielSQ
 */
public class NODE_Clients implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String tipo;
    private int edad;
    private boolean prioridad;
    private NODE_Clients next;
    
    /**
     * Creates the node NODE_Clients
     */
    public NODE_Clients()
    {
        
    }
    
    /**
     * Creates the node NODE_Clients
     * @param nombre
     * @param edad
     * @param servicio
     * @param prioridad
     * @param next
     */
    public NODE_Clients(String nombre, int edad, String servicio, boolean prioridad, NODE_Clients next)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = servicio;
        this.prioridad = prioridad;
        this.next = next;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the prioridad
     */
    public boolean isPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
}
