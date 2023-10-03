package model;

public class DesenvolvedorSenior extends Desenvolvedor{

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{nome= "
                + super.getNome()
                + " salario= "
                + super.getSalario()
                + "}";
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.1;
    }
}
