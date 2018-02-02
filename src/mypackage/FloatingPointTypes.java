package mypackage;

/**
 * Created by Alex on 2/2/2018.
 */

public class FloatingPointTypes {
    public static void main(String[] args) {
        double a, b = 4.12;
        a = 22.1 + b;
        float pi = 3.14f; // При использовании типа float требуется указывать суффикс f или F
        // так как дробные литералы типа double
        float anotherPi = (float) 3.14; // Можно привести явно
        double c = 27;
        double d = pi * c;
        System.out.println(d);
    }
}