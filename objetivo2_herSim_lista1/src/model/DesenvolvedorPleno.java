package model;

public class DesenvolvedorPleno extends Desenvolvedor {

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{nome= "
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
