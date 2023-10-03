package controller;

import model.Carro;
import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        Conta cnt1 = new Conta();
        Conta cnt2 = new Conta();
        Conta cnt3 = new Conta("1", 2.600);
        Conta cnt4 = new Conta("2", 5.632);
        Conta cnt5 = new Conta("3", 14.654);
        Conta cnt6 = new Conta("4", 1.499);
        Conta cnt7 = new Conta("5", 25.687);
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
        System.out.println(cnt4);

        System.out.println();

        List<Conta> contas = new ArrayList<>();
        contas.add(cnt3);
        contas.add(cnt4);
        contas.add(cnt5);
        contas.add(cnt6);
        contas.add(cnt7);
        System.out.println(contas);

        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas);

        System.out.println();

        Conta contaFind = contas.stream().filter(c -> c.getId().equals("3")).findAny().orElse(null);
        System.out.println(contaFind);

        System.out.println();

        Map<String, Conta> contasMap = new HashMap<>();
        contasMap.put(cnt3.getId(), cnt3);
        contasMap.put(cnt4.getId(), cnt4);
        contasMap.put(cnt5.getId(), cnt5);
        contasMap.put(cnt6.getId(), cnt6);
        contasMap.put(cnt7.getId(), cnt7);
        System.out.println(contasMap);

        System.out.println();

        System.out.println(contasMap.get(cnt5.getId()));
    }
}
