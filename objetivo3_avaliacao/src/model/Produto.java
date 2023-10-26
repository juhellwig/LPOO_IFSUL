package model;

import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    List<Item> itens;
    Fornecedor fornecedor;

    //public boolean manterProduto(int codigo);
}
