/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandre.exe3;

import br.edu.fatecfranca.alexandre.exe2.Onibus;

import java.util.ArrayList;

/**
 *
 * @author 1090481621001
 */
public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas= new ArrayList();
    }

    public Curso(String nome, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        String saida = "Curso{" + "nome=" + nome + ", disciplinas=" + disciplinas + '}';
        for(Disciplina aux: this.disciplinas){
                saida = saida + aux.toString() + "\n";
        }
        return saida;
    }

     public void adicionaDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public boolean removedisciplina(Disciplina disciplina){
        return this.disciplinas.remove(disciplina);
    }
    
    public boolean consultadisciplina(Disciplina disciplina){
        return this.disciplinas.contains(disciplina);
    }
    
    public boolean atualizaDisciplina(Disciplina atual, Disciplina novo){
        //encontra posição atual
        int pos = this.disciplinas.indexOf(atual);
        if(pos != -1){
        this.disciplinas.set(pos, novo);
        return true;
        }
        else return false;
    }
    public void adicionaDisciplina( Topico topico, Disciplina disciplina){
       if(this.consultadisciplina(disciplina)) {
           disciplina.adicionaTopico(topico);
       }
       else System.out.println("disciplina não existe");
    }





}
