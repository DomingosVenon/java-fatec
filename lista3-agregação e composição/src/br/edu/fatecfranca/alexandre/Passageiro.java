/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre;

/**
 *
 * @author alexandreadm
 */
public class Passageiro {
        private String nome;
        private Reserva reserva;

    public Passageiro() {
        
    }

    public Passageiro(String nome, Reserva reserva) {
        this.nome = nome;
        this.reserva = reserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public void setVoo(Voo voo){
        this.reserva.setVoo(voo);
        
    }
    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", reserva=" + reserva.toString() + '}';
    }



}

    
 



