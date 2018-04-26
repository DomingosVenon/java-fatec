/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre.exe2;

/**
 *
 * @author 1090481621001
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro ("eduardo",10);
        Passageiro p2 = new Passageiro ("edi",20);
        Passageiro p3 = new Passageiro ("ale",30);
        Passageiro p4 = new Passageiro ("gaby",15);
        
        Onibus o1 = new Onibus();
        o1.adicionaPassageiro(p1);
        o1.adicionaPassageiro(p2);
        o1.adicionaPassageiro(p3);
        o1.adicionaPassageiro(p4);
        
        Onibus o2 = new Onibus();
        o2.setNumero(632);
        o2.adicionaPassageiro(p3);
        o2.adicionaPassageiro(p4);
     
        Rodoviaria rodo = new Rodoviaria();
        rodo.setNome("franca");
        rodo.setCidade("franca");
        rodo.adicionaOnibus(o1);
        rodo.adicionaOnibus(o2);
        
       // System.out.println(rodo.toString());
        
       // o1.removePassageiro(p2);
      //  System.out.println(o1.toString());
        
       // System.out.println(o1.consultaPassageiro(p4));
        //ystem.out.println(o1.consultaPassageiro(p2));
       
      
        Passageiro p5 = new Passageiro ("leonardo", 18);
        rodo.adicionaPassageiro(p5, o2);
        System.out.println(rodo.toString());
      //  o1.atualizaPassageiro(p2, p5);
       // System.out.println(o1.toString());

        
        
    }
    
}
