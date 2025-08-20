package lesson3.operators;

public class Homework4Temperature {
    public static void main (String [] args){
        int t = -10;
        if (t > -5){
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20){
            System.out.println("Нормально");
        } else if (t <= -20){
            System.out.println("Холодно");
        }
    }
}
