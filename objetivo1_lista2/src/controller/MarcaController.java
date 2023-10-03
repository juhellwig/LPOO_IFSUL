package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {
        Marca m1 = new Marca();
        Marca m2 = new Marca();
        Marca m3 = new Marca("1", "Fiat");
        Marca m4 = new Marca("2", "Volkswagen");
        Marca m5 = new Marca("3", "Fiat");
        Marca m6 = new Marca("4", "Citroen");
        Marca m7 = new Marca("5", "Fiat");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        List<Marca> marcas = new ArrayList<>();
        marcas.add(m3);
        marcas.add(m4);
        marcas.add(m3);
        marcas.add(m6);
        marcas.add(m7);
        System.out.println(marcas);

        marcas.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println(marcas);

        System.out.println();

        Marca marcaFind = marcas.stream().filter(p -> p.getId().equals("3")).findAny().orElse(null);
        System.out.println(marcaFind);

        System.out.println();

        Map<String, Marca> marcasMap = new HashMap<>();
        marcasMap.put(m3.getId(), m3);
        marcasMap.put(m4.getId(), m4);
        marcasMap.put(m5.getId(), m5);
        marcasMap.put(m6.getId(), m6);
        marcasMap.put(m7.getId(), m7);
        System.out.println(marcasMap);

        System.out.println();

        System.out.println(marcasMap.get(m5.getId()));
    }
}
