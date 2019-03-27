package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FirstTask {

//    В кругу стоят N человек, пронумерованных от 1 до N.
//    При ведении счета по кругу вычеркивается каждый второй человек, пока не останется один.
//    Составить две программы,  моделирующие процесс. Одна из программ должна использовать класс ArrayList,
//    а вторая — LinkedList. Какая из двух программ работает быстрее? Почему?

//    Быстрее - LinkedList

    public static void main(String[] args) {

	    List<Integer> peoplesArray = new ArrayList<>();
	    List<Integer> peoplesLinked = new LinkedList<>();

	    addPeoples(peoplesArray, 7);
	    addPeoples(peoplesLinked, 10);

	    removePeoples(peoplesArray);
        removePeoples(peoplesLinked);

    }

    public static void addPeoples(List<Integer> peoples, int n){
        for (int i = 0; i < n; i++){
            peoples.add(i+1);
        }
    }

    public static void removePeoples(List<Integer> peoples){
        int element = 1;
        while (peoples.size()>1){
            //System.out.println(peoples);
            peoples.remove(element);
            element++;
            if (element == peoples.size() - 1){
                peoples.remove(element);
                element = 1;
            }
            if (element > peoples.size() - 1){
                element = 0;
            }

        }
        System.out.println(peoples);
    }

}
