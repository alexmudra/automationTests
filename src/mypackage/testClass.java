package mypackage;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args){ // этот метод обязателен, является точкой входа в программу

        //РАБОТА СО СТРОКАМИ String

        String something = "Operations with strings";

        /* Метод .equals возвращает булеан значение */

        System.out.println(something.equals("Operations with strings") ); // сравниваем строки при помощи метода .equals
        System.out.println(something.equals("Hello!")); //тут вывод будет false потому что строки не одинаковые
        System.out.println("--------------------------------------------------------");

        String test2 = "Test";
        System.out.println(something.equals(test2)); // сравнили строку something со строкой test2. Вывод: false
        System.out.println("--------------------------------------------------------");

        // Рассмотрим метод equalsIgnoreCase = сравнение проводится без учета регистра

        something = "test";
        test2 = "TEST";
        System.out.println(something.equalsIgnoreCase(test2)); //вывод true
        System.out.println("--------------------------------------------------------");

        // Преобразовываем регистры букв методами toLowerCase, toUpperCase

        something = "TeXt";
        System.out.println(something);// выводим оригинальное значение строки
        System.out.println(something.toLowerCase());// этот метод преобразовывает значение строки в маленьком регистре
        System.out.println(something.toUpperCase());// этот метод преобразовывает весь текст заглавными буквами
        System.out.println("--------------------------------------------------------");

        // Узнаем значение в строке при помощи метода charAt и indexOf

        System.out.println();
        System.out.println(something.charAt(0)); //из нашего значения TeXt выведет Т
        System.out.println(something.charAt(1));// выведет е
        System.out.println(something.charAt(2));// выведет Х
        System.out.println(something.charAt(3));// выведет t
        System.out.println("--------------------------------------------------------");
        System.out.println(something.indexOf("X"));// узнаем по значению в строке какой у нее индекс через метод indexOf
        System.out.println("--------------------------------------------------------");

        // Проверяем содержится ли в строке другая строка методом .contains

        something = "Hello, Alex";
        System.out.println(something.contains("Alex")); // вывод будет true поскольку в строке есть Alex
        System.out.println(something.contains("hi")); // вывод false потому что в строке нет hi
        System.out.println("--------------------------------------------------------");

        // Узнать длинну строки методом .length

        System.out.println(something.length());// строчка "Hello, Alex" содержит в себе 11 символов. Вывод 11
        System.out.println("--------------------------------------------------------");

        // Проверим начинается (endsWith) или заканчивается (startsWith) строка на какойто символ или значение

        System.out.println(something.startsWith("H"));// будет true
        System.out.println(something.startsWith("ello")); //false
        System.out.println(something.endsWith("ex"));// вывод true
        System.out.println(something.endsWith("Al"));//false
        System.out.println("--------------------------------------------------------");

        // Разбить строку с помощъю метода .split, (разделитель можна указывать любой)

        something = "Hello, world"; //переопредилили значение строки
        String[] myArray = something.split(",");
        System.out.println(myArray[0] + "-" + myArray[1] + "-"); // слова будут разделены -
        System.out.println(myArray[0]); // первое слово будет в одной строке
        System.out.println(myArray[1]); //второе слово будет в другой строке
        System.out.println("--------------------------------------------------------");

        // Форматирование строк с помощью метода .format (пример внизу)

        String str = "My name is %s! I'm %d years old"; /*мы создали шаблон который в последствии можем совместить с
         некоторыми значениями %s будет в будущем содержать строчное значение, а %d в будущем будет содержать целочисленное значение*/
        int age = 30;
        String name = "Alex";
        System.out.println(String.format(str, name, age));// вывод будет My name is Alex! I'm 30 years old
        System.out.println(String.format(str, "Vasiliy", 12));// вывод: My name is Vasiliy! I'm 12 years old
        System.out.println("--------------------------------------------------------");

        // Оперируем числом в строке с помощью метода .parseInt (пример внизу)

        String age2 = "30"; // создаем строку со значением int(целочисленным)
        int a = Integer.parseInt(age2); //определяем значение строки age2(30) в число с помощью метода parseInt и определяем переменной а
        System.out.println(a * 10); // вывод 300
        System.out.println("--------------------------------------------------------");

        // Операция слияния(конкотенация) строк через + или с помощью метода .concat

        // 1 пример с помощью +
        String first = "I";
        String second = " am the best";
        String third = " programmer ever!";
        String result = first+second+third;
        System.out.println(result);

        //2 пример с помощью метода .contat Этот метод улучшает производительность системы

        result = first.concat(second).concat(third);
        System.out.println(result);

        System.out.println("--------------------------------------------------------");


        // Вырезаем и выводим часть символов в строке через метод substring (используем индексы

        System.out.println(something.substring(1,5));// вырежет ello(4 символы между 1 и 5)
        System.out.println(something.substring(7)); // можна указать один индекс(7)и все выведется от 7 индекса до конца строки
        System.out.println("--------------------------------------------------------");

        // Можно совмещать использование методов

        System.out.println(something.substring(7, something.length()-1)); /*вывод будет worl, мы получили часть слова от 7 индекса до
         предпоследнего символа*/
        System.out.println("--------------------------------------------------------");

    }

}
