package controller;

import model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String[] args) {
        Modelo mod1 = new Modelo();
        Modelo mod2 = new Modelo();
        Modelo mod3 = new Modelo("1", "Toro");
        Modelo mod4 = new Modelo("2", "Polo");
        Modelo mod5 = new Modelo("3", "Argo");
        Modelo mod6 = new Modelo("4", "C3");
        Modelo mod7 = new Modelo("5", "Uno");
        System.out.println(mod1);
        System.out.println(mod2);
        System.out.println(mod3);
        System.out.println(mod4);

        List<Modelo> modelos = new ArrayList<>();
        modelos.add(mod7);
        modelos.add(mod4);
        modelos.add(mod5);
        modelos.add(mod6);
        modelos.add(mod7);
        System.out.println(modelos);


        modelos.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println(modelos);

        System.out.println();

        Modelo modeloFind = modelos.stream().filter(p -> p.getId().equals("3")).findAny().orElse(null);
        System.out.println(modeloFind);

        System.out.println();

        Map<String, Modelo> modelosMap = new HashMap<>();
        modelosMap.put(mod3.getId(), mod3);
        modelosMap.put(mod4.getId(), mod4);
        modelosMap.put(mod5.getId(), mod5);
        modelosMap.put(mod6.getId(), mod6);
        modelosMap.put(mod7.getId(), mod7);
        System.out.println(modelosMap);

        System.out.println();

        System.out.println(modelosMap.get(mod5.getId()));
    }
}
