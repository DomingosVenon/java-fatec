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
public class TestaProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //       Carro obj1 = new Carro();
        Produto obj1 = new Produto();
        Produto obj2 = new Produto(30, "coco", 1000, 1.00f);
       
        obj1.comprar(100);
        obj1.vender(30);
        obj1.subir(1000);
        obj1.descer(500);
       
        
        
        JOptionPane.showMessageDialog(null, "Obj1 " + obj1.mostra());
        JOptionPane.showMessageDialog(null, "Obj2 " + obj2.mostra());

        
        
    }
    
}
