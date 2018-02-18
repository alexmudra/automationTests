package mypackage;

/**
 * Created by Alex on 2/18/2018.
 */
public class CatSecond extends AnimalSecond {

    @Override//переопределили метод
    public void saySmth() {
        System.out.println("Mur Mur Mur");//а тут реализовали методы из класса AnimalSecond

    }

    @Override// переопределили метод
    public void eat() {
        System.out.println("Give me some milk");//а тут реализовали методы из класса AnimalSecond

    }
}
