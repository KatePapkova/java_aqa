package lesson3.operators;

public class MyOperators {
    public static void main (String[] args) {

// Оператор if

        int num1 = 7;
        int num2 = 5;

        if (num1 > num2) {
            System.out.println("The first number is bugger then the second one");
        }

        if (num1 > num2 && num1 > 6) {
            System.out.println("The first number is bugger then the second one and bigger then 6");
        }

        ifElse();
        ifElseIf ();
        ternary ();
        constructorSwitch ();
        cycleFor();
        operatorBreak();
        operatorContinue ();

    }


// После ключевого слова if ставится условие;
// Если это условие выполняется, то срабатывает код, который помещен в блоке if в {};
//Так как, в данном случае, первое число больше второго, то
//выражение num1 > num2 истинно и возвращает значение true;
//Следовательно, управление переходит в блок кода в фигурных
//скобках и начинает выполнять указанные там инструкции, т.е.
//метод System.out.println(“The first number is bigger then the second one”);
//Если бы первое число оказалось меньше второго, то блок кода условия if не выполнялся.
//Также можно соединять сразу несколько условий, используя логические операторы: &&

// Оператор if ... else
        public static void ifElse () {
            int num3 = 4;
            int num4 = 6;

            if (num3 > num4) {
                System.out.println("The first number is bugger then the second one");
            } else {
                System.out.println("The first number is less then the second one");
            }
        }

// Оператор if ... else if

    public static void ifElseIf () {
        int num5 = 7;
        int num6 = 7;

        if (num5 > num6) {
            System.out.println("The first number is bugger then the second one");
        } else if (num5 < num6) {
            System.out.println("The first number is less then the second one");
        } else {
            System.out.println("Numbers are equal");
        }
    }

// Тернарный оператор "?:" (сокращенная форма if...else)

    public static void ternary () {
        int num7 = 8;
        int num8 = 6;
        String result = num7 > num8 ? "num7 > num8" : "num7 < num8";
        System.out.println(result);
    }

// Конструктор Switch

    public static void constructorSwitch () {
        int num9 = 8;
        switch (num9) {
            case 1:
                System.out.println("Number is 1!");
                break;
            case 8:
                System.out.println("Number is 8!");
                break;
            case 9:
                System.out.println("Number is 9!");
                break;
            default:
                System.out.println("Number is not 1, 8 or 9");
        }
        System.out.println();
    }

// После ключевого слова switch в скобках идет сравниваемое выражение.
// Значение этого выражения последовательно сравнивается со значениями, помещенными после
// оператора case.
// Если совпадение будет найдено, то будет выполняться определенный блок case.
// Выражение в switch должно иметь тип char, byte, short, int, enum (начиная с Java 6) или String(начиная с Java 7)
// break завершает выполнение внутри switch.
// Если его не написать — Java будет выполнять все последующие блоки,
// даже если они не подходят. Это называется "проваливание" (fall-through):

// Цикл For
        public static void cycleFor () {

            for (int i = 1; i < 9; i++) {
                System.out.println(i * i);
            }
            System.out.println();
// Первая часть объявления цикла int i = 1 создает и инициализирует счетчик i;
// Счетчик необязательно должен представлять тип int – это может быть и любой
// другой числовой тип, например, float;
// Перед выполнением цикла значение счетчика будет равно 1;
// В данном случае это то же самое, что и объявление переменной;
// Вторая часть – условие, при котором будет выполняться цикл;
// В данном примере цикл будет выполняться, пока i не достигнет 9;
// Третья часть – приращение счетчика на 1;
// Опять же, не обязательно увеличивать счетчик на 1, можно и уменьшать (i--);
// В итоге, блок цикла сработает 8 раз, пока значение i не станет равным 9;
// И каждый раз это значение будет увеличиваться на 1

/*  Необязательно указывать все условия при объявлении цикла, такой вариан тоже корректен:
            int i = 1;
            for(;;){
                System.out.println(i * i);
    Определение цикла осталось тем же, только теперь блоки в определении
    пустые for(;;) – нет инициализированной переменной-счетчика, нет условия,
    поэтому цикл будет работать вечно – бесконечный цикл.
 */
            int x = 1;
            for (; x < 4; ) {
                System.out.println(x * x);
                x++;
            }
            System.out.println();
// Этот пример эквивалентен первому примеру: здесь также есть счетчик,
// только создан он вне цикла. Есть и условие выполнения цикла, а также
// приращение счетчика уже в самом теле цикла for.

            int[] array = new int[]{1, 2, 3, 4, 5};
            for (int a : array) {
                System.out.println(a);
                System.out.println(a);
            }
            System.out.println();
// Специальная версия цикла for предназначена для перебора элементов в наборах элементов, например, в
// массивах и коллекциях.


            int[] array2 = new int[]{1, 2, 3, 4, 5};
            for (int i = 0; i < array2.length; i++) {
                System.out.println(array2[i]);
            }
            System.out.println();
        }

// Оператор Break
// Иногда требуется выйти из цикла, не дожидаясь его завершения. В этом случае на
// помощь приходит оператор break:
        public static void operatorBreak () {

        int[] nums = new int[]{1, 2, 12, 10};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 10)
                break;
            System.out.println(nums[i]);
        }
    }
// В данном случае два последних элемента не будут видны в консоли, так как когда
//nums[i] окажется больше 10 (то есть равно 12), сработает оператор break, и цикл
//завершится.

// Oператор Continue
// чтобы цикл не завершался, если число больше 10, а просто
//переходил к следующему элементу. Для этого используем оператор continue:
        public static void operatorContinue () {

            int[] nums2 = new int []{
                1, 2, 3, 4, 12, 9
            } ;
            for (int i = 0; 1 < nums2.length; i++) {
                if (nums2[i] > 10)
                    continue;
                System.out.println(nums2[i]);
            }
        }
// В данном случае, когда выполнение цикла дойдет до числа 12, которое не
// удовлетворяет условию проверки, программа просто пропустит это число и перейдет к
// следующему элементу массива.
}

