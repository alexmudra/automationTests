package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass {

    //НАСЛЕДОВАНИЕ В JAVA. Важно, что родительский класс может быть только один, а наследников может быть множество
    /*
    При использовании наследования вы говорите: Этот новый класс похож на тот старый класс.
    В коде это пишется как extends, после которого указываете имя базового класса.
    Тем самым вы получаете доступ ко всем полям и методам базового класса.
    Используя наследование, можно создать общий класс, которые определяет характеристики, общие для набора связанных элементов.

    Затем вы можете наследоваться от него и создать новый класс, который будет иметь свои уникальные характеристики.
    Главный наследуемый класс в Java называют суперклассом. Наследующий класс называют подклассом.
    Получается, что подкласс - это специализированная версия суперкласса, которая наследует все члены суперкласса и добавляет
     свои собственные уникальные элементы. К примеру, в Android есть класс View и подкласс TextView.
     Чтобы наследовать класс, достаточно вставить имя наследуемого класса с использованием ключевого слова extends:

        public class MainActivity extends Activity {

        } */

        public static void main(String[] args) {

            // создадим объект каждого класса (Dog, Cat)

            Cat catBayun = new Cat();
            Dog dogRoki = new Dog();

            catBayun.name = "Bayun"; // дали имя нашему коту
            dogRoki.name = "Roki"; // дали имя нашей собеке

            catBayun.color = "White"; //обозначили коту цвет
            dogRoki.color = "Black"; // обозначили собаке цвет

            catBayun.walk("Park");
            dogRoki.walk("Backyard");

            catBayun.feed("Milk");// метод feed есть только в класе Cat, указали чем мы будем кормить кота
            dogRoki.sit_down(); // тут мы просто указываем метод sit_down который уже определен в класе Dog

            System.out.println("The cat's name is "+ catBayun.name); //вывод будет The cat's name is Bayun
            System.out.println("The dog's name is "+ dogRoki.name); //The dog's name is Roki


            System.out.println(dogRoki.getWeight());//мы обратились через геттер к методу weight из класса Dog
            //чтобы получить вес dogRoki

            // На примере с sounds мы видем ПОЛИМОРФИЗМ

            dogRoki.sounds(); // для собаки вывод будет Brrrrr-Gau-Gau
            catBayun.sounds();// для кота вывод будет Myau-Myau-Myau


        }







    static void codeDeviderLine(){
        System.out.println("---------------------------------" + " End Code " + "-----------------------------------");
    }
}


