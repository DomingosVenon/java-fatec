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
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        
        Aluno obj2 = new Aluno(123, 20, "Alexandre", 8, 7);
        
       JOptionPane.showMessageDialog(null, obj2.passou());
    }
    
}
