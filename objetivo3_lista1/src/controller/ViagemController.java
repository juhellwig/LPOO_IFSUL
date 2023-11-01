package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.util.Comparator;

public class ViagemController {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo(6L, "Fiat Argo", "JBL97J", 2022);
        Usuario u1 = new Usuario(5L, "Carlos", "carlos@gmail.com", "46987456325");
        Motorista m1 = new Motorista(4L, "Jorge", "jorgee@gmail.com", "45632156831", v1);

        Corrida c1 = new Corrida(1L, "dinheiro", ".", "14/12/2020", 12.20, 4, u1, m1);
        Corrida c2 = new Corrida(1L, "dinheiro", ".", "16/01/2021", 15.50, 4, u1, m1);

        System.out.println("Numero de corridas por usuario:");
        u1.getCorridas().add(c1);
        u1.getCorridas().add(c2);
        u1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(u1.getCorridas());

        System.out.println("Numero de corridas por motorista:");
        m1.getCorridas().add(c1);
        m1.getCorridas().add(c2);
        m1.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(m1.getCorridas());

        System.out.println("Valor total das corridas do motorista " + m1.getNome() + ": " + NumberFormat.getCurrencyInstance().format(m1.getCorridas().stream().mapToDouble(c -> c.getPreco()).sum()));
//        System.out.println(NumberFormat.getCurrencyInstance().format(
//                m1.getCorridas().stream()
//                        .mapToDouble(c -> c.getPreco())
//                        .sum()));
    }
}
