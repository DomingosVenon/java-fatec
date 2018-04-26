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
public class Rodoviaria {
   private String nome, cidade;
   private ArrayList<Onibus> onibus;

    public Rodoviaria() {
        this.onibus = new ArrayList();//aloca espaço na memoria
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> onibus) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = onibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        String saida= "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", onibus=";
        for(Onibus aux: this.onibus){
                saida = saida + aux.toString() + "/n";
        }
        return saida;
    }
   
     public void adicionaOnibus(Onibus onibus){
        this.onibus.add(onibus);
    }

    public boolean removeOnibus(Onibus onibus){
        return this.onibus.remove(onibus);
    }
    
    public boolean consultaOnibus(Onibus onibus){
        return this.onibus.contains(onibus);
    }
    
    public boolean atualizaOnibus(Onibus atual, Onibus novo){
        //encontra posição atual
        int pos = this.onibus.indexOf(atual);
        if(pos != -1){
        this.onibus.set(pos, novo);
        return true;
        }
        else return false;
    }
    public void adicionaPassageiro (Passageiro passageiro, Onibus onibus){
       if(this.consultaOnibus(onibus)) {
           onibus.adicionaPassageiro(passageiro);
        
       }
       else System.out.println("onibus não existe");
    }
       
}
