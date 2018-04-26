
package br.edu.fatecfranca.alexandre;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    
     public Cliente(){
        this.numeroConta = "999999-9";
        this.numeroAgencia = "9999-9";
        this.nome = "fulano";
        this.saldo = 0;
     }
     
      public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.trataNumeroConta(numeroConta);
        this.trataNumeroAgencia(numeroAgencia);
        this.trataNome(nome);
        this.saldo = saldo;
    }
 
      private void trataNumeroConta(String numeroConta){
        if ((numeroConta.length()== 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        }
        else{ 
            System.out.println("Numero invalido");
        }
    
      }
     
      
      public void setNumeroConta(String numeroConta){
        trataNumeroConta(numeroConta);
     }
    
     
     
     private void trataNumeroAgencia(String numeroAgencia){
        if ((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else{
            System.out.println("Numero invalido");
        }    
     }
    
    
    
     
     public void setNumeroAgencia(String numeroAgencia){
        trataNumeroAgencia(numeroAgencia);
     }
    
    
    
    private void trataNome(String nome){
        if(this.nome.length() == 30){
           this.nome = nome;
        }
        else{
             System.out.println("Nome invalido"); 
        }
    }
    
    
    
    
     public void setNome(String nome){
        trataNome(nome);
     }
    
     public void setSaldo(float saldo){
       this.saldo = saldo; 
        
    }
     
     
     public String getNumeroConta(){
        return this.numeroConta;
    }
    
     
     public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
     
     
     
     public String getNome(){
        return this.nome;
    }
     
     
    public  void realizarDeposito(float x){
        this.saldo = this.saldo + x;
     }
    
    
    
    public void realizarSaque(float x){
        this.saldo= this.saldo - x;
    }
    
    
    
    public String paraString(){
        return "n conta " + this.numeroConta + "n agencia " + this.numeroAgencia + "nome " + this.nome + "saldo " + this.saldo;
    }
   
}

