package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro("1","Fiat", "Palio", 2003);
        Carro c4 = new Carro("2","Volkswagem", "Gol", 2012);
        Carro c5 = new Carro("3","Fiat", "Uno", 2015);
        Carro c6 = new Carro("4","Volkswagem", "Polo", 2019);
        Carro c7 = new Carro("5","Ford", "Fiesta", 2014);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println();

        List<Carro> carros = new ArrayList<>();
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
        carros.add(c6);
        carros.add(c7);
        System.out.println(carros);

        carros.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carros);

        System.out.println();

        Carro carroFind = carros.stream().filter(c -> c.getId().equals("3")).findAny().orElse(null);
        System.out.println(carroFind);

        System.out.println();

        Map<String, Carro> carrosMap = new HashMap<>();
        carrosMap.put(c3.getId(), c3);
        carrosMap.put(c4.getId(), c4);
        carrosMap.put(c5.getId(), c5);
        carrosMap.put(c6.getId(), c6);
        carrosMap.put(c7.getId(), c7);
        System.out.println(carrosMap);

        System.out.println();

        System.out.println(carrosMap.get(c5.getId()));

    }
}
