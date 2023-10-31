package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;
    //private double totalItem;
    List<Produto> produtos = new ArrayList<>();

    public Item() {
        super();
    }

    public Item(int codItem, double desconto, int quantidade) {
        super();
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        //this.totalItem = totalItem;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

//    public double getTotalItem() {
//        return totalItem;
//    }
//    public void setTotalItem(double totalItem) {
//        this.totalItem = totalItem;
//    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                //", totalItem=" + totalItem +
                ", produto=" + produtos +
                '}';
    }
}
