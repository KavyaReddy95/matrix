package project2;

import java.util.Random;
import java.util.Scanner;

public class Project2 {

    public static void displayWelcomeMessage() {

        Scanner sc = new Scanner(System.in);
        System.out.println("project 02A");
        System.out.println("STUDENT ID: 1794948 ");
        System.out.println("STUDENT NAME: kavya");
        System.out.println(" ");
    }

    public static int askNumber(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.print(question);
        int count = sc.nextInt();
        System.out.println(" ");
        return count;
    }

    public static void displayMatrix(int[][] matrix, int rows, int cols) {

        for (int j = 0; j < cols; j++) {
            System.out.print("-----");
        }
        System.out.println("-");

        for (int i = 0; i < rows; i++) {

           

            for (int j = 0; j < cols; j++) {

                System.out.print(String.format("|%2d", (matrix[i][j])));
                System.out.print(" ");
            }

            System.out.println("|");

            for (int j = 0; j < cols; j++) {
                System.out.print("-----");
         
            }
            System.out.println("-");
        }
            System.out.println("");
        }
    

    public static void fillMatrixWithRandom(int[][] matrix, int rows, int cols) {
        Random ro = new Random();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = ro.nextInt(20) + 1;

            }
        }

    }

    public static void addMatrixes(int[][] matrix1, int[][] matrix2, int[][] matrix3, int rows, int cols) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayWelcomeMessage();

        int rows = askNumber("how many rows? ");
        int cols = askNumber("how many cols? ");

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] matrix3 = new int[rows][cols];

        fillMatrixWithRandom(matrix1, rows, cols);
        fillMatrixWithRandom(matrix2, rows, cols);
        addMatrixes(matrix1, matrix2, matrix3, rows, cols);

        displayMatrix(matrix1, rows, cols);
        displayMatrix(matrix2, rows, cols);
        displayMatrix(matrix3, rows, cols);

    }

}