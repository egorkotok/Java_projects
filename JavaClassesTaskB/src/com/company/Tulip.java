package com.company;

public class Tulip extends Flower {
    public Tulip(int priceOfFlower, int flowerFreshness, int stemLength) {
        super("Tulip", priceOfFlower, flowerFreshness, stemLength);
    }

    public Tulip() {
        super("Tulip", 7, 5, 8);
    }
}
