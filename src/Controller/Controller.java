package Controller;

import java.util.List;

import Model.Conta;

public class Controller {
    
    public List<Conta> addConta(List<Conta> lista, Conta conta){
        lista.add(conta);
        return lista;
    }

    public List<Conta> removeConta(List<Conta> lista, String agencia, String num_conta){
        Conta conta  = buscaConta(lista, agencia, num_conta);
        if (conta != null) {
            lista.remove(conta);    
        } else{
            return null;
        }
        return lista;
    }

    public Conta addSaldoConta(List<Conta> lista, String agencia, String num_conta, Double valor){
        Conta conta = buscaConta(lista, agencia, num_conta);
        if(conta != null){
                conta.setSaldo(conta.getSaldo() + valor);
                if(conta.getSaldo() < 0D) conta.setSaldo(0D);
        } else{
            return null ;    
        }
        return conta;
    }

    public Conta removeSaldoConta(List<Conta> lista, String agencia, String num_conta, Double valor){
        Conta conta = buscaConta(lista, agencia, num_conta);
        if(conta != null){
                conta.setSaldo(conta.getSaldo() - valor);
                if(conta.getSaldo() < 0D) conta.setSaldo(0D);
        } else{
            return null ;    
        }
        return conta;
    }

    public Conta buscaConta(List<Conta> lista, String agencia, String num_conta){
        for (Conta conta : lista) {
            if(conta.getAgencia().equals(agencia) && (conta.getNum_conta().equals(num_conta))){
                return conta;
            }
        }
        return null;
    }

}
