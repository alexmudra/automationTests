package mypackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        /*Коллекции Set предназначены для хранения множества неповторяющихся объектов. Интерфейс Set предоставляет нам следующие методы :

        add(E e) — добавляем элемент в коллекцию, если такого там ещё нет. Возвращает true, если элемент добавлен addAll(Collection c)
         — добавляет все элементы коллекции с (если их ещё нет) clear() — удаляет все элементы коллекции
        contains(Object o) — возвращает true, если элемент есть в коллекции
        containsAll(Collection c) — возвращает true, если все элементы содержатся в коллекции
        equals(Object o) — проверяет, одинаковы ли коллекции
        hashCode() — возвращает hashCode
        isEmpty() — возвращает true если в коллекции нет ни одного элемента
        iterator() — возвращает итератор по коллекции
        remove(Object o) — удаляет элемент
        removeAll(Collection c) — удаляет элементы, принадлежащие переданной коллекции
        retainAll(Collection c) — удаляет элементы, не принадлежащие переданной коллекции
        size() — количество элементов коллекции
        toArray() — возвращает массив, содержащий элементы коллекции
        toArray(T[] a) — также возвращает массив, но (в отличии от предыдущего метода, который возвращает массив объектов типа Object)
         возвращает массив объектов типа, переданного в параметре.
        HashSet, TreeSet и LinkedHashSet относятся к семейству Set. В множествах Set каждый элемент хранится только в одном экземпляре,
        а разные реализации Set используют разный порядок хранения элементов. В HashSet порядок элементов определяется по сложному алгоритму.
        Если порядок хранения для вас важен, используйте контейнер TreeSet, в котором объекты хранятся отсортированными по возрастанию в порядке
        сравнения или LinkedHashSet с хранением элементов в порядке добавления.

        Множества часто используются для проверки принадлежности, чтобы вы могли легко проверить, принадлежит ли объект заданному множеству,
        поэтому на практике обычно выбирается реализация HashSet, оптимизированная для быстрого поиска.*/

        // Коллекция List (позволяет создавать динамические масивы)

        List<Integer> list = new ArrayList<>();/*объявляем коллекцию list, <указываем типы даных которые будут хранится>
        list- название колекции, устанавливаем тип листа ArrayList (возможно указать другой тип листа)*/
        list.add(5);//заполняем/добавляем в список с помошью метода .add елемент 5 - етот метод позволяет добавить значение в список
        list.add(10); //добавили в лист значение 10
        list.add(9);
        list.add(11);

        System.out.println(list.get(1)); //с помощью метода .get выводим(получаем) елемент которых хранится под индексом 1 (будет 10)
        System.out.println("------------------------------------------------------------------");

        //Можем присвоить переменной значение со списка

        int someValue = list.get(2);
        System.out.println(someValue);
        System.out.println("------------------------------------------------------------------");

        // Метод .set устанавливает значение в определенном индексе колекции

        list.set(2, 122);// метод заполнил значением 122 индекс 2
        System.out.println(list.get(2));
        System.out.println("------------------------------------------------------------------");

        // Метод .remove мы удаляем елемент со списка
        list.remove(1);//если мы удалим значение в списке то все значения в списке переместятся согласно индекса
        System.out.println(list.get(1));
        System.out.println("------------------------------------------------------------------");

        // .size метод который показывает размер списка(к-во елементов в колекции)
        System.out.println(list.size());
        System.out.println("------------------------------------------------------------------");

        //.clear позволяет очистить весь список
        /*list.clear(); //очищаем список
        System.out.println(list);// выводим значения списка
        System.out.println(list.size()); //смотрим размер списка (должно быть 0, нет содержимого)*/
        System.out.println("------------------------------------------------------------------");

        // Создадим дополнительную колекцию

        List<Integer> secondList = new ArrayList<>();
        secondList.add(45);
        secondList.add(56);
        System.out.println(secondList.size());//размер списка 2

        //С помощью метода .addAll копирует все значения с одного списка в другой н-р: с secondList в list

        list.addAll(secondList);
        System.out.println(secondList.size());
        System.out.println(secondList); // тут будет 2 значения (45 и 56)
        System.out.println(list); //тут будет 5 значений (5, 122, 11, 45сосписка и 56сосписка)
        System.out.println("------------------------------------------------------------------");

        //Удалить елементы со списка через операции с существующим списком
        list.removeAll(secondList);// удаляет все елементы списка secondList с колекции list
        System.out.println(list);//5,122,11
        System.out.println("------------------------------------------------------------------");

        //.isEmpty позволяет удостовериться в наличии/не наличии елементов в колекции (выводит булеан)
        System.out.println(secondList.isEmpty()); //вернет false потому что список содержит елементы
        System.out.println("------------------------------------------------------------------");

        //.contains покажет есть ли определенное значение в списке (выводит будеан)
        System.out.println(list.contains(122));// вернет true потому что 122 есть в колекции
        System.out.println(secondList.contains(0));// вернет false потому что 0 нет в колекции
        System.out.println("------------------------------------------------------------------");

        //.contains.all покажет наличие елементов одного списка в другом (возвращает boolean)
        secondList.addAll(list);// элементы колекции-донора будут копироваться вконец колекции-получателя
        System.out.println(secondList);//[45, 56, 5, 122, 11]
        System.out.println(secondList.containsAll(list)); //в етом примере метод .containsAll подтвердит(тру)что елементы list есть в secondList
        secondList.removeAll(list);//а теперь удалим елементы колекции list с колекции secondList
        System.out.println(secondList.containsAll(list));//проверка покажет (фолс)
        System.out.println("------------------------------------------------------------------");

        //

        System.out.println("------------------------------------------------------------------");
    }
}

