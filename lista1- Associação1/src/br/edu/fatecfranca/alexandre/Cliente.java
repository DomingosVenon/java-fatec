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
public class Cliente {
   int numeroConta;
   int numeroAgencia; 
   String nome;
   float saldo; 

    public Cliente (){
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0;
    }
    
   public void realizarDeposito(float x){
       this.saldo= this.saldo + x;
   } 
   public void realizarSaque(float x){
       this.saldo= this.saldo - x;
       
   }
   public String Atual(){
       return this.numeroConta + " " + this.nome + " " + this.saldo;
       
  }
}
