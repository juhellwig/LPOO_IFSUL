package model;

public class Cliente implements Investidor {

    private String nome;
    private String sobrenome;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String getTicker() {
        return null;
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public int getQuantidade() {
        return 0;
    }

    @Override
    public void setQuantidade(int quantidade) {

    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
