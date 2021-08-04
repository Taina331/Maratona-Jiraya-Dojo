package com.dojo.aula10;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario =  new Funcionario();
        funcionario.nome = "Maria";
        funcionario.idade = 25;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.imprime();
    }
}