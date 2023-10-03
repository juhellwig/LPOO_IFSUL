package controller;

import model.Funcionario;
import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto("1", "Garrafa", "Garrafa metálica", 49.90,  100);
        Produto p4 = new Produto("2", "Borracha", "Borracha Mercur Branca", 1.90,  500);
        Produto p5 = new Produto("3", "Caneta", "Caneta Bic preta", 1.00,  1000);
        Produto p6 = new Produto("4", "Lapiseira", "Lapiseira 0.5mm", 2.50,  275);
        Produto p7 = new Produto("5", "Apontador", "Apontador Faber-Castell", 2.00,  300);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println();

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p6);
        produtos.add(p7);
        System.out.println(produtos);

        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);

        System.out.println();

        Produto produtosFind = produtos.stream().filter(c -> c.getId().equals("3")).findAny().orElse(null);
        System.out.println(produtosFind);

        System.out.println();

        Map<String, Produto> produtosMap = new HashMap<>();
        produtosMap.put(p3.getId(), p3);
        produtosMap.put(p4.getId(), p4);
        produtosMap.put(p5.getId(), p5);
        produtosMap.put(p6.getId(), p6);
        produtosMap.put(p7.getId(), p7);
        System.out.println(produtosMap);

        System.out.println();

        System.out.println(produtosMap.get(p5.getId()));
    }
}
