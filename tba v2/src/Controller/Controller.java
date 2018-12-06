/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tba.*;

/**
 *
 * @author YAHYA
 */
public class Controller implements ActionListener {
    private View GUI;
    private Cek tba;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(GUI.getjButton1())) {
            GUI.setTfHasil(tba.cekKalimat(GUI.getTfKalimat()));
            GUI.refresh();
            tba=new Cek();
        }else  if (source.equals(GUI.getjButton2())) {
            GUI.setTfHasil("");
            GUI.setTfKalimat("");
        }
    }
    public Controller () {
        GUI=new View();
        GUI.setVisible(true);
        tba=new Cek();
        GUI.addActionListener(this);
    }
    
}
