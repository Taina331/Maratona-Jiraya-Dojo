package com.dojo.listasdesafios.desafio04;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public static List<Pessoa> criarLista() {
        return new ArrayList<>();
    }

    public static void carregarLista1(List<Pessoa> lista1) {
        lista1.add(new Pessoa("Ana", 18));
        lista1.add(new Pessoa("Pedro", 15));
        lista1.add(new Pessoa("Maria", 38));
        lista1.add(new Pessoa("João", 17));
        lista1.add(new Pessoa("Bia", 98));
    }

    public static  void validarIdade(List<Pessoa> lista1, List<Pessoa> lista2) {
        lista1.forEach(pessoa -> {
            if (pessoa.getIdade() >= 18) {
                lista2.add(pessoa);
            }
        });
    }

    public static void lerLista (List<Pessoa> lista2) {
        lista2.forEach(pessoa -> System.out.println(pessoa.getIdade()));
    }
}