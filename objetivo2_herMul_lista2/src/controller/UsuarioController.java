package controller;

import model.*;

import java.util.*;

public class UsuarioController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Rosa", "Silva", "PETR4", 10);
        Cliente c2 = new Cliente("Andressa", "Moura", "PETR3", 25);
        Cliente c3 = new Cliente("Brayan", "Barbosa", "", 0);
        Cliente c4 = new Cliente("Joana", "Lopes", "PETR4", 50);
        Cliente c5 = new Cliente("Monica", "Zeff", "PETR3", 90);
        Cliente c6 = new Cliente("Nair", "Ferraz", "", 0);
        Desenvolvedor d1 = new Desenvolvedor("Robert", 4.300);
        Desenvolvedor d2 = new Desenvolvedor("Andre", 4.900);
        Desenvolvedor d3 = new Desenvolvedor("Luis", 5.500);
        Desenvolvedor d4 = new Desenvolvedor("Bruna", 4.100);
        Desenvolvedor d5 = new Desenvolvedor("Roberta", 5.100);
        Desenvolvedor d6 = new Desenvolvedor("Laura", 5.900);
        Gerente g1 = new Gerente("Fabiana", 7.500, "MGLU", 100);
        Gerente g2 = new Gerente("Jorge", 7.000, "MGLU", 400);
        Gerente g3 = new Gerente("Helena", 8.500, "MGLU", 250);
        Gerente g4 = new Gerente("Paulo", 6.500, "", 0);
        Gerente g5 = new Gerente("Helen", 7.600, "MGLU",130);
        Gerente g6 = new Gerente("Eduarda", 7.200, "", 0);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6);

        List<Investidor> investidorList = new ArrayList<>();
        investidorList.add(g1);
        investidorList.add(g2);
        investidorList.add(g3);
        investidorList.add(g4);
        investidorList.add(g5);
        investidorList.add(g6);
        investidorList.add(c1);
        investidorList.add(c2);
        investidorList.add(c3);
        investidorList.add(c4);
        investidorList.add(c5);
        investidorList.add(c6);
        System.out.println();
        System.out.println("\nLista de investidores: " + investidorList);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(d1);
        funcionarioList.add(d2);
        funcionarioList.add(d3);
        funcionarioList.add(d4);
        funcionarioList.add(d5);
        funcionarioList.add(d6);
        funcionarioList.add(g1);
        funcionarioList.add(g2);
        funcionarioList.add(g3);
        funcionarioList.add(g4);
        funcionarioList.add(g5);
        funcionarioList.add(g6);

        System.out.println();
        System.out.println("\nLista de funcionarios: " + funcionarioList);

        funcionarioList.sort(Comparator.comparing(Funcionario :: getSalario).reversed());
        System.out.println("\nLista de funcionarios em ordem decrescente baseado em salario: " + funcionarioList);
        System.out.println("\nLista de clientes em ordem decrescente pela quantidade de açoes: ");
        investidorList.sort(Comparator.comparing(Investidor :: getQuantidade).reversed());
        investidorList.forEach(inv -> {
            if(inv instanceof Cliente) {
                System.out.println(inv);
            }
        });
        System.out.println("\nLista de investidores: " + investidorList);

        System.out.println("\nMaior salario: ");
        Funcionario fMaiorSalario = Collections.max(funcionarioList, Comparator.comparing(Funcionario :: getSalario));
        funcionarioList.forEach(fun -> {
            if(fun.getSalario() >= fMaiorSalario.getSalario()) {
                System.out.println(fun);
            }
        });

        System.out.println("\nInvestidor com mais ações: ");
        Investidor invMaisAcao = Collections.max(investidorList, Comparator.comparing(Investidor::getQuantidade));
        investidorList.forEach(inv -> {
            if(inv.getQuantidade() >= invMaisAcao.getQuantidade()) {
                System.out.println(inv);
            }
        });
    }
}
