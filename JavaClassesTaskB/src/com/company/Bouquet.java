package com.company;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Accessory> accessories = new ArrayList<>();

    public Bouquet(int numberOFRoses, int numberOfTulips, int numberOfViolets, int numberOfSparkles, int numberOfStickers, int numberOfTapes){
        for (int i = 0; i < numberOFRoses; i++){
            flowers.add(new Rose());
        }
        for (int i = 0; i < numberOfTulips; i++){
            flowers.add(new Tulip());
        }
        for (int i = 0; i < numberOfViolets; i++){
            flowers.add(new Violet());
        }
        for (int i = 0; i < numberOfSparkles; i++){
            accessories.add(new Sparkles());
        }
        for (int i = 0; i < numberOfStickers; i++){
            accessories.add(new Sticker());
        }
        for (int i = 0; i < numberOfTapes; i++){
            accessories.add(new Tape());
        }
    }

    public int getPriceOfBouquet(){
        int priceOfBouquet = 0;
        for (int i = 0; i < flowers.size(); i++){
            priceOfBouquet += flowers.get(i).getPriceOfFlower();
        }
        for (int i = 0; i < accessories.size(); i++){
            priceOfBouquet += accessories.get(i).getPriceOfAccessory();
        }
        return priceOfBouquet;
    }

    public void printBouquet(){
        for (int i = 0; i < flowers.size(); i++){
            System.out.println(flowers.get(i).toString());
        }
    }

    public void sortByFreshness(){
        for (int i = 0; i < flowers.size() - 1; i++){
            for (int j = i + 1; j < flowers.size(); j++){
                if(flowers.get(i).getFlowerFreshness() > flowers.get(j).getFlowerFreshness()){
                    Flower tempFlower = flowers.get(i);
                    flowers.set(i, flowers.get(j));
                    flowers.set(j, tempFlower);
                }
            }
        }
    }

    public Bouquet() {
        flowers.add(new Rose(10, 5, 10));
        flowers.add(new Rose(7, 4, 9));
        flowers.add(new Rose(9, 7, 8));
        flowers.add(new Tulip(8, 3, 11));
        flowers.add(new Tulip(8, 5, 10));
        flowers.add(new Tulip(9, 1, 5));
        flowers.add(new Violet(11, 2, 8));
        flowers.add(new Violet(5, 2, 9));
        flowers.add(new Violet(6, 4, 7));
    }

    public void searchStemLength(int lowerSize, int maxSize){
        System.out.println("Flowers in bouquet with stem length more than " + lowerSize + " and lower than " + maxSize + ":");
        for (int i = 0; i < flowers.size(); i++){
            if (flowers.get(i).getStemLength() >= lowerSize && flowers.get(i).getStemLength() <= maxSize){
                System.out.println(flowers.get(i).toString());
            }
        }
    }
}
