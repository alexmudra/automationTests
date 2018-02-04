package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        //ИТЕРАТОР - это интерфейс который позволяет работать с елементами списка или колекции
        // В етом интерфейсе много методов (включая метод .iterator

        List<Integer> firstList = new ArrayList<>();/*объявляем коллекцию firstList, <указываем типы даных которые будут хранится>
 +        firstList- название колекции, устанавливаем тип листа ArrayList (возможно указать другой тип листа)*/
            firstList.add(5);//заполняем/добавляем в список с помошью метода .add елемент 5 - етот метод позволяет добавить значение в список
            firstList.add(10); //добавили в лист значение 10
            firstList.add(9);
            firstList.add(11);
        System.out.println("Values of firstList collection  " +firstList);
        System.out.println("------------------------------------------------------------------");

        List<Integer> secondList = new ArrayList<>();
            secondList.add(45);
            secondList.add(56);
            secondList.add(66);
            secondList.add(75);
            System.out.println("Values of secondList collection  "+ secondList);//размер списка 4
        System.out.println("------------------------------------------------------------------");

        //Создали итератор.
        //Разбираем метод .next выводит следующий елемент в списке
        //Разбираем метод .hasnext

        Iterator<Integer> firstIterator = firstList.iterator(); //создали интерфейс с названием firstIterator обращаемся к списку firstList
        System.out.println(firstIterator.next());//выведет первый (5) елемент списка firstList
        System.out.println(firstIterator.next());//выведет второй(10) елемент списка firstList
        System.out.println(firstIterator.next());//выведет третий(9) елемент списка firstList
        System.out.println(firstIterator.next());//выведет четвертый(11) елемент списка firstList
        System.out.println(firstIterator.hasNext());//выведет фолс потому что в списке нет 5 елемента(всего 4)
        System.out.println("------------------------------------------------------------------");

        //Рассмотрим как можно управлять итератором через цикл while

        Iterator<Integer> secondIterator = secondList.iterator();//для примера создали еще один итератор secondIterator
        while (secondIterator.hasNext()){//цикл будет перебирать все елементы в списке пока метод .hasnext (он есть условия цикла)
            // будет возвращать тру, и пока не дойдет до последнего елемента в листе
        System.out.println(secondIterator.next());//метод .next использовали для вывода значений в списке
        }
        System.out.println("------------------------------------------------------------------");
    }
}

