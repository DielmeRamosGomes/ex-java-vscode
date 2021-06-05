package Model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome_banco;
    private int num_banco;
    private List<Conta> lista_contas = new ArrayList<>();

    public Banco(String nome_banco, int num_banco, List<Conta> lista_contas){
        this.nome_banco = nome_banco;
        this.num_banco = num_banco;
        this.lista_contas = lista_contas;
    }

    public List<Conta> getLista_contas() {
        return this.lista_contas;
    }

    public void setLista_contas(List<Conta> lista_contas) {
        this.lista_contas = lista_contas;
    }

    public String getNome_banco() {
        return this.nome_banco;
    }

    public void setNome_banco(String nome_banco) {
        this.nome_banco = nome_banco;
    }

    public int getNum_banco() {
        return this.num_banco;
    }

    public void setNum_banco(int num_banco) {
        this.num_banco = num_banco;
    }

    public void imprimeListaContas(){
        for (Conta conta : lista_contas) {
            System.out.println("Conta");
            System.out.println("Nome:------------" + conta.getNome());
            System.out.println("Cpf:-------------" + conta.getCpf());
            System.out.println("Agencia:---------" + conta.getAgencia());
            System.out.println("Número da Conta:-" + conta.getNum_conta());
            System.out.println("Saldo da Conta:  " + conta.getSaldo() + "\n");
        }
    }

    public void imprimeUmaConta(Conta conta){
        System.out.println("Conta");
        System.out.println("Nome:------------" + conta.getNome());
        System.out.println("Cpf:-------------" + conta.getCpf());
        System.out.println("Agencia:---------" + conta.getAgencia());
        System.out.println("Número da Conta:-" + conta.getNum_conta());
        System.out.println("Saldo da Conta:  " + conta.getSaldo() + "\n");
    }

}
