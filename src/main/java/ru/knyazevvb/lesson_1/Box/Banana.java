package ru.knyazevvb.lesson_1.Box;

public class Banana implements Fruit{
    @Override
    public String getName() {
        return "Банан";
    }

    @Override
    public double getWeight() {
        return 0.5;
    }
}
