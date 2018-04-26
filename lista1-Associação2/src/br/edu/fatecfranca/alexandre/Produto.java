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
public class Produto {
    int id; 
    String descricao;
    int qtde;
    float preco;
    
    public Produto(){ 
        this.preco = 0;
        this.qtde = 0;
        this.id = 0;
        this.descricao = "";
        
    }
    public Produto(int id, String descricao , int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
        
    }
    public void comprar(int x){
        this.qtde = this.qtde + x;
        
    }
    public void vender(int x){
        this.qtde = this.qtde - x;
        
    }
    public void subir(float x){
        this.preco = this.preco + x;
        
    }
    public void descer(float x){
        this.preco = this.preco - x;
        
    }
    public String mostra(){
        return this.descricao + this.id + this.qtde + this.preco;
        
        
    }
}

