package model;

public class Pedido {
    private int numero;
    private String data;
    private double valor;
    private String status;
    Vendedor vendedor;
    Item item;

    public Pedido() {
        super();
    }

    public Pedido(int numero, String data, double valor, String status, Vendedor vendedor, Item item) {
        super();
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.status = status;
        this.vendedor = vendedor;
        this.item = item;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                ", vendedor=" + vendedor +
                ", item=" + item +
                '}';
    }
}
