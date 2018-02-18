package mypackage;

/**
 * Created by Alex on 2/17/2018.
 */

//ПОЛИМОРФИЗМ В JAVA
    /*
    Полиморфизмом назвается возможность работать с несколькими типами так, как будто это один и тот же тип и в то же время
    поведение каждого типа будет уникальным в зависимости от его реализации. Возможно, что вы ничего не поняли, поэтому попробую
    описать это иначе и на примере. Давайте так и сделаем.
*/
    /*СОЗДАДИМ НАСЛЕДНИКА ОТ КЛАССА ANIMAL*/


public class Dog extends Animal{ /* через слово extends мы указали что класс Dog наследует все особенности (методы
    и переменные от класса Animal*/

    private int weight =200; // создали переменную с весом

    public int getWeight() { // метод Get (геттер) мы сделали через alt+insert чтобы иметь возможность оперировать значением
        //из private метода.
        // Метод get возвращает значение переменной
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;// метод set (cеттер) мы сделали через alt+insert чтобы иметь возможность оперировать значением
        //из private метода.
        // Метод set присваивает значение переменной
    }




    public void sit_down(){// создали метод сидеть
        System.out.println("I'm sitting");
        var = 20;

    }
    public void lay_down(){// создали метод лежать
        System.out.println("I'm lying");
    }

    // Создадим переопределенный метод sounds(из родительского класса Animal для класса Cat


    @Override //переопределили родительский метод sounds из родительского класса Animal
    public void sounds(){
        System.out.println("Brrrrr-Gau-Gau");
    }

}