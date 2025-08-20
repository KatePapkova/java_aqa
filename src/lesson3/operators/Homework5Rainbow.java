package lesson3.operators;
import java.util.Scanner;

public class Homework5Rainbow {
    public static void main (String [] args) {
        int rainbow = 4;
        switch (rainbow) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Жёлтый");
                break;
            case 4:
                System.out.println("Зелёный");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Такого цвета в радуге нет");
        }
        enterColorNumber();
    }

// другой способ вводом из клавиатуры

        public static void enterColorNumber(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of color (1-7): ");
            int colorNumber = scanner.nextInt();
            switch (colorNumber) {
                case 1:
                    System.out.println("Красный");
                    break;
                case 2:
                    System.out.println("Оранжевый");
                    break;
                case 3:
                    System.out.println("Жёлтый");
                    break;
                case 4:
                    System.out.println("Зелёный");
                    break;
                case 5:
                    System.out.println("Голубой");
                    break;
                case 6:
                    System.out.println("Синий");
                    break;
                case 7:
                    System.out.println("Фиолетовый");
                    break;
                default:
                    System.out.println("Такого цвета в радуге нет");
            }
        }
}
