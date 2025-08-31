package lesson5.multidimensional.arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задаём 3D-массив 2x2x2 для примера
        int[][][] array = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };

        System.out.print("Введите число, на которое увеличить каждый элемент: ");
        int increment = scanner.nextInt();

        // Проходим по всему массиву и увеличиваем элементы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increment;
                }
            }
            chess ();
        }

        System.out.println("Результат:");
        for (int[][] matrix : array) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void chess() {
        String[][] board = new String[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    board[row][col] = "W";
                } else {
                    board[row][col] = "B";
                }
            }
        }

        // Вывод доски
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
