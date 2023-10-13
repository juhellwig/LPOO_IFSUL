package model;

public class Gerente extends Funcionario implements Investidor {

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getTicker() {
        return null;
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public int getQuantidade() {
        return 0;
    }

    @Override
    public void setQuantidade(int quantidade) {

    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.40;
    }
}
