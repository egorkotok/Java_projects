package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ThirdTask {

//    Реализовать класс, моделирующий работу N-местной автостоянки.
//    Машина подъезжает к определенному месту и едет вправо, пока не встретится свободное место.
//    Класс должен поддерживать методы, обслуживающие приезд и отъезд машины.

    public static void main(String[] args) {
        Map<Integer, Integer> parkingPlace = new HashMap<>();
        Integer carNumber;

        fillTheParking(parkingPlace);
        System.out.println(parkingPlace);

        newCar(parkingPlace, 222);
        newCar(parkingPlace, 333);
        newCar(parkingPlace, 444);

        System.out.println(parkingPlace);

        leftThePlace(parkingPlace, 333);

        System.out.println(parkingPlace);
        
    }

    private static void fillTheParking(Map<Integer, Integer> parkingPlace){
        for (int i = 0; i < 15; i++){
            if (new Random().nextInt(2) == 1){
                parkingPlace.put(i, new Random().nextInt(1000));
            }
            else parkingPlace.put(i, 0);
        }
    }

    private static void newCar(Map<Integer, Integer> parkingPlace, Integer carNumber){
        for (int i = 0; i < parkingPlace.size(); i++){
            if (parkingPlace.get(i) == 0){
                parkingPlace.put(i, carNumber);
                i = parkingPlace.size();
            }
        }
    }

    private static void leftThePlace(Map<Integer, Integer> parkingPlace, Integer carNumber){
        for (int i = 0; i < parkingPlace.size(); i++){
            if (parkingPlace.get(i).equals(carNumber)){
                parkingPlace.put(i, 0);
                i = parkingPlace.size();
            }
        }
    }

}
