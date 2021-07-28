package com.dojo.projeto02;

import java.text.DecimalFormat;

public class Aula02 {

    public static void main(String[] args) {

        String nome = "Maria";
        String endereco = "rua dos poetas";
        double salario = 2000;
        String dataRecebida = "20/12/2021";

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Eu " + nome );
        System.out.println(" morando no endereço: " + endereco );
        System.out.println(" Confirmo que recebir o salario de: " + df.format(salario));
        System.out.println(" Na data:" + dataRecebida);
    }
}
