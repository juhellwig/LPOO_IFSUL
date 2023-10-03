package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("Matheus", 4500);
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Marcia", 5400);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        d2.setSalario(5500);
        g2.setSalario(6400);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        System.out.print(d1 + " " + d1.getBonus());
        System.out.print(d2 + " " + d2.getBonus());
        System.out.print(g1 + " " + g1.getBonus());
        System.out.print(g2 + " " + g2.getBonus());

        //1 e impossivel criar instancias da classe funcionarios pois a mesma e abstrata.

        //2 foram inseridas nas camadas de modelo pois o modelo e a camada de controle.

        Gerente ger1 = new GerenteGeral("Claudia", 6500);
        Gerente ger2 = new GerenteDesenvolvimento("Renan", 4500);

        Desenvolvedor dev1 = new DesenvolvedorSenior("Alan", 3500);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Gabriel", 3500);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Jose", 3500);
        Desenvolvedor dev4 = new DesenvolvedorSenior("Karen", 3500);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Gabriela", 3500);
        Desenvolvedor dev6 = new DesenvolvedorSenior("Paula", 3500);

        Desenvolvedor dev7 = new DesenvolvedorPleno("Andre", 2500);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Natalia", 2500);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Edu", 2500);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Carlos", 2500);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Lilian", 2500);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Ursula", 2500);

        Desenvolvedor dev13 = new DesenvolvedorJunior("Leandro", 1800);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Eduarda", 1800);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Solange", 1800);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Kenia", 1800);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Alberto", 1800);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Julia", 1800);

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(ger1);
        funcionarioList.add(ger2);
        funcionarioList.add(dev1);
        funcionarioList.add(dev2);
        funcionarioList.add(dev3);
        funcionarioList.add(dev4);
        funcionarioList.add(dev5);
        funcionarioList.add(dev6);
        funcionarioList.add(dev7);
        funcionarioList.add(dev8);
        funcionarioList.add(dev9);
        funcionarioList.add(dev10);
        funcionarioList.add(dev11);
        funcionarioList.add(dev12);
        funcionarioList.add(dev13);
        funcionarioList.add(dev14);
        funcionarioList.add(dev15);
        funcionarioList.add(dev16);
        funcionarioList.add(dev17);
        funcionarioList.add(dev18);
        System.out.println();

        double acumSB = 0;
        for(Funcionario f: funcionarioList) {
            acumSB += f.getSalario();
        }

        System.out.println("\nFolha salarial sem bonus= " + NumberFormat.getCurrencyInstance().format(acumSB));

        double acumB = 0;
        for(Funcionario f: funcionarioList) {
            acumB += f.getSalario()+ f.getBonus();
        }

        System.out.println("\nFolha salarial com bonus= " + NumberFormat.getCurrencyInstance().format(acumB));

        System.out.println("\nFuncionarios cadastrados na empresa: ");

        for(Funcionario f: funcionarioList) {
            System.out.print(f.getNome() + " " + "bonus= " + f.getBonus() + " " + "salario= " +f.getSalario());
            System.out.println();
        }

        double reajuste = 0;
        for(Funcionario f: funcionarioList) {
            reajuste += f.getSalario() + f.getSalario() * 0.05;
        }

        System.out.println("\n Nova folha salarial da empresa: " + NumberFormat.getCurrencyInstance().format(reajuste));
    }
}
