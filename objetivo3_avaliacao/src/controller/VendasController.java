package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class VendasController {
    public static void main(String[] args) {
        //professor, fiquei confusa em varios pontos e acabou que não deu tempo de terminar.
        //pretendo continuar para concluir, mas para a entrega não consegui.

        Produto p1 = new Produto(56, "Camiseta", 50, 49.90);
        Produto p2 = new Produto(78, "Calça", 40, 89.90);

        Vendedor v1 = new Vendedor(12, "Marcio", "Rua Dois, 29", "Liberdade", "96333000", "Pelotas","RS", "Loja Brasil");
        Vendedor v2 = new Vendedor(13, "Patricia", "Rua Alberto Albatroz, 25", "Jardim Europa", "69789541", "Camaquã", "RS", "Pompeia");

        Item i1 = new Item(17, 0.01, 2, p1);
        Item i2 = new Item(19, 0.01, 1, p2);

        Pedido ped1 = new Pedido(125, "12/12/2020", 25.50, "Entregue", v1);
        Pedido ped2 = new Pedido(563, "18/09/2019", 89.90, "Entregue", v2);

        Fornecedor f1 = new Fornecedor(1565789600, "59632158698", "Vander");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(ped1);
        pedidos.add(ped2);

        System.out.println(pedidos);

        p1.setQuantidade(p1.getQuantidade() - i1.getQuantidade());
        p2.setQuantidade(p2.getQuantidade() - i2.getQuantidade());

        System.out.println(p1.getQuantidade());
        System.out.println(p2.getQuantidade());

        p1.setQuantidade(p1.getQuantidade() + 30);
        p2.setQuantidade(p2.getQuantidade() + 70);
        double total = p2.getPreco();


    }
}
