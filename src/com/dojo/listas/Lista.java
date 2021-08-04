package com.dojo.listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List <Integer> idades = new ArrayList<>();
        idades.add(19);
        idades.add(44);
        idades.add(33);
        idades.add(11);
        idades.add(15);

        idades.forEach(x -> System.out.println(x));

    }
}