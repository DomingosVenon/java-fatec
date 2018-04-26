/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre.exe3;

/**
 *
 * @author 1090481621001
 */
public class Topico {
    private String assunto;

    public Topico() {
    }

    public Topico(String assunto) {
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Topico{" + "assunto=" + assunto + '}';
    }
    
}
