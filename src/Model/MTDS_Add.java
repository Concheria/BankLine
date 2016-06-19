/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.CNTRL_Add;

/**
 *
 * @author DanielSQ
 */
public class MTDS_Add {
    
    private NODE_Clients clientStart;
    
    private final CNTRL_Add controller;
    
    public MTDS_Add(CNTRL_Add controller)
    {
        this.controller = controller;
    }
    
    public void addNode(String nombre, String edad, boolean isCajas, boolean isAtencion, boolean isPrioridad)
    {
        int edadInt = Integer.parseInt(edad);
        
        String tipo = "";
        
        if(isCajas)
        {
            tipo = "Cajas";
        }
        else if(isAtencion)
        {
            tipo = "Atencion";
        }
        
        if(clientStart == null)
        {
            createNodes(nombre, edadInt, tipo, isPrioridad);
        }
    }
    
    public void createNodes(String nombre, int edad, String tipo, boolean isPrioridad)
    {
        clientStart = new NODE_Clients(nombre, edad, tipo, isPrioridad, null);
    }

    /**
     * @return the clientStart
     */
    public NODE_Clients getClientStart() {
        return clientStart;
    }

    /**
     * @param clientStart the clientStart to set
     */
    public void setClientStart(NODE_Clients clientStart) {
        this.clientStart = clientStart;
    }
}
