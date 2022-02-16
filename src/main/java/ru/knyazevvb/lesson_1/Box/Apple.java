package ru.knyazevvb.lesson_1.Box;

public class Apple implements  Fruit {

    @Override
    public String getName() {
        return "Яблоко";
    }

    @Override
    public double getWeight() {
        return 1.0;
    }
}
