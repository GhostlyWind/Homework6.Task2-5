package com.company;

public class ArrayWithoutDuplicates {

    public static void main(String[] args) {
        int[] array = {12, 0, 7, -6, 1, -6, 1, 1, 1};
        ArrayWithoutDuplicates.sortAndDeleteDuplicates(array);
    }

    public static int[] sortAndDeleteDuplicates(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            int previousIndex = i - 1;
            while (previousIndex >= 0 && number < array[previousIndex]) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            if (previousIndex >= 0 && number == array[previousIndex]) {
                count++;
                while (previousIndex >= 0) {
                    array[previousIndex + 1] = array[previousIndex];
                    previousIndex--;
                }
            }
            array[previousIndex + 1] = number;
        }
        int[] arrayWithoutDuplicates = new int[array.length - count];

        for (int i = 0; i < arrayWithoutDuplicates.length; i++) {
            arrayWithoutDuplicates[i] = array[i + count];
            System.out.println(arrayWithoutDuplicates[i]);
        }
        return arrayWithoutDuplicates;
    }
}
