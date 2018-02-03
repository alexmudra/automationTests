package mypackage;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args){ // этот метод обязателен, является точкой входа в программу

        //МАСИВЫ ARRAYS

        String [] names; // создаем масив с названием names
        names = new String[3]; /*выделили область памяти для хранения елементов типа String и размер даного масива будет
        3 елемента*/

        String[] names2 = new String[3]; // создали такой же масив только код короче


//создали масив с 10 елементов типа integer(число)

        int[] nameOfintArray = new int[10];

        // ЗАПОЛНЯЕМ КАЖДУЮ ЯЧЕЙКУ МАСИВА names2 строковое значение

        names2[0] = "Alex";
        names2[1] = "Roma";
        names2[2] = "Illia";

        System.out.println(names2[2]);
        System.out.println(names2[1]);
        System.out.println(names2[0]);

        // Пример короткого синтаксиса для создания и заполнения масива

        int[] array = {12, 13, 123, 2123, 532};
        System.out.println(array[2]);

        // Пример вывода всех значений цикла через цикл for

        for (int i=0; i<5; i++){
            System.out.println(array[i]); // выветутся на екран все елементы с 0 по 4
        }
        // Пример создания и заполнения масива через цыкл

        int[] createArrayViaFor = new int[11]; // инициализируем новый масив без значений

        for (int j=0; j<11; j++) { // создаем счетчик j
            createArrayViaFor[j] = j * 10; //присвоим итому елементу j в масиве createArrayViaFor значение j * 10;
            System.out.println(createArrayViaFor[j]); // виводим результат на екран
        }
        System.out.println();

        // Пример вывода на екран значения масива, к-ва елементов

        System.out.println(createArrayViaFor.length);

        // Пример как узнать значение в определенной области памяти масива
        System.out.println();
        System.out.println(createArrayViaFor[createArrayViaFor.length-1]); /* выводим значение на екранмы просто отнимаем 1
        от общего числа индексов масива */

    }

}
