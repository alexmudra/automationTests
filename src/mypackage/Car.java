package mypackage;

/**
 * Created by Alex on 2/13/2018.
 */
public class Car { // создали класс Car(классы пишем с большой буквы), модификатор доступа класса public

// Обозначим свойства/параметры для класса Car

    int height;
    int width;
    int length;
    int weight =2000;
    int maxweight=2700;
    String color;
    int speed;
    int maxspeed = 250;

    // добавим несколько методов

    public void addWeight(int weight){ // метод принимает массу
        this.weight += weight; // тоесть к текущей массе авто мы будем добавлять массу которую вызвали в методе
        System.out.println("New weight: " + this.weight);

    }
// метод для управления авто посдедством скорости
    public void drive(int speed){
        if(weight <= maxweight){
            this.speed = speed;
            System.out.println("The speed is Ok. We're ready to drive");
        } else {
            System.out.println("Sorry. I can't derive. You're too heavy");
        }
    }

}
