package br.edu.fatecfranca.alexandre;
public class Aluno {
     private int numeroAluno;
     private String nome;
     private int idade;
     private float p1;
     private float p2;
     
    public Aluno(){
            this.numeroAluno = 999999;
            this.nome= " ";
            this.idade = 0 ;
            this.p1 = 0;
            this.p2 = 0;
    }   
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
           this.trataAluno(numeroAluno);
           this.trataNome(nome);
           this.trataIdade(idade);
           this.trataP1(p1);
           this.trataP2(p2);
    }
    private void trataAluno(int numeroAluno){
           if (String.valueOf(numeroAluno).length()== 6){
               this.numeroAluno = numeroAluno;
           }
           else{ 
               System.out.println("Numero invalido");
           }

    }
public void setNumeroAluno(int numeroAluno){
        trataAluno(numeroAluno);
}         

private void trataNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome ;
        }
        else{
            System.out.println("nome invalido");
        }    
}
    
public void setNome(String nome){
        trataNome(nome);
}
   

private void trataIdade(int idade){
        if(idade > 0){
           this.idade = idade;
        }
        else{
             System.out.println("idade invalido"); 
        }
}
    
public void setIdade(int idade){
        trataIdade(idade);
}

private void trataP1(float p1){
        if(p1 >= 0){
           this.p1 = p1;
        }
        else{
             System.out.println("nota invalida"); 
        }
}
public void setP1(float p1){
        trataP1(p1);
}

private void trataP2(float p2){
        if(p2 >= 0){
           this.p2 = p2;
        }
        else{
             System.out.println("nota invalida"); 
        }
}
public void setP2(float p2){
        trataP2(p2);
}

public float notaFinal(){
    return (this.p1 * this.p2)/2; 
    
}

public String dadosAluno(){
    return "numero aluno" + this.numeroAluno +"nome" + this.nome + "idade do aluno"+ this.idade;
}
public void passou(){
    if(notaFinal() >= 6){
        System.out.println("passou"); 
    }
    else{
        System.out.println("não passou"); 
    }
}
}




