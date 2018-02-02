package mypackage;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args){ // этот метод обязателен, является точкой входа в программу

        /*НАЗВАНИЕ ПЕРЕМЕННЫХ ДОЛЖНО БЫТЬ ЛОГИЧНЫМ, НАЧИНАТЬСЯ С БОЛЬШОЙ БУКВЫ(ЕСЛИ ОДНА БУКВА)
        ИЛИ ПЕРВОЕ СЛОВО С МАЛЕНЬКОЙ И ПОСЛЕДУЮЩИЕ СЛОВА НАЧИНАЮТЬСЯ С БОЛЬШОЙ БУКВЫ*/


        byte a = 5; /*создали переменную с типом byte назвали а и присвоили значение 5 (переменная типа
        byte может хранить в себе целые числа от -128 до 127)*/
        short b = -100; //-32768 до 32767 целочисленный тип
        char e = '$'; /*беззнаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
        В UTF-16 символы кодируются двухбайтовыми словами с использованием всех возможных диапазонов значений
         (от 0 до FFFF16)*/
        int c = 1000000; // целочисленный тип и самый популярный от -2147483648 до 2147483647
        long d = 1234398374; //т -9223372036854775808 до 9223372036854775807

        /*System.out.println("byte a:  " + a);
        System.out.println("short b:  " + b);
        System.out.println("char e:  " + e);
        System.out.println("int c:  " + c);
        System.out.println("long d:  " + d);*/

        //ТИПЫ ВЕЩЕСТВЕННЫХ ЧИСЕЛ

        float float1 = 123.50f; /* число с плавающей точкой
        позволяет хранить от -1.4e-45f до 3.4e+38f не забываем ставить f после присвоения значения*/
        
        System.out.println("This is float value: " + float1);

        double double1 = 123.32; // позв. хранить дроби от -4.9e-324 до 1.7e+308
        System.out.println("This is double value: " + double1);

        // Логические типы - Булеан

        boolean booleanfirst = true; // инициализировани, объявили и присвоили значение true
        boolean booleansecond = false;
        System.out.println("The value of booleangirst is equal " + booleanfirst);
        System.out.println("The value of booleansecond is equal  "+ booleansecond);

        boolean compare1 = 1+2>0;
        boolean compare2 = 1+2>5;
        System.out.println("The value of compare1 is equal "+ compare1);
        System.out.println("The value of compare2 is equal "+ compare2);

        // ТИП ДАННЫХ STRING

        String str = "Wow,";
        String str2 = " you are ";
        String str3 = "genius!";
        System.out.println("The value of each variables is " +str+str2+str3);

    }

}
