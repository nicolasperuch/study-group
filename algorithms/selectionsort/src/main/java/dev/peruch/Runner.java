package dev.peruch;

import dev.peruch.ordenation.Selectionsort;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(-5);
        list.add(50);
        list.add(10);
        list.add(22);
        list.add(54);
        list.add(35);

        System.out.println(new Selectionsort().sort(list).toString());
    }

}
