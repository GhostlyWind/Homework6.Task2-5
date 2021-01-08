package com.company;

public class TransposedArray {

    public static void main(String[] args) {
        int[][] array = {{1, 1, 7, 6}, {1, 6, 7, 8}, {9, 10, 11, 9}};
        int[][] transposedArray = TransposedArray.transpose(array);

        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[0].length; j++) {
                System.out.print(transposedArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] array) {
        int[][] transposedArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        return transposedArray;
    }
}

