package model;

public class GerenteGeral extends Gerente{
    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{nome= "
                + super.getNome()
                + " salario= "
                + super.getSalario()
                + "}";
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.4;
    }

}
