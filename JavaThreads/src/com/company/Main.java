package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

//    Автостоянка. Доступно несколько машиномест. На одном месте может находиться только один автомобиль.
//    Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList <Car> car = new ArrayList<Car>();
        int parkingSize = 5;

        int busyPlace = 0;

//        System.out.println("Enter parking size: ");
//        parkingSize = in.nextInt();
//        Parking parking = new Parking(parkingSize);

        car.add(new Car(4));
        car.add(new Car(2));
        car.add(new Car(6));
        car.add(new Car(8));
        car.add(new Car(1));


        for (int i = 0; i < car.size(); i++){
            car.get(i).start();
        }

        System.out.println("!");

        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < car.size(); i++){
            if (car.get(i).isDone()) {
                System.out.println("remove: " + car.get(i).getWaitingtime()) ;
                car.remove(i);
            }
        }

        System.out.println(car.size());

    }
}
