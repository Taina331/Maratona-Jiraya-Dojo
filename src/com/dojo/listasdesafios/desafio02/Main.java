package com.dojo.listasdesafios.desafio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> lista1 = new ArrayList<>();
        List<Pessoa> lista2 = new ArrayList<>();

        lista1.add(new Pessoa("Ana", 18));
        lista1.add(new Pessoa("Pedro", 15));
        lista1.add(new Pessoa("Maria", 38));
        lista1.add(new Pessoa("João", 17));
        lista1.add(new Pessoa("Bia", 98));

        lista1.forEach(pessoa -> {
                    if (pessoa.getIdade() >= 18) {
                        lista2.add(pessoa);
                    }
                });


        lista2.forEach(pessoa -> System.out.println(pessoa.getIdade()));

    }
}