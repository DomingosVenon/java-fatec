/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre.exe3;


import java.util.ArrayList;

/**
 *
 * @author 1090481621001
 */
public class Disciplina {
    private String codigo;
    private ArrayList <Topico> topicos;

    public Disciplina(String codigo, ArrayList<Topico> topicos) {
        this.codigo = codigo;
        this.topicos = topicos;
    }

    public Disciplina() {
        topicos = new ArrayList();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Topico> getTopicos() {
        return topicos;
    }

    public void setTopico(ArrayList<Topico> topicos) {
        this.topicos = topicos;
    }

    @Override
    public String toString() {
       String saida = "Disciplina{" + "codigo=" + codigo + ", topico=" + topicos + '}';
        for(Topico aux: topicos){
               saida = saida + aux.toString() + "\n";
           }
           return saida;
    }
    
    public void adicionaTopico(Topico topico){
        this.topicos.add(topico);
    }

    public boolean removeTopico(Topico topico){
        return this.topicos.remove(topico);
    }
    
    public boolean consultaTopico(Topico topico){
        return this.topicos.contains(topico);
    }
    
    public boolean atualizaTopico(Topico atual, Topico novo){
        //encontra posição atual
        int pos = this.topicos.indexOf(atual);
        if(pos != -1){
        this.topicos.set(pos, novo);
        return true;
        }
        else return false;
    }
    
    
    
    
    
    
}
