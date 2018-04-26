/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre.exe2;

import java.util.ArrayList;

/**
 *
 * @author 1090481621001
 */
public class Onibus {
    private int numero;
    private ArrayList <Passageiro> passageiros;

    public Onibus(int numero, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.passageiros = passageiros;
    }

    public Onibus() {
        passageiros = new ArrayList();
        
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPassageiro(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        String saida= "Onibus{" + "numero=" + numero + ", passageiro=" + passageiros + '}';
           //estrutura de repetição
           for(Passageiro aux: passageiros){
               saida = saida + aux.toString() + "/n";
           }
           return saida;
    }
   
    public void adicionaPassageiro(Passageiro passageiro){
        this.passageiros.add(passageiro);
    }

    public boolean removePassageiro(Passageiro passageiro){
        return this.passageiros.remove(passageiro);
    }
    
    public boolean consultaPassageiro(Passageiro passageiro){
        return this.passageiros.contains(passageiro);
    }
    
    public boolean atualizaPassageiro(Passageiro atual, Passageiro novo){
        //encontra posição atual
        int pos = this.passageiros.indexOf(atual);
        if(pos != -1){
        this.passageiros.set(pos, novo);
        return true;
        }
        else return false;
    }
    
}