package com.dojo.arrays;

public class Aula08multidimensionais {
    public static void main(String[] args) {
        //int [][] arrayInt = new int [3][];

        int[][] arrayInt = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt) {
            for (int num: arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}