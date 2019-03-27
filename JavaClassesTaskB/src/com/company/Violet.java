package com.company;

public class Violet extends Flower {
    public Violet(int priceOfFlower, int flowerFreshness, int stemLength) {
        super("Violet", priceOfFlower, flowerFreshness, stemLength);
    }

    public Violet() {
        super("Violet", 8, 1, 6);
    }
}
