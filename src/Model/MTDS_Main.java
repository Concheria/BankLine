/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.CNTRL_Main;
import View.FRM_Add;
import View.FRM_Line;

/**
 *
 * @author DanielSQ
 */
public class MTDS_Main {
    
    private final CNTRL_Main controlador;
    
    private final FRM_Add add;
    private final FRM_Line lineCajas;
    private final FRM_Line lineServCli;
    
    /**
     * Creates new methods MTDS_Main
     * @param controlador
     */
    public MTDS_Main(CNTRL_Main controlador)
    {
        this.controlador = controlador;
        
        add = new FRM_Add(this);
        lineCajas = new FRM_Line(this, "Cajas");
        lineServCli = new FRM_Line(this, "ServCli");
    }
    
    /**
     * Show add frame
     */
    public void showAdd()
    {
        add.setVisible(true);
    }
    
    public void showLineCajas()
    {
        lineCajas.setVisible(true);
    }
    
    public void showLineServCli()
    {
        lineServCli.setVisible(true);
    }
}
