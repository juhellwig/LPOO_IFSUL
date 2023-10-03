package model;

public class Carro extends Veiculo implements Automovel{
    private int capacidadePortaMalas;

    public Carro() {
    }

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String getRenavam() {
        return null;
    }

    @Override
    public void setRenavam(String renavam) {

    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public void setChassi(String chassi) {

    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public void setPlaca(String placa) {

    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
                '}';
    }
}
