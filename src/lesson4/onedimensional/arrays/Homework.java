package lesson4.onedimensional.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 15, 20, 25};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + target + " входит в массив.");
        } else {
            System.out.println("Число " + target + " не найдено в массиве.");
        }
        System.out.println();
        task1 ();
        task2 ();
        task3 ();

    }
    public static void task1 () {
        int[] originalArray = {3, 5, 7, 5, 9, 2, 5, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int value : originalArray) {
            if (value == target) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Число " + target + " не найдено в массиве.");
        } else {
            int[] newArray = new int[originalArray.length - count];
            int index = 0;

            for (int value : originalArray) {
                if (value != target) {
                    newArray[index] = value;
                    index++;
                }
            }

            System.out.println("Новый массив без числа " + target + ": " + Arrays.toString(newArray));
        }
        System.out.println();
    }
    public static void task2 () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            return;
        }

        int[] numbers = new int[size];


        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.print("Сгенерированный массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        double average = (double) sum / size;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
    public static void task3 () {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {15, 25, 35, 45, 55};

        // Вывод первого массива
        System.out.print("Массив 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Вывод второго массива
        System.out.print("Массив 2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Вычисление среднего арифметического
        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);

        // Вывод среднего
        System.out.println("Среднее массива 1: " + avg1);
        System.out.println("Среднее массива 2: " + avg2);

        // Сравнение
        if (avg1 > avg2) {
            System.out.println("Среднее значение массива 1 больше.");
        } else if (avg2 > avg1) {
            System.out.println("Среднее значение массива 2 больше.");
        } else {
            System.out.println("Средние значения равны.");
        }
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}


