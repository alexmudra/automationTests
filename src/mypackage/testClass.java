package mypackage;

/**
 * Created by Alex on 2/2/2018.
 */
public class testClass { //название класса должно совпадать с названием внутри package и начинаться с маленькой буквы

    public static void main(String[] args) { // этот метод обязателен, является точкой входа в программу

        //УСЛОВНЫЕ ОПЕРАТОРЫ

        // Примеры с if  else

        int i = 10;

        if (i > 5) { //если условие с if будет true, то команда сработает
            System.out.println("Great: " + "i > 5");
            i++; // добавляет 1 (инкремент) к значению
            System.out.println(i);
        } else { //если команда будет false то выведет сообщение об ошибке
            System.out.println("Ohh. Error: i <= 5");
            i--;
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------------");

        // Примеры с if, else if

        if (i > 5) { //если условие с if будет true, то команда сработает
            System.out.println("Great: " + "i > 5");
            i++; // добавляет 1 (инкремент) к значению
            System.out.println(i);
        } else if (i < 10 && i > 5) { //если результат будет true то сработает этот код
            System.out.println("Ohh. Error: i < 10 and i > 5");
            i--;
            System.out.println(i);
        } else {
            System.out.println("Nothing");
        }
        System.out.println("------------------------------------------------------------");

        //Вложеные условия. Пример

        i = 100;
        if (i > 50){
            System.out.println("The value i > 50");
            if (i > 90){
                System.out.println("The value i > 90");
            }
            else {
                System.out.println("The value i <= 90");
            }
        }
        else {
            System.out.println("Tha value i <= 50");
        }
        System.out.println("------------------------------------------------------------");

        //Оператор множественного  выбора Switch (он проверяет равенство на конкретное значение) это отличие от if

        i = 6;

        switch (i){ //в круглыъ скобках указываем переменную i, которую будем сравнивать с case
            case 1:
                System.out.println("The number is 1");
            case 2:
                System.out.println("The number is 2");
            case 3:
                System.out.println("The number is 3");
                break; // прерывает проверки(выход из цикла
            default: //это аналог else в if, если какое то действие не подошло
                System.out.println("The number is unknown");
        }


        System.out.println("------------------------------------------------------------");



    }
}

