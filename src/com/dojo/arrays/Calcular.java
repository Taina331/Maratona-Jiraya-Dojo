package com.dojo.arrays;

public class Calcular {
    public static void main(String[] args) {
        VarArgsEarray cal = new VarArgsEarray();
        int[] numeros = {1,2,3,4,5};
        cal.somaArray(numeros);
        System.out.println("--------");
        cal.somaVarArgs(1,2,3,4,5,6,7);
    }
}
