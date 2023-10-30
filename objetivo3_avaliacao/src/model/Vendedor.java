package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {
    private String local;
    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor() {
        super();
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super();
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "local='" + local + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}