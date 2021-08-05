package com.dojo.listasdesafios.desafio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> lista1 = new ArrayList<>();
        List<Aluno> lista2 = new ArrayList<>();
        List<Aluno> lista3 = new ArrayList<>();

        lista1.add(new Aluno("Ana", 15));
        lista1.add(new Aluno("Paulo", 18));
        lista1.add(new Aluno("Maria", 26));
        lista1.add(new Aluno("João", 13));
        lista1.add(new Aluno("Lua", 11));

        lista1.forEach(aluno -> {
            if (aluno.getIdade() >= 18) {
                lista2.add(aluno);
            } else {
                lista3.add(aluno);
            }
        });
        System.out.println("Lista dos maiores de idade");
        lista2.forEach(aluno -> System.out.println(" Idade " + aluno.getIdade() + "\n Nome " + aluno.getNome()));
        System.out.println("Lista dos menor de idade");
        lista3.forEach(aluno -> System.out.println(" Idade " + aluno.getIdade() + "\n Nome " + aluno.getNome()));
    }
}