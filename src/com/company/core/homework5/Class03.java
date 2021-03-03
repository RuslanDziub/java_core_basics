package com.company.core.homework5;

import java.util.Random;

public class Class03 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][7];
        int startDiapazon = -2;
        int finishDiapazon = 75;

        matrix = fillMatrix(matrix, startDiapazon, finishDiapazon);
        showMatrix(matrix);
    }

    public static int[][] fillMatrix (int[][] matrix, int startDiapazon, int finishDiapazon) {
        Random random = new Random();
        int diff = finishDiapazon - startDiapazon;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = random.nextInt(diff + 1);
                matrix[i][j] += (-2);
            }
        }
        return matrix;
    }

    public static void showMatrix (int[][] matrix) {
        System.out.println("This is your matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
