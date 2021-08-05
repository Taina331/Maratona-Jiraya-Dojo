package com.dojo.listasdesafios.desafio04;

import java.util.List;

import static com.dojo.listasdesafios.desafio04.Service.*;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> lista1 = criarLista();
        List<Pessoa> lista2 = criarLista();

       carregarLista1(lista1);
        validarIdade(lista1, lista2);
        lerLista(lista2);
    }
}