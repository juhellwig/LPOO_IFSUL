package model;

public class DesenvolvedorJunior extends Desenvolvedor {

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior{nome= "
                + super.getNome()
                + " salario= "
                + super.getSalario()
                + "}";
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }
}
