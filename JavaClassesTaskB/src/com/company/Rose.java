package com.company;

public class Rose extends Flower {
    public Rose(int priceOfFlower, int flowerFreshness, int stemLength) {
        super("Rose", priceOfFlower, flowerFreshness, stemLength);
    }

    public Rose() {
        super("Rose", 10, 3, 5);
    }


}
