package Main;

import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Model.Banco;
import Model.Conta;

public class Main {
    static Controller control = new Controller();

    public static void main(String[] args) throws Exception {
        //new MyFrame();
        
        List<Conta> lista = new ArrayList<>();
        Banco banco = new Banco("Banco do Brasil", 10, lista);

        Conta conta1 = new Conta("Dielme", "413.986.408-75", "0097-3", "77774-9", 500D);
        Conta conta2 = new Conta("Paulinho", "413.986.408-74", "0097-4", "77774-8", 1000D);
        Conta conta3 = new Conta("Eilane", "413.986.408-77", "0097-2", "77774-4", 5000D);

        banco.setLista_contas(control.addConta(lista, conta1));
        banco.setLista_contas(control.addConta(lista, conta2));
        banco.setLista_contas(control.addConta(lista, conta3));
        //banco.imprimeListaContas();
        //banco.setLista_contas(control.removeConta(lista, "0097-2", "77774-4"));
        //banco.imprimeListaContas();
        //banco.imprimeUmaConta(control.addSaldoConta(lista, "0097-2", "77774-4", 2000D));
        //banco.imprimeUmaConta(control.removeSaldoConta(lista, "0097-2", "77774-4", 4000D));
        


    }

} // Classe Main
