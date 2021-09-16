/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andre.usuariossql;

import com.andre.usuariossql.view.TelaPrincipal;
import com.andre.usuariossql.view.TelaUsuarios;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args){
        lookAndFeel();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
    
    private static void lookAndFeel(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }
}
