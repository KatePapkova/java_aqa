package lesson3.operators;

public class Homework2IfElseIf {
    public static void main (String [] args) {
        int month = 11;
                if (month == 1 || month == 2 || month == 12){
                    System.out.println("This is Winter");
                } else if (month >= 3 && month <= 5){
                    System.out.println("This is Spring");
                } else if (month >= 6 && month <= 8){
                    System.out.println("This is Summer");
                } else if (month >= 9 && month <= 11){
                    System.out.println("This is Autumn");
                } else
                    System.out.println("There is no such month in the year");
    }
}

// || — логическое "или"
// if (month >= 1 && month <= 2 && month > 11 && month <= 12) такая условие не правильно
// и мне выдавало "There is no such month in the year"
// потому что НЕТ ни одного числа, которое одновременно:
// от 1 до 2
// и больше 11
