package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecondTask {

//    Задан список целых чисел и некоторое число Y.
//    Не используя вспомогательных объектов и методов сортировки и не изменяя размера списка,
//    переставить элементы списка так, чтобы сначала шли числа, не превосходящие Y, а затем числа, больше Y.


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTheList(list, 13);
        System.out.println(list);
        replaceList(list, 20);

    }

    public static void fillTheList(List<Integer> list, int n){
        for (int i = 0; i < n; i++){
            list.add(new Random().nextInt(40));
        }
    }

    public static void replaceList(List<Integer> list, int number){
        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < list.size() - i - 1; j++){
                if (list.get(j) > number){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
            System.out.println(list);
        }
    }


}
