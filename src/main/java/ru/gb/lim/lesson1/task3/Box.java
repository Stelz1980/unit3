package ru.gb.lim.lesson1.task3;

import ru.gb.lim.lesson1.task3.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruits  = new ArrayList<T>();

     public void addFruit (T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
          return  fruits.stream().map(item ->item.getWeight()).reduce(0f, (a, b) -> a+b);
    }


}
