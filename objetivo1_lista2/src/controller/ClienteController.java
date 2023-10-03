package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente("1", "040.505.216-51", "Pedro", "Silva", "rua oswaldo aranha", "96666-454", "56658895", "pedros@gmail.com");
        Cliente c4 = new Cliente("2", "105.863.189-13", "Tais", "Almeida", "avenida liberdade", "98885-542", "63594415", "almeidatais@gmail.com");
        Cliente c5 = new Cliente("3", "197.468.145-55", "Paula", "Alves", "avenida cinco", "97898-578", "67887489", "alvesp@gmail.com");
        Cliente c6 = new Cliente("4", "604.267.144-83", "Jorge", "Borges", "rua general osorio", "98846-132", "79886554", "jorgeborges1@gmail.com");
        Cliente c7 = new Cliente("5", "564.479.136-48", "Luis", "Pedroso", "avenida bento gonçalves", "98497-987", "57878488", "luis123pedroso@gmail.com");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c7);
        clientes.add(c6);
        clientes.add(c7);
        System.out.println(clientes);

        clientes.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println(clientes);

        System.out.println();

        Cliente clienteFind = clientes.stream().filter(p -> p.getId().equals("3")).findAny().orElse(null);
        System.out.println(clienteFind);

        System.out.println();

        Map<String, Cliente> clientesMap = new HashMap<>();
        clientesMap.put(c3.getId(), c3);
        clientesMap.put(c4.getId(), c4);
        clientesMap.put(c5.getId(), c5);
        clientesMap.put(c6.getId(), c6);
        clientesMap.put(c7.getId(), c7);
        System.out.println(clientesMap);

        System.out.println();

        System.out.println(clientesMap.get(c5.getId()));
    }
}