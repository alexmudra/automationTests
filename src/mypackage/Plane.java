package mypackage;

/**
 * Created by Alex on 2/18/2018.
 */

// Создали ЭТОТ КЛАСС ДЛЯ ДЕМОНСТРАЦИИ ИНТЕРФЕЙСОВ

public class Plane implements Transport {
    @Override
    public void go() {//реализовали метод который находится в интерфейсе Transport
        System.out.println("We're flying");

    }

    @Override
    public void stop() {//реализовали метод который находится в интерфейсе Transport
        System.out.println("We are landing");

    }

    public void setSpeed (int speed){
        System.out.println("Our speed is " + speed);
    }
}
