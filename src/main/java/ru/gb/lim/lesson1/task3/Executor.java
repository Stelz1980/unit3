package ru.gb.lim.lesson1.task3;

import ru.gb.lim.lesson1.task3.fruits.Apple;
import ru.gb.lim.lesson1.task3.fruits.Orange;

public class Executor {
    public static void main(String[] args) {
        Box<Orange> boxOrange = new Box<>();
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());

        Box<Apple> boxApple = new Box<>();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());

        System.out.println(boxApple.getWeight());
        System.out.println(boxOrange.getWeight());
    }
}
