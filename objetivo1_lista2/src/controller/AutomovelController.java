package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel();
        Automovel a3 = new Automovel("1", "htdhdf", "AAAAAA", "azul", 4, "gasolina", 40000, "vvbhgfdgf", 100.00);
        Automovel a4 = new Automovel("2","sgfghd", "BBBBBB", "branco", 4, "gasolina/alcool", 50000, "vdgfsvgfg", 190.00);
        Automovel a5 = new Automovel("3","ssdfgg", "CCCCCC", "cinza", 4, "gasolina", 30000, "gdfhreghh", 170.00);
        Automovel a6 = new Automovel("4","ghjjhg", "DDDDDD", "vermelho", 4, "gasolina/alcool", 20000, "tghthgdf", 90.00);
        Automovel a7 = new Automovel("5","jlkjfd", "EEEEEE", "branco", 4, "gasolina", 00004, "trhtrgsgh", 80.00);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        List<Automovel> automoveis = new ArrayList<>();
        automoveis.add(a3);
        automoveis.add(a4);
        automoveis.add(a5);
        automoveis.add(a4);
        automoveis.add(a6);
        System.out.println(automoveis);

        automoveis.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(automoveis);

        System.out.println();

        Automovel automovelFind = automoveis.stream().filter(p -> p.getId().equals("3")).findAny().orElse(null);
        System.out.println(automovelFind);

        System.out.println();

        Map<String, Automovel> automoveisMap = new HashMap<>();
        automoveisMap.put(a3.getId(), a3);
        automoveisMap.put(a4.getId(), a4);
        automoveisMap.put(a5.getId(), a5);
        automoveisMap.put(a6.getId(), a6);
        automoveisMap.put(a7.getId(), a7);
        System.out.println(automoveisMap);

        System.out.println();

        System.out.println(automoveisMap.get(a5.getId()));
    }

}
