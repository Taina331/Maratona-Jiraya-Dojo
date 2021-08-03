package com.dojo.introducaometodos;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante est01 = new Estudante();
        Estudante est02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        est01.nome = "Maria";
        est01.idade = 19;
        est01.sexo = "F";

        est02.nome = "Mara";
        est02.idade = 15;
        est02.sexo = "F";

        impressora.imprime(est01);
        impressora.imprime(est02);
    }
}