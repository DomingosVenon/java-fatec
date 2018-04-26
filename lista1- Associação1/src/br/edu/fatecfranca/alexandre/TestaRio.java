/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandreadm
 */
public class TestaRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Rio obj2 = new Rio();
    
    Rio obj1 = new Rio("negro", 2.00f, true);
    
    obj2.chover(100);
    
    obj2.ensolarar(50);
    
    obj2.limpar();
    
    obj2.sujar();
            
    JOptionPane.showMessageDialog(null, "Obj1 " + obj1.mostra());
    JOptionPane.showMessageDialog(null, "Obj2 " + obj2.mostra());
    
    
    
    }
    
}
