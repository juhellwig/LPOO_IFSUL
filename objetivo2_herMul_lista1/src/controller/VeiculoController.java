package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(2, "humana", "caloi", "RX12", 2020, 24, "doiahs");

        System.out.println(b1);
        //pq aqui só esta imprimindo o toString da bike?

        Carro car1 = new Carro(4, "convencional", "Fiat", "Argo", 2019, 120);
        Caminhao c1 = new Caminhao(8, "hibrido", "Volvo", "FH 540", 2015, 200);

        Bicicleta b2 = new Bicicleta(2, "humana", "giant", "passeio", 2019, 24, "doiahs");
        Bicicleta b3 = new Bicicleta(2, "humana", "Stark", "mountain bike", 2020, 29, "hgfhgfh");
        Bicicleta b4 = new Bicicleta(2, "humana", "South", "mountain bike", 2014, 27, "fgghhf");
        Bicicleta b5 = new Bicicleta(2, "humana", "cannondale", "mountain bike", 2018, 29, "xfghhfg");
        Bicicleta b6 = new Bicicleta(2, "humana", "sense", "passeio", 2020, 24, "fghfggfh");
        Carro car2 = new Carro(4, "convencional", "Volkswagen", "Polo", 2021, 200);
        Carro car3 = new Carro(4, "convencional", "Chevrolet", "Onix", 2015, 150);
        Carro car4 = new Carro(4, "convencional", "Renault", "Kwid", 2019, 100);
        Carro car5 = new Carro(4, "convencional", "Toyota", "Corolla", 2018, 300);
        Carro car6 = new Carro(4, "convencional", "Honda", "Fit", 2011, 130);
        Caminhao c2 = new Caminhao(8, "hibrido", "Mercedes-Benz", "Actros 2651", 2010, 200);
        Caminhao c3 = new Caminhao(8, "hibrido", "Scania", "R450", 2016, 300);
        Caminhao c4 = new Caminhao(8, "hibrido", "Volvo", "FH 460", 2014, 600);
        Caminhao c5 = new Caminhao(8, "hibrido", "Volkswagen", "Constellation 24.280", 2013, 900);
        Caminhao c6 = new Caminhao(8, "hibrido", "Volkswagen", "Delivery 9.170", 2021, 800);

        List<Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(b2);
        veiculoList.add(b3);
        veiculoList.add(b4);
        veiculoList.add(b5);
        veiculoList.add(b6);
        veiculoList.add(car2);
        veiculoList.add(car3);
        veiculoList.add(car4);
        veiculoList.add(car5);
        veiculoList.add(car6);
        veiculoList.add(c2);
        veiculoList.add(c3);
        veiculoList.add(c4);
        veiculoList.add(c5);
        veiculoList.add(c6);
        System.out.println();

        List<Automovel> automovelList = new ArrayList<>();
        automovelList.add(car2);
        automovelList.add(car3);
        automovelList.add(car4);
        automovelList.add(car5);
        automovelList.add(car6);
        automovelList.add(c2);
        automovelList.add(c3);
        automovelList.add(c4);
        automovelList.add(c5);
        automovelList.add(c6);
        System.out.println();

        List<Bicicleta> bicicletaList = new ArrayList<>();
        bicicletaList.add(b2);
        bicicletaList.add(b3);
        bicicletaList.add(b4);
        bicicletaList.add(b5);
        bicicletaList.add(b6);
        System.out.println();

        //placa e renavam nao entraram!??


    }
}
