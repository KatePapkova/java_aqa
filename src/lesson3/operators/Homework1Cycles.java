package lesson3.operators;

import java.util.Scanner;

public class Homework1Cycles {

// Task 1
    public static void main (String[] args){
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println();

        task2 ();
        task3 ();
    }

// Task 2
    public static void task2 (){
        for (int i = 5; i >= 1; i --){
            System.out.println(i);
        }
        System.out.println();
    }

// Task 3

    public static void task3 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i ++){
            sum = sum +i;
        }
        System.out.println("Sum from 1 to" + number + "is: " + sum);
    }
}
