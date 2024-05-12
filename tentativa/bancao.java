package tentativa;

import borabill.n;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bancao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu cpf:");
        Integer cpf=ler.nextInt();
        ler.nextLine();
        System.out.println("Digite seu nome:");
        String nome=ler.nextLine();
        System.out.println("Digite seu saldo:");
        double saldo=ler.nextDouble();
        System.out.println("Digite seu limite:");
        double limite=ler.nextDouble();

        n ll = new n(cpf,nome,saldo,limite);
        System.out.println(ll.getCpf()+","+ll.getNome()+","+ll.getSaldo()+","+ll.getLimite());
        try {
            System.out.println("Digite quanto deseja sacar:");
            double valor2 = ler.nextDouble();
            ll.saque(valor2);
            System.out.println(ll.getCpf() + "," + ll.getNome() + "," + ll.saque(valor2) + "," + ll.getLimite());

        }catch (InputMismatchException e){
            System.out.println("Caracter invalido");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Fim");
        }
    }
}