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
public class Rio {
     String nome;
     float nivel;
     boolean poluido;
     
public Rio(){ 
        this.nome = "";
        this.nivel = 0;
        this.poluido = true;
        
        
    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = "";
        this.nivel = 0;
        this.poluido = false;
    }     
    public void chover(float x){
        this.nivel = this.nivel + x;
    }
    public void ensolarar(float x){
        this.nivel = this.nivel-x;
    }
    public void limpar(){
        this.poluido= false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public String mostra(){
        return this.nome + this.nivel + this.poluido;
        
    
    
}   

}
