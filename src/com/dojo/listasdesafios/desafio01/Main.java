package com.dojo.listasdesafios.desafio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Ana", 18));
        lista.add(new Pessoa("Pedro", 68));
        lista.add(new Pessoa("Maria", 38));
        lista.add(new Pessoa("João", 28));
        lista.add(new Pessoa("Bia", 98));

        lista.forEach(pessoa -> System.out.println(pessoa.getIdade()));

    }
}