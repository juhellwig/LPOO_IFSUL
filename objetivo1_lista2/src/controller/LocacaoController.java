package controller;

import model.Locacao;

import java.util.*;

public class LocacaoController {
    public static void main(String[] args) {
        Locacao l1 = new Locacao();
        Locacao l2 = new Locacao();
        Locacao l3 = new Locacao("1", "15/12/2022", "8h56", "17/12/2022", "8h58", 1000, 100.0, 300, true);
        Locacao l4 = new Locacao("2", "5/2/2022", "10h05", "10/2/2022", "10h05", 4000, 100.0, 450, false);
        Locacao l5 = new Locacao("3", "7/2/2021", "15h53", "10/2/2021", "15h55", 6000, 100.0, 350, false);
        Locacao l6 = new Locacao("4", "9/4/2023", "19h05", "10/4/2023", "19h07", 10000, 100.0, 150, true);
        Locacao l7 = new Locacao("5", "5/9/2020", "17h58", "8/9/2020", "18h00", 14000, 100.0, 375, false);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        List<Locacao> locacoes = new ArrayList<>();
        locacoes.add(l3);
        locacoes.add(l6);
        locacoes.add(l5);
        locacoes.add(l6);
        locacoes.add(l7);
        System.out.println(locacoes);

        locacoes.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println(locacoes);

        System.out.println();

        Locacao locacaoFind = locacoes.stream().filter(p -> p.getId().equals("3")).findAny().orElse(null);
        System.out.println(locacaoFind);

        System.out.println();

        Map<String, Locacao> locacoesMap = new HashMap<>();
        locacoesMap.put(l3.getId(), l3);
        locacoesMap.put(l4.getId(), l4);
        locacoesMap.put(l5.getId(), l5);
        locacoesMap.put(l6.getId(), l6);
        locacoesMap.put(l7.getId(), l7);
        System.out.println(locacoesMap);

        System.out.println();

        System.out.println(locacoesMap.get(l5.getId()));
    }
}
