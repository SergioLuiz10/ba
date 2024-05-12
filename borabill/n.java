package borabill;

public class n extends banda{
    public n(Integer cpf, String nome, double saldo, double limite) {
        super(cpf, nome, saldo, limite);
    }

    @Override
    public double saque(double valor)   {
        excessoe1(valor);
        excessao2(valor);
        return saldo-valor;
    }
    @Override
    public void excessoe1(double valor) {
        if(getSaldo()==0) {
            throw new RuntimeException("Saldo zerado");
        }
    }
    @Override
    public void excessao2(double valor)   {
     if (valor>getLimite()) {
        throw new RuntimeException("Valor maior que limite");
      }
    }
}
