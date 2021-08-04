package com.dojo.aula10;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();
    }

    private void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
    }
}
