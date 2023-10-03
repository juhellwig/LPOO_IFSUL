package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno("1", 1596874690, "Roger", "Silveira", "silveiraroger123@gmail.com");
        Aluno a4 = new Aluno("2", 595478644, "Ligia", "Rosa", "ligia646r@gmail.com");
        Aluno a5 = new Aluno("3", 546545487, "", "", "");
        Aluno a6 = new Aluno("4", 455167878, "", "", "");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println(a5.toString());
        System.out.println(a6.toString());

        System.out.println();

        a1.setId("5");
        a1.setCpf(654659487);
        a1.setNome("Ana");
        a1.setSobrenome("Lopes");
        a1.setEmail("lopana@gmail.com");

        a2.setId("6");
        a2.setCpf(489484798);
        a2.setNome("Vagner");
        a2.setSobrenome("Nobre");
        a2.setEmail("vagnernobre1892@gmail.com");

        System.out.println(a1.getId());
        System.out.println(a1.getCpf());
        System.out.println(a1.getNome());
        System.out.println(a1.getSobrenome());
        System.out.println(a1.getEmail());
        System.out.println();
        System.out.println(a2.getId());
        System.out.println(a2.getCpf());
        System.out.println(a2.getNome());
        System.out.println(a2.getSobrenome());
        System.out.println(a2.getEmail());

        System.out.println();

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        alunos.add(a6);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        System.out.println();

        Aluno alunosFind = alunos.stream().filter(a -> a.getId().equals("5")).findAny().orElse(null);
        System.out.println(alunosFind);

        System.out.println();

        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunos);

        Map<String, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(a1.getId(), a1);
        alunosMap.put(a2.getId(), a2);
        alunosMap.put(a3.getId(), a3);
        alunosMap.put(a4.getId(), a4);
        alunosMap.put(a5.getId(), a5);
        alunosMap.put(a6.getId(), a6);

        System.out.println(alunosMap.get(a1.getId()));
    }
}
