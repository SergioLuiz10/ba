package borabill;

public abstract class banda {
     protected Integer cpf;
     protected String nome;
     protected double saldo;
     protected double limite;

     public banda(Integer cpf, String nome, double saldo, double limite) {
          this.cpf = cpf;
          this.nome = nome;
          this.saldo = saldo;
          this.limite = limite;
     }

     public Integer getCpf() {
          return cpf;
     }

     public void setCpf(Integer cpf) {
          this.cpf = cpf;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public double getSaldo() {
          return saldo;
     }

     public void setSaldo(double saldo) {
          this.saldo = saldo;
     }

     public double getLimite() {
          return limite;
     }

     public void setLimite(double limite) {
          this.limite = limite;
     }
     public abstract double saque(double valor);
     public abstract void excessoe1(double valor);
     public abstract void excessao2(double valor);
}
