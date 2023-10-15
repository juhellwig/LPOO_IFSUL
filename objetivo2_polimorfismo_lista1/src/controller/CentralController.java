package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class CentralController {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro(5.4, 9.6);
        Cachorro c2 = new Cachorro(1.5, 4.7);
        Cachorro c3 = new Cachorro(7.8, 6.4);
        Passaro pa1 = new Passaro(9.6, 7.2);
        Passaro pa2 = new Passaro(2.6, 3.4);
        Passaro pa3 = new Passaro(3.5, 6.1);
        Peixe pei1 = new Peixe(2.4, 1.5, 6.2);
        Peixe pei2 = new Peixe(7.9, 4.6, 5.5);
        Peixe pei3 = new Peixe(8.5, 4.2, 1.9);

        System.out.println("\nLista de animais:");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(c1);
        animalList.add(c2);
        animalList.add(c3);
        animalList.add(pa1);
        animalList.add(pa2);
        animalList.add(pa3);
        animalList.add(pei1);
        animalList.add(pei2);
        animalList.add(pei3);

        System.out.println(animalList);

        System.out.println("\nAnimais movidos para as coordenadas x=2.0 e y=2.0:");
        animalList.forEach(a -> {
            a.mover(2.0, 2.0);
            System.out.println(a);
            a.desenhar();
        });

        System.out.println("\nAnimais da classe cachorro reposicionados para as coordenadas x=8.0 e y=8.0:");
        animalList.forEach(a -> {
            if(a instanceof Cachorro){
                a.mover(8.0, 8.0);
                System.out.println(a);
                a.desenhar();
            }
        });

        System.out.println("\nAnimais das classes Passaro e Peixe reposicionados para as coordenadas x=5.0, y=5.0 e z=5.0:");
        animalList.forEach(a -> {
            if(a instanceof Peixe) {
                ((Peixe) a).mover(5.0, 5.0, 5.0);
                System.out.println(a);
                a.desenhar();
            } else if(a instanceof Passaro){
                if(a instanceof Passaro) {
                    ((Passaro) a).mover(5.0, 5.0, 5.0);
                    System.out.println(a);
                    a.desenhar();
                }
            }
        });
    }
}
