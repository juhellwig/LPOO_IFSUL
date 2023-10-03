package model;

public class Conta {
    private String id;
    private double saldo;
    public Conta() {
    }
    public Conta(String id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public double getSaldo() {
        return this.saldo;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void saca(double valor){ this.saldo += this.saldo-valor; }
    public void atualiza(double taxa) {
        this.saldo += this.saldo*taxa/100;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "id='" + id + '\'' +
                "saldo=" + saldo +
                '}';
    }
}
