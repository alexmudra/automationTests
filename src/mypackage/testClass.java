package mypackage;

import java.util.*;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        //MAP КОЛЕКЦИЯ (отличительная особенность map: хранятся только пары key + value)
        //key может быть любого типа). Доступ к колекции по уникальному ключу, значения могут повторятся

        Map<Integer, String> myMap = new HashMap<>();/*Map<Integer, String> - создали Map где индексы будут интежер,
        а значения стринг*/
        myMap.put(1, "Black"); //помещаем стринговое значение Black в ключ 1 должен быть уникальным
        myMap.put(2, "White");
        myMap.put(3, "Yellow");
        System.out.println("Values in my" + myMap);
        System.out.println(myMap.get(1));// .get используется для вывода значения под ключом 1
        System.out.println("------------------------------------------------------------------");

        System.out.println(myMap.size());//выведет к-во пар в мапе
        //myMap.clear(); //очищает значения в мапе
        //System.out.println(myMap.size());//вывод будет 0, потому что мы выше очистили мапу
        System.out.println("------------------------------------------------------------------");

        System.out.println(myMap.containsKey(1));//.containsKey позволяет узнать если в мапе определенный ключ (булеан)
        System.out.println("------------------------------------------------------------------");

        System.out.println(myMap.containsValue("Black"));//.containsValue проверяет есть ли такое значение в мапе (булеан)
        System.out.println("------------------------------------------------------------------");

        //Пример кода с использованием итератора и цикла, чтобы узнать значения всех ключей
        Set<Integer> keys = myMap.keySet();//.keySet возвращает все ключи которые есть в мапе
        Iterator<Integer> myIterator = keys.iterator();
        while (myIterator.hasNext()){
            System.out.println(myMap.get(myIterator.next()));
            System.out.println("------------------------------------------------------------------");
        }

        //поменять значение в ключе через метод .put
        myMap.put(1,"Orange");
        System.out.println(myMap.get(1));// значение в ключе 2 было блек, а теперь оранж
        System.out.println("------------------------------------------------------------------");

        //Создадим map со типом ключа стринг и значением типа стринг

        Map<String,String> mySecondMap = new HashMap();
        mySecondMap.put("Alex", "Alexandrovich");
        mySecondMap.put("Ziaida","Koshlina");
        mySecondMap.put("Arhimed","Sokratovich");
        System.out.println(mySecondMap.get("Alex"));//вывод будет Alexandrovich
        System.out.println(mySecondMap.get("Arhimed"));//вывод будет Sokratovich

    }




}

