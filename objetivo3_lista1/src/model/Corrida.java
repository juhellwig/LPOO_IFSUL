package model;

import java.util.Date;

public class Corrida {
    private long id;
    private String tipoPagamento;
    private String detalhesPagamento;
    private String dataInicio;
    private double preco;
    private int attribute9;
    private Usuario usuario;
    private Motorista motorista;

    public Corrida() {
        super();
    }

    public Corrida(long id, String tipoPagamento, String detalhesPagamento, String dataInicio, double preco, int attribute9, Usuario usuario, Motorista motorista) {
        super();
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.dataInicio = dataInicio;
        this.preco = preco;
        this.attribute9 = attribute9;
        this.usuario = usuario;
        this.motorista = motorista;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(int attribute9) {
        this.attribute9 = attribute9;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", preco=" + preco +
                ", attribute9=" + attribute9 +
                ", usuario=" + usuario +
                ", motorista=" + motorista +
                '}';
    }
}
