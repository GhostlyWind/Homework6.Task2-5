package com.company;

public class ArrayWithMissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, -2, 0};
        System.out.println(getMissingNumber(array));
    }

    public static Integer getMissingNumber(int[] array) {
        array = sortArray(array);
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i + 1] - array[i] != 1) {
                return (array[i + 1] - 1);
            }
        }
        return null;
    }

    private static int[] sortArray(int[] array) {
        int number;
        for (int i = 1; i < array.length; i++) {
            number = array[i];
            int previousIndex = i - 1;
            while (previousIndex >= 0 && number <= array[previousIndex]) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = number;
        }
        return array;
    }
}
