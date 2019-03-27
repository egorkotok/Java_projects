package com.company;

public class Flower {
    private String nameOfFlower;
    private int priceOfFlower;
    private int flowerFreshness;
    private int stemLength;

    public String getNameOfFlower() {
        return nameOfFlower;
    }

    public void setNameOfFlower(String nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    public int getPriceOfFlower() {
        return priceOfFlower;
    }

    public void setPriceOfFlower(int priceOFFlower) {
        this.priceOfFlower = priceOFFlower;
    }

    public int getFlowerFreshness() {
        return flowerFreshness;
    }

    public void setFlowerFreshness(int flowerFreshness) {
        this.flowerFreshness = flowerFreshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public Flower() {
    }

    public Flower(String nameOfFlower, int priceOfFlower, int flowerFreshness, int stemLength) {
        this.nameOfFlower = nameOfFlower;
        this.priceOfFlower = priceOfFlower;
        this.flowerFreshness = flowerFreshness;
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return "Name of flower: " + nameOfFlower +
                "; price of flower: " + priceOfFlower +
                "; flower freshness: " + flowerFreshness + " days" +
                "; stem length: " + stemLength;
    }
}
