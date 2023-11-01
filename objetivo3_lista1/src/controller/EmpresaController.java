package controller;

import model.Empresa;
import model.Funcionario;

import java.util.Comparator;

public class EmpresaController {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("12.144.654/0001-47", "Ferreira e cia", "Ferros Ferreira");
        Empresa e2 = new Empresa("78.489.254/0001-23", "Rosa e cia", "Maria das flores");

        Funcionario f1 = new Funcionario(1L, "458759632587", "Ana", "Munhoz", "18/12/1996");
        Funcionario f2 = new Funcionario(2L, "45696312359", "Carlos", "Heuser", "16/03/1940");
        Funcionario f3 = new Funcionario(3L, "15935785236", "Monica", "Xavier", "16/08/1975");
        Funcionario f4 = new Funcionario(4L, "14785236989", "Nair", "Almeida", "19/07/1978");
        Funcionario f5 = new Funcionario(5L, "12364589715", "Joao", "Silva", "12/04/1998");
        Funcionario f6 = new Funcionario(6L, "14852369798", "Jose", "Petri", "16/05/1980");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);
        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        System.out.println("\nFuncionarios da empresa " + e1.getNomeFantasia() + " ordenado por nome em ordem crescente: ");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario ::getNome));
        System.out.println(e1);

        System.out.println("\nFuncionarios da empresa " + e2.getNomeFantasia() + " ordenado por nome em ordem crescente: ");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario ::getNome));
        System.out.println(e2);

        System.out.println("\nFuncionarios da empresa " + e1.getNomeFantasia() + " ordenado por idade em ordem decrescente: ");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1);

        System.out.println("\nFuncionarios da empresa " + e2.getNomeFantasia() + " ordenado por idade em ordem decrescente: ");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2);
    }







}

    
