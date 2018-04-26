/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre;

import javax.swing.JOptionPane;

/**
 *
 * @author 1090481621001
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente obj1 = new Cliente();
        obj1.realizarDeposito(10);
        obj1.realizarSaque(30);
        obj1.Atual();
        JOptionPane.showMessageDialog(null, obj1.Atual());
    
        Cliente obj2 = new Cliente();
        obj2.realizarDeposito(10);
        obj2.realizarSaque(30);
        
        JOptionPane.showMessageDialog(null, obj2.Atual());
    
    }
    
    
    
    
}
