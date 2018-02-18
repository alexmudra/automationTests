package mypackage;

/**
 * Created by Alex on 2/18/2018.
 */
public class DogSecond extends AnimalSecond {//создали дочерний клас от родительского класса AnimalSecond
    @Override// переопределили метод
    public void saySmth() {
        System.out.println("Gav Gav Gav");

    }

    @Override// переопределили метод
    public void eat() {
        System.out.println("I like my food");

    }

    public void sit(){//создали обычный метод для примера
        System.out.println("I'm sitting");
    }
}
