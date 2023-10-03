package model;

public class Caminhao extends Veiculo implements Automovel{
    private int capacidadeDeCarga;

    public Caminhao() {
    }

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
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
        return "\nCaminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                '}';
    }
}
