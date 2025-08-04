// однострочный комент
/*
 многострочный комментарий
 Рабочий код всегда лежит в док-те с расширением .java - это источник (папка src)
 Откомпилированный код (байт код) - лежит в папке с расширением .class - это чистый код (папка out)
 */


public class MyMain {
    public static void main(String[] args) {
        System.out.println("Welcome Java");
        System.out.println();
        System.out.print("Welcome Java without next line");
        System.out.print(" this message Welcome Java right after previous");
        System.out.println();
        System.out.println("Welcome Java Kate");

/*
 public class MyMain - создали объект MyMain,
 {тело объекта},
 cлово сlass создает объект под названием MyMain,
 class = объект

 название главного публичного класса (объект в самом начале) должно совпадать с названием док-та
 Название всегда класса с большой буквы и это существительное - Upper camel Case
 Main, MyMain

   public static void main - объявление нового метода и Entry-point (точка входа),в теле объекта обязательно д.б. быть Entry-point
    Точка входа говорит компилятору, что программу следует считывать ОТСЮДА, здесь она начинается
    метод всегда глагол и начинается с маленькой буквы -  Lower Camel Case
    get, getName
 */
// System.out.println - вывести код на экран
// println ("...") - метод передачи,содержит скрытый символ ln
// кот. добавляет переход на новую строку в конце
// в java строчка пишется только в ""
// println () - без текста обозначает прееход на новую строку
// println () - ошибка компилятора, пустой метод
// print ("\n") - содержит спец.знак перехода на новую строчку

        byte myByte = 34;
        short myShort = -31_345;
        int myInt = 2_000_000_001;
        long myLong = -3_000_000_000_000_123L;


        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println("My byte value is: " + myByte + ". And my long value is: " + myLong);

        float myFloat = -4.3578458F;
        double myDouble = 15.3938489944;

        System.out.println("My double: " + myDouble);

        char letter = '=';
        System.out.println("My letter is: " + letter);
        letter = 33;
        System.out.println("My letter is: " + letter);

        String fullName = "Ekaterina Papkova";
        String name = "Kate";
        String surname = "Papkova";
        String fullNameConcatenated = name + " " + surname;

        System.out.println(fullName);
        System.out.println(fullNameConcatenated);

        boolean isMarried = true;
        boolean isEmployed = true;
        boolean isAngry = false;

        System.out.println("Are you married: " + isMarried);

    }
}
