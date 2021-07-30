package com.dojo.condicionais;

public class Aula03 {
    public static void main(String[] args) {
        int idade = 15;

        if (idade < 15) {
            System.out.println("Categoria infantil");
        } else if (idade >=15 && idade <18) {
            System.out.println("Categoria Juvenil");
        } else{
            System.out.println("Categoria adulto");
        }
    }
}