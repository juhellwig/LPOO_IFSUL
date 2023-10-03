package model;

public class GerenteDesenvolvimento extends Gerente{

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento{nome= "
                + super.getNome()
                + " salario= "
                + super.getSalario()
                + "}";
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.20;
    }
}
