/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre;

/**
 *
 * @author 1090481621001
 */
public class TestaViagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maneira 1
        Voo v1 = new Voo ("sp", "42-x");
        Reserva r1 =  new Reserva (972,v1);
        Passageiro p1 = new Passageiro ("edigleison",r1);
        
        //maneira 2
        Voo v2= new Voo();
        v2.setDestino("sp");
        v2.setNumero("42-x");
    
        Reserva r2 = new Reserva();
        r2.setCodigo(972);
        r2.setVoo(v2); //atenção
        
        Passageiro p2 = new Passageiro();
        p2.setNome("edigleison");
        p2.setReserva(r2); //atenção
    
        System.out.println(p2.toString());
        
        //maneira 3 
        Voo v3= new Voo("sp","42-x");
        Reserva r3 = new Reserva();
        r3.setCodigo(972);
        Passageiro p3 = new Passageiro();
        p3.setNome("edigleison");
        p3.setReserva(r3);//atenção
        p3.setVoo(v3); //atenção
    
        System.out.println(p3.toString());
    }
    
}
