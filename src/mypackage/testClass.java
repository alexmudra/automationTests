package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        // ИЗУЧАЕМ КЛАССЫ НА ПРИМЕРЕ НОВОГО КЛАССА Car (в классе TestClass будем создавать екземпляр метода

        Car car1 = new Car();// мы создали обект(car2) класса Car

        // зададим обекту car1 значения
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2500;

        //вызываем метод с родительского класа car и зададим значение 50

        car1.addWeight(50);//результат метода будет: New weight: 2050

        car1.drive(120);// результатом метода drive: The speed is Ok. We're ready to drive



   // static void codeDeviderLine(){
     //   System.out.println("---------------------------------"+" End Code "+"-----------------------------------");
    }

}

