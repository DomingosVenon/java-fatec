/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.minha.testa;

import br.edu.fatecfranca.alexandre.Cliente;

/**
 *
 * @author 1090481621001
 */
public class Lista2MinhaTesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Cliente cli1 = new Cliente(); 
        
        cli1.setNome("alexandre");
        cli1.setNumeroAgencia("3458-9");
        cli1.setNumeroAgencia("234984-3");
        cli1.setSaldo(300);
        
        Cliente cli2 = new Cliente("675849-0","1546-6","marcos", 1000);
    
        cli2.realizarDeposito(11);
        cli2.realizarSaque(33);
    
        cli1.realizarDeposito(44);
        cli1.realizarSaque(55);
        
        System.out.println(cli1.paraString());
        System.out.println(cli2.paraString());
    }
    
}
