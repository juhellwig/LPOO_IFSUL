package model;

public class Gerente extends Funcionario{


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente() {
        super();
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nGerente{ nome= "
                + this.getNome()
                + " salario "
                + this.getSalario()
                + "}";
    }
}
