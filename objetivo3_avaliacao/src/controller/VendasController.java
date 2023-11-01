package controller;

import exceptions.EstoqueInsuficienteException;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class VendasController {
    public static void main(String[] args) {
        //professor, fiquei confusa em varios pontos e acabou que não deu tempo de terminar.
        //pretendo continuar para concluir, mas para a entrega não consegui.

        Vendedor v1 = new Vendedor(12, "Marcio", "Rua Dois, 29", "Liberdade", "96333000", "Pelotas","RS", "Loja Brasil");
        Vendedor v2 = new Vendedor(13, "Patricia", "Rua Alberto Albatroz, 25", "Jardim Europa", "69789541", "Camaquã", "RS", "Pompeia");

        Item i1 = new Item(56, 10, 2);
        Item i2 = new Item(78, 10, 1);

        Produto p1 = new Produto(56, "Camiseta", 50, 49.90, i1);
        Produto p2 = new Produto(78, "Calça", 40, 89.90, i2);

        List<Item> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);

        Pedido ped1 = new Pedido(125, "12/12/2020", (p1.getPreco() * i1.getQuantidade()) - ((p1.getPreco()* i1.getQuantidade()) * i1.getDesconto())/100, "Entregue", v1, i1);
        Pedido ped2 = new Pedido(563, "18/09/2019", (p2.getPreco() * i2.getQuantidade()) - ((p2.getPreco()* i2.getQuantidade()) * i2.getDesconto())/100, "Entregue", v2, i2);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(ped1);
        pedidos.add(ped2);

        System.out.println(pedidos);

        p1.setQuantidade(p1.getQuantidade() - i1.getQuantidade());
        p2.setQuantidade(p2.getQuantidade() - i2.getQuantidade());

        System.out.println();
        System.out.println(produtos);

        Fornecedor f1 = new Fornecedor(1565789600, "59632158698", "Vander");
        Fornecimento for1 = new Fornecimento("15/03/2019", p1.getPreco()*p1.getQuantidade(), f1, p1);
        System.out.println(for1);
        //nao esta imprimindo.

        System.out.println("Entrada de estoque\n");

        p1.setQuantidade(p1.getQuantidade() + 30);
        p2.setQuantidade(p2.getQuantidade() + 70);

        System.out.println(produtos);

        mythrowException();

    }

    private static void mythrowException() {
        try {
            throw new EstoqueInsuficienteException("Erro, estoque insuficiente");
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
