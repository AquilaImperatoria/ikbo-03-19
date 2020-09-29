package ru.mirea.lab7;

import java.util.ArrayList;
import java.util.Random;

public class ArrayTest {

    public static void addRandomInt(ArrayList<Integer> list, int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(500));
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>(30);

        System.out.println(list1.size());
        addRandomInt(list1, 20);
        System.out.println(list1.size());
        System.out.println(list1);
        list1.clear();
        System.out.println(list1.size());

        System.out.println("---------------------");

        System.out.println(list2.size());
        addRandomInt(list2, 5);
        System.out.println(list2.size());
        System.out.println(list2);
        list2.trimToSize();

        System.out.println("----------------------");

        addRandomInt(list1, 10);
        System.out.println(list1);
        System.out.println(list2);

        list2.addAll(list1);
        System.out.println(list2);


    }
}