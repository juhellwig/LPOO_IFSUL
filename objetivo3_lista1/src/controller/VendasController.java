package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class VendasController {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor(458963450, "4559632559", "Roberto");
        Fornecedor f2 = new Fornecedor(485696320, "54986325698", "Debora");

        Produto p1 = new Produto(1, "Tomate", 60, 4.50, f1);
        Produto p2 = new Produto(2, "Milho", 40, 5.60, f2);
        Produto p3 = new Produto(3, "Pimentao", 80, 3.80, f2);

        double total = p1.getPreco() * 10;
        p1.setQuantidade(p1.getQuantidade() - 10);
        Fornecimento for1 = new Fornecimento("14/07/2023", total, f1, p1);

        total = p2.getPreco() * 15;
        p2.setQuantidade(p2.getQuantidade() - 15);
        Fornecimento for2 = new Fornecimento("15/07/2023", total, f2, p2);

        total = p3.getPreco() * 20;
        p3.setQuantidade(p3.getQuantidade()-20);
        Fornecimento for3 = new Fornecimento("15/07/2023", total, f2, p3);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(for1);
        fornecimentos.add(for2);
        fornecimentos.add(for3);
        System.out.println("Lista de fornecimentos:");
        System.out.println(fornecimentos);

        System.out.println();
        System.out.println("\nTotal fornecido: " + NumberFormat.getCurrencyInstance().format(fornecimentos.stream().mapToDouble(f -> f.getValorTotal()).sum()));

    }
}
