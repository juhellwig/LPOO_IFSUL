package controller;

import model.Conta;
import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario("1", "Roberto", 2.200);
        Funcionario f4 = new Funcionario("2", "Beta", 2.259);
        Funcionario f5 = new Funcionario("3", "Joao", 5.500);
        Funcionario f6 = new Funcionario("4", "Angela", 2.640);
        Funcionario f7 = new Funcionario("5", "Natalia", 4.600);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println();

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);
        funcionarios.add(f6);
        funcionarios.add(f7);
        System.out.println(funcionarios);

        funcionarios.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarios);

        System.out.println();

        Funcionario funcionariosFind = funcionarios.stream().filter(c -> c.getId().equals("3")).findAny().orElse(null);
        System.out.println(funcionariosFind);

        System.out.println();

        Map<String, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put(f3.getId(), f3);
        funcionariosMap.put(f4.getId(), f4);
        funcionariosMap.put(f5.getId(), f5);
        funcionariosMap.put(f6.getId(), f6);
        funcionariosMap.put(f7.getId(), f7);
        System.out.println(funcionariosMap);

        System.out.println();

        System.out.println(funcionariosMap.get(f5.getId()));
    }
}