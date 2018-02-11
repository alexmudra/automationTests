package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        // ПЕРЕГРУЗКА МЕТОДОВ В JAVA - ПИСАТЬ МЕТОД НЕСКОЛЬКО РАЗ С ОДНИМ ИМЕНЕМ В ЗАВИСИМОСТИ ОТ ПАРАМЕТРОВ КОТОРЫЕ
        // ОН ПРИНИМАЕТ. МЫ МОЖЕМ НАПИСАТЬ НЕСКОЛЬКО МЕТОДОВ, НО ПЕРЕДАВАТЬ В НЕГО РАЗЛИЧНЫЕ ПАРАМЕТРЫ


        int result; // вызвали метод getSum который обрабатывает 2 параметра
        result = getSum(1,2);
        System.out.println(result);
        codeDeviderLine();

        result = getSum(10,20,30);// вызвали ПЕРЕГРУЖЕНЫЙ метод getSum который обрабатывает 3 параметра
        System.out.println(result);
        codeDeviderLine();

        sayHello("Alex");//мы вызвали метод и передали туда 1 стринговое значение
        codeDeviderLine();

        sayHello("Vera", "Alena");//мы вызвали ПЕРЕГРУЖЕНЫЙ метод sayHello и передали туда 2 стринговых значения
        codeDeviderLine();

        int [] array = {1,23,233,35,67};//создаем масив значения которого будет принимать метод getSum

        getSum(array, "Alex");//вызвали перегруженый метод со значениями из масива и стринговым значением
        codeDeviderLine();

    }
/* Примеры различных перегруженых методов */

    static int getSum(int x, int y){//метод принимает 2 параметра
        // в фигур. скобках(тело метода) пишем последовательность действий которое должны выполняться
        int sum;
        sum = x + y;
        return sum; //return возвращает какое-то значение в методе

    }
    static int getSum(int x, int y, int z) {//метод принимает 3 параметра - мы ПЕРЕГРУЗИЛИ МЕТОД getsum
        // в фигур. скобках(тело метода) пишем последовательность действий которое должны выполняться
        int sum;
        sum = x + y + z;
        return sum;
    }
    static int getSum(int[]array, String name) {//перегрузим етот метод где он будет принимать масив чисел и плюс какое-то имя
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Hi," + name);
        System.out.println("Your sum is " + sum);
        return sum;


    }
    static void sayHello(String name1) {//этот метод sayHello обрабатывает 1 стринговое значение
        System.out.println("Hi, " + name1 + "!");
        System.out.println("Are you ready to learn Java?");

    }

    // создадим метод sayString который принимает стринговое значение
    static void sayHello(String name1, String name2){//этот метод sayHello обрабатывает 2 стринговых значения
        System.out.println("Hi, "+ name1 + "!");
        System.out.println("Hi, "+ name2 + "!");
        System.out.println("Are you ready to learn Java?");
    }
    static void codeDeviderLine(){
        System.out.println("---------------------------------"+"End Code"+"-----------------------------------");
    }

}

