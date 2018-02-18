package mypackage;

/**
 * Created by Alex on 2/18/2018.
 */

// Создали ЭТОТ КЛАСС ДЛЯ ДЕМОНСТРАЦИИ ИНТЕРФЕЙСОВ
public class CarSecond implements Transport { //для имплементирования интерфейса(Transport) нужно использовать key-слово implement

    @Override
    public void go(){ //имплементируем метод go который указан в интерфейсе(Transport)
        System.out.println("We are driving!");

    }
    @Override
    public void stop(){//имплементируем метод stop который указан в интерфейсе(Transport)
        System.out.println("We are stop");

    }
}
