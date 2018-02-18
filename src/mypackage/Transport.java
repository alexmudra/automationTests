package mypackage;

/**
 * Created by Alex on 2/18/2018.
 */
/*Общее определение: Интерфейс — это совокупность методов и правил взаимодействия элементов системы.
Другими словами, интерфейс определяет как элементы будут взаимодействовать между собой.

Интерфейс двери — наличие ручки;
Интерфейс автомобиля — наличие руля, педалей, рычага коробки передач;
Интерфейс дискового телефона — трубка + дисковый набиратель номера.
Когда вы используете эти "объекты", вы уверены в том, что вы сможете использовать их подобным образом. Благодаря тому, что вы знакомы с их интерфейсом.

В программировании что-то похожее. Почему графическую часть программы часто называют интерфейсом? Потому, что она определяет каким образом вы сможете использовать основной функционал, заложенный в программе.

"Интерфейс определяет каким образом мы можем использовать объект" - перенесем эту мысль в плоскость программирования.*/

public interface Transport { //создали интерфейс, ключевое слово для создания интерфейса interface

    void go();// объявили методы, в Интерфейсе тело методов не указываются
    void stop();// объявили методы, в Интерфейсе тело методов не указываются
}