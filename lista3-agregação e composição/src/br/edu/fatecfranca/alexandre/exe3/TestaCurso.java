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
public class TestaCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Topico t1 = new Topico ("soma");
        Topico t2 = new Topico ("velocidade");
        Topico t3 = new Topico ("verbo");
        Topico t4 = new Topico ("reprodução");
        
        Disciplina d1 = new Disciplina();
        d1.setCodigo("33-3");
        d1.adicionaTopico(t1);
        d1.adicionaTopico(t2);
        
        
        Disciplina d2 = new Disciplina();
        d2.setCodigo("66-6");
        d2.adicionaTopico(t3);
        d2.adicionaTopico(t4);
        
        Curso curso1 = new Curso();
        curso1.setNome("ads");
        curso1.adicionaDisciplina(d1);
        
        Curso curso2 = new Curso();
        curso2.setNome("gpi");
        curso2.adicionaDisciplina(d2);
        
        
      
        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
      //  o1.atualizaPassageiro(p2, p5);
       // System.out.println(o1.toString());

        
        
    }
    
}
