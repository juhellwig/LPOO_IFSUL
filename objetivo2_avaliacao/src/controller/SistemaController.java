package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SistemaController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana", 200, 25);
        Cliente c2 = new Cliente("Luis", 100, 12);
        Cliente c3 = new Cliente("Claudio", 170, 30);
        ContaPoupanca cp1 = new ContaPoupanca(1500);
        ContaPoupanca cp2 = new ContaPoupanca(9600);
        ContaPoupanca cp3 = new ContaPoupanca(5110);
        ContaCorrente cc1 = new ContaCorrente(6500, 250, 50);
        ContaCorrente cc2 = new ContaCorrente(10000, 200, 35);
        ContaCorrente cc3 = new ContaCorrente(15000, 300, 45);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        List<Conta> contaList = new ArrayList<>();
        contaList.add(cp1);
        contaList.add(cp2);
        contaList.add(cp3);
        contaList.add(cc1);
        contaList.add(cc2);
        contaList.add(cc3);

        List<Associado> associadoList = new ArrayList<>();
        associadoList.add(c1);
        associadoList.add(c2);
        associadoList.add(c3);
        associadoList.add(cc1);
        associadoList.add(cc2);
        associadoList.add(cc3);

        System.out.println("\nLista de contas no sistema:");
        System.out.println(contaList);
        System.out.println("\nLista de clientes:");
        System.out.println(associadoList);

        System.out.println("\nDeposito Conta Poupança:");
        cp1.deposita(1000);
        System.out.println(cp1);

        System.out.println("\nAtualizacao monetaria Conta Poupança:");
        cp1.atualiza(5);
        System.out.println(cp1);

        System.out.println("\nSaque Conta Poupança:");
        cp1.saca(50);
        System.out.println(cp1);

        System.out.println("\nDeposito Conta Corrente");
        cc2.deposita(500);
        System.out.println(cc2);

        System.out.println("\nSaque Conta Corrente");
        cc2.saca(400);
        System.out.println(cc2);

        System.out.println("\nAlteração cotas:");
        c1.setQdeCotas(100);
        c2.setQdeCotas(400);
        c3.setQdeCotas(600);
        cc1.setQdeCotas(300);
        cc2.setQdeCotas(600);
        cc3.setQdeCotas(600);

        System.out.println(associadoList);

        /* Aqui não consegui concluir. Acredito que por duvidas que ficaram da interface e em 'lucros'.

        System.out.println("\nLista dos associados em ordem decrescente: ");
        associadoList.sort(Comparator.comparing(Associado :: getqdeCotas).reversed());
        Associado assoMaisCota = Collections.max(associadoList, Comparator.comparing(Associado::getqdeCotas));
        associadoList.forEach(asso -> {
            if(asso.getqdeCotas() >= assoMaisCota.getqdeCotas()) {
                System.out.println(asso);
            }
        });*/

        contaList.sort(Comparator.comparing(Conta :: getSaldo).reversed());
        System.out.println("\nLista de contas em ordem decrescente: ");
        System.out.println(contaList);

        System.out.println("\nMaior saldo bancario: ");
        Conta maiorSaldo = Collections.max(contaList, Comparator.comparing(Conta :: getSaldo));
        contaList.forEach(con -> {
            if(con.getSaldo() >= maiorSaldo.getSaldo()) {
                System.out.println(con);
            }
        });

    }
}
