/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.minha.testa;

import br.edu.fatecfranca.alexandre.Aluno;

/**
 *
 * @author 1090481621001
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno Al1 = new Aluno(); 
        
        Al1.setNumeroAluno(789456);
        Al1.setNome("Rodrigo");
        Al1.setIdade(23);
        Al1.setP1(5);
        Al1.setP2(8);
        
        Aluno Al2 = new Aluno(675849,"Anderson", 30, 10, 10);
    
        
        
        System.out.println(Al1.dadosAluno());
        System.out.println(Al2.dadosAluno());   // TODO code application logic here
    }
    
}
