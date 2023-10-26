package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private long codigo;
    private String nome;

    public Disciplina() {
        super();
    }

    public Disciplina(long codigo, String nome) {
        super();
        this.codigo = codigo;
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "\nDisciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
