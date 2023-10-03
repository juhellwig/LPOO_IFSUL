package model;

public class Desenvolvedor extends Funcionario{


    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor() {

    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{nome= "
                + this.getNome()
                + " salario "
                + this.getSalario()
                + "}";
    }
}
