package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        // ИЗУЧАЕМ МЕТОДЫ В JAVA


        int a = 13;
        int b = 2222;
        int summ2; //создали переменную

        summ2 = getSum(a,b); //переменной summ2 мы вызвали метод getSum и передали значения
        System.out.println(summ2); // вывели результат на екран
        System.out.println("---------------------------------------------------------------");
        System.out.println(getSum(2,2)); //вторая вариация синтаксиса и использования метода getSum
        System.out.println("---------------------------------------------------------------");
        showSum(10,20,40);//вызвали метод showSum с различными значениями
        System.out.println("---------------------------------------------------------------");

        saySmthWithoutValues();
        devideCodeLine();

        sayString("Alex");//вызвали метод который принимает стринг
        devideCodeLine();

        String name = "Vera";//переопределили присвоили переменной name значение Vera
        sayString(name); //запустили метод с новым значением Вера
        devideCodeLine();

        showPreviousMethods("Elena", 12, 16, 25);//вызываем и передаем в метод showPreviousMethods стринг и 3 значения
        devideCodeLine();

        boolean result = showBooleanValue(20, 50, 30);// создали и вызвали булеан метод
        System.out.println(result);
        devideCodeLine();
    }

    //напишем метод(блок кода), который возвращает сумму чисел. static мы обозначили статический метод. такой же как и
    //родительский
    static int getSum(int x, int y){
        // в фигур. скобках(тело метода) пишем последовательность действий которое должны выполняться

        int sum;
        sum = x + y;
        return sum; //ретурн возвращает какое-то значение в методе

    }

    // создадим метод showSum(с void)который не возвращает значения определенного типа.
    static void showSum(int x, int y, int z){
        int summ3 = x+y+z;
        System.out.println("Summ3 is " + summ3);
    }
    // Намишем метод который не принимает какие-то значения, он просто выполнит какието действия
    static void saySmthWithoutValues(){
        System.out.println("Empty string");
        System.out.println("Hello");
        System.out.println("I'm styding. Do you see it?");
    }
    static void devideCodeLine(){
        System.out.println("--------------------------------------------------------------------");
    }
    // создадим метод sayString который принимает стринговое значение
    static void sayString(String name){
        System.out.println("Hi, "+ name + "!");
        System.out.println("Are you ready to learn Java?");
    }
    //Создадим новый метод который выводит методы которые мы уже создали
    static void showPreviousMethods(String name, int a, int b, int z){
        System.out.println("Start of program");
        sayString(name);
        showSum(a, b, z);
        System.out.println("End of program");
    }
    //Создадим метод с типом булеан
    static boolean showBooleanValue(int x, int y, int z){
        int sum = x + y+ z;
        System.out.println("The sum is " + sum);
        return true;

    }



}

