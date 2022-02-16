package ru.knyazevvb.lesson_1.Box;

public class Main {
    public static void main(String[] args) {
        Box<Banana> bananaBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        bananaBox.add(new Banana());
        bananaBox.add(new Banana());
        bananaBox.add(new Banana());
        bananaBox.add(new Banana());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        bananaBox.info();
        appleBox.info();

        System.out.println(appleBox.compare(bananaBox));

        Box<Banana> bananaBox1 = new Box<>();
        bananaBox1.moveFruitsFrom(bananaBox);
        bananaBox1.info();

        Box<Banana> bananaBox2 = new Box<>();
        bananaBox2.info();
    }
}
