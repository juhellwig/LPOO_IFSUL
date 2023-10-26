package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;

public class Aluno_DisciplinaController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(18464, "Antonio", "Braga");
        Aluno a2 = new Aluno(16548, "Roberta", "Silva");

        Disciplina d1 = new Disciplina(1, "matematica");
        Disciplina d2 = new Disciplina(2, "portugues");
        Disciplina d3 = new Disciplina(3, "historia");

        a1.getDisciplinas().add(d3);
        a1.getDisciplinas().add(d1);

        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.println("\nImpressao das disciplinas por aluno: ");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina :: getNome));
        System.out.println(a1);

        a2.getDisciplinas().sort(Comparator.comparing(Disciplina :: getNome));
        System.out.println(a2);

        System.out.println("\nRemover as disciplinas do segundo aluno: ");
        a2.getDisciplinas().clear();

        a2.getDisciplinas().sort(Comparator.comparing(Disciplina :: getNome));
        System.out.println(a2);

        System.out.println("\nReimprimindo os alunos e as disciplinas: ");

        a1.getDisciplinas().sort(Comparator.comparing(Disciplina :: getNome));
        System.out.println(a1);

        a2.getDisciplinas().sort(Comparator.comparing(Disciplina :: getNome));
        System.out.println(a2);
    }
}
