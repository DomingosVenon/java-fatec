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
public class Aluno {
    int numeroAluno, idade; 
    float p1, p2;
    String nome;
    
    public Aluno(){
        this.numeroAluno = 0;
        this.idade = 0;
        this.nome = "";
        this.p1 = 0;
        this.p2 = 0;
    }
    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
     
    public String passou(){
         if (this.notaFinal()>6)
             return "passou";
         else
             return "retiro";
    }           
}
