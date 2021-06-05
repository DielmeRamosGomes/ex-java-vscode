package Model;

public class Conta {
    
    private String nome;
    private String cpf;
    private String agencia;
    private String num_conta;
    private Double saldo;

    public Conta(String nome, String cpf, String agencia, String num_conta, Double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNum_conta() {
        return this.num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    

}
