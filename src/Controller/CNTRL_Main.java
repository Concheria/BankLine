/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MTDS_Main;
import View.FRM_Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DanielSQ
 */
public class CNTRL_Main implements ActionListener{
    
    private FRM_Main window;
    private MTDS_Main methods;
    
    /**
     * Creates new controller CNTRL_Main
     * @param window
     */
    public CNTRL_Main(FRM_Main window)
    {
        this.window = window;
        methods = new MTDS_Main(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add"))
        {
            methods.showAdd();
        }
        
        if(e.getActionCommand().equals("AdminCajas"))
        {
            methods.showLineCajas();
        }
        
        if(e.getActionCommand().equals("AdminServCli"))
        {
            methods.showLineServCli();
        }
    }

    /**
     * @return the methods
     */
    public MTDS_Main getMethods() {
        return methods;
    }

    /**
     * @param methods the methods to set
     */
    public void setMethods(MTDS_Main methods) {
        this.methods = methods;
    }

    /**
     * @return the window
     */
    public FRM_Main getWindow() {
        return window;
    }

    /**
     * @param window the window to set
     */
    public void setWindow(FRM_Main window) {
        this.window = window;
    }
}
