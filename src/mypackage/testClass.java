package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с большой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

              Car car1 = new Car();// мы создали обект(car2) класса Car
        // В круглых скобках мы можем указать параметры для конструктора класса Car

        // зададим обекту car1 значения
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2500;

        // Создадим еще один объект сласса Car с параметром цвета
        Car car2 = new Car("Grey");
        System.out.println("Car color is " + car2.color);
        codeDeviderLine();

        //вызываем метод с родительского класа car и зададим значение 50
        car1.addWeight(50);//результат метода будет: New weight: 2050
        codeDeviderLine();

        car1.drive(120);// результатом метода drive: The speed is Ok. We're ready to drive
        codeDeviderLine();

        // Создадим новый объект

        Car car3 = new Car("Red", 2, 3, 4);
        System.out.println("Our car has the following parametrs: "+ car3.color+ " " + car3.width+" " + car3.height+" "+ car3.length);
        codeDeviderLine();

        /*Для того чтобы обратится с статичной переменной или классу нам можно обратится просто через имя класса.
        * Тоесть без создания нового екземпляра класса*/

        System.out.println("Static variable is " + Car.var); // мы просто получили значение статичной переменной через имя класса Car
        // и через точку имя статичной переменной var (Car.var)
        codeDeviderLine();

        Car.var = 200;// также мы можем изменять значение статичной переменной (было 10) а стало 200
        System.out.println("Static variable is " + Car.var);
        codeDeviderLine();

        // Можем вывести значение статического метода через название класса. Н-р: Car.method
        Car.method(); //результат вывода будет My static method
        codeDeviderLine();

        // Выводим переменную c модификатором final
        System.out.println("My final variable is " + Car.final_variable);
        codeDeviderLine();

        // Выводим метод с модификатором final
        Car.final_method();
        codeDeviderLine();









    }
    static void codeDeviderLine(){
        System.out.println("---------------------------------" + " End Code " + "-----------------------------------");
    }
}


