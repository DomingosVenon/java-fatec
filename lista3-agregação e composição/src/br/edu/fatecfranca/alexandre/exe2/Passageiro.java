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
public class Passageiro {
    private String nome;
    private int poltrona;

    public Passageiro() {
    }

    public Passageiro(String nome, int poltrona) {
        this.nome = nome;
        this.poltrona = poltrona;
    }

    public String getNome() {
        return nome;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", poltrona=" + poltrona + '}';
    }
    
    
}
