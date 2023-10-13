package controller;

import model.Cliente;
import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Rosa", "Silva");
        Cliente c2 = new Cliente("Andressa", "Moura");
        Cliente c3 = new Cliente("Brayan", "Barbosa");
        Cliente c4 = new Cliente("Joana", "Lopes");
        Cliente c5 = new Cliente("Monica", "Zeff");
        Cliente c6 = new Cliente("Nair", "Ferraz");
        Desenvolvedor d1 = new Desenvolvedor("Robert", 4.500);
        Desenvolvedor d2 = new Desenvolvedor("Andre", 4.500);
        Desenvolvedor d3 = new Desenvolvedor("Luis", 4.500);
        Desenvolvedor d4 = new Desenvolvedor("Bruna", 4.500);
        Desenvolvedor d5 = new Desenvolvedor("Roberta", 4.500);
        Desenvolvedor d6 = new Desenvolvedor("Laura", 4.500);
        Gerente g1 = new Gerente("Fabiana", 7.500);
        Gerente g2 = new Gerente("Jorge", 7.500);
        Gerente g3 = new Gerente("Helena", 7.500);
        Gerente g4 = new Gerente("Paulo", 7.500);
        Gerente g5 = new Gerente("Helen", 7.500);
        Gerente g6 = new Gerente("Eduarda", 7.500);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6);

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(c1);
        clienteList.add(c2);
        clienteList.add(c3);
        clienteList.add(c4);
        clienteList.add(c5);
        clienteList.add(c6);

        System.out.println(clienteList);


    }
}
