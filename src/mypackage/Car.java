package mypackage;


// КОНСТРУКТОР КЛАССА В JAVA
/*Конструктор класса - это метод который вызывается при создании объекта данного класса. В данном случае мы ничего в скобках не указывали
и это значит что конструктор не создан*/


public class Car { // создали класс Car(классы пишем с большой буквы), модификатор доступа класса public


    public Car(){// Создадим конструктор класса Car. По сути ми написали метод только без указания типа метода
        System.out.println("New car was created by me!");// мы создали конструктор класса Car

    }

    //Переопределим конструктор класса

    public Car(String color){// Создали 2-й конструктор класса Car с переменной color в круглых скобках
        this.color = color;//переменная color будет принимать, то значение которое мы хотим передавать в скобках

    }

    public Car(String color, int height, int width, int  length){// Создали 3-й конструктор класса Car с переменными в круглых скобках
        this.color = color;//переменная color будет принимать, то значение которое мы хотим передавать в скобках
        this.height = height;
        this.width = width;
        this.length = length;


    }

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
