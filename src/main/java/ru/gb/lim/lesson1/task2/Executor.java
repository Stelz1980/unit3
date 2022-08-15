package ru.gb.lim.lesson1.task2;

import ru.gb.lim.lesson1.task1.exceptions.ArrayException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Executor {


    public static void main(String[] args) throws ArrayException {
        String [] array = {"ss","sas", "sds", "ssd", "ssqwqw"};
        System.out.println(arrayToArrayList(array));

    }

    public static <T> ArrayList<T> arrayToArrayList(T ... args) {
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, args);
        return arrayList;
    }
}
