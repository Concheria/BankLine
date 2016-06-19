/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MTDS_Add;
import View.FRM_Add;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DanielSQ
 */
public class CNTRL_Add implements ActionListener{
    
    private final FRM_Add window;
    private final MTDS_Add methods;
    
    public CNTRL_Add(FRM_Add window)
    {
        this.window = window;
        methods = new MTDS_Add(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add"))
        {
            
        }
    }
}
