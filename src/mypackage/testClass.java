package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        // ИСКЛЮЧЕНИЯ В JAVA. Используются когда в коде выскакивает какой то ексепшн


        devide(10, 5);
        codeDeviderLine();//The result is 2
        //Finish

        devide2(20,0); // вернет ексепшн "Error. You can't devide by zero"
        codeDeviderLine();


        // Примеры методов
    }
        //используем команду try catch

    public static void devide(int a, int b) {
        try { // эта команда выполняет блок кода в фигур.скобках
            System.out.println("The result is " + a / b);//это пример кода
        } catch (ArithmeticException e ){// catch + в скобках клас (н-р: ArithmeticExeption -> ловит арифметические ошибки)
            // указываем ошибку которую мы планируем ловить. Можем вставлять любое к-во блоков try catch finally

            System.out.println("Issue");//тут описываем действия если мы поймаем ошибку (например деление на 0
        } finally { // finally указывает, что блок кода будет выполнятся в случае без ошибок и с ошибкой, без разницы
            //finally можна не писать, все по желанию
            System.out.println("Finish");

        }
    }
    // Используем команду throw
    public static void devide2(int z, int d){
        if (d == 0){
            throw new ArithmeticException("Error. You can't devide by zero");
        } else {
            System.out.println("Resuls is " + z / d);
        }
    }

    // Новая команда!!!
    // Блок кода throws в описании метода указывает на тот ексепшн который он может выбросить

    static void codeDeviderLine(){
        System.out.println("---------------------------------"+" End Code "+"-----------------------------------");
    }

}

