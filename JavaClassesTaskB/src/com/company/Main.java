package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов.
    // Собрать букет (используя аксессуары) с определением его стоимости.
    // Провести сортировку цветов в букете на основе уровня свежести.
    // Найти цветок в букете, соответствующий заданному диапазону длин стеблей.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bouquet bouquet = new Bouquet();
        //Bouquet bouquet = newBouquet();

        bouquet.sortByFreshness();

        //bouquet.printBouquet();

        searchFlowerWithCustomStemLength(bouquet);
    }

    public static void searchFlowerWithCustomStemLength(Bouquet bouquet) {
        Scanner in = new Scanner(System.in);

        int lowerSize = 0;
        int maxSize = 0;

        boolean correctNumber = false;

        while (!correctNumber){
            try{
                System.out.println("Enter lower length: ");
                lowerSize = in.nextInt();
                System.out.println("Enter max length: ");
                maxSize = in.nextInt();
                correctNumber = true;
            }
            catch (InputMismatchException exp){
                System.err.println("Wrong symbol!");
                in.nextLine();
            }
        }
        bouquet.searchStemLength(lowerSize, maxSize);

    }

    public static Bouquet newBouquet(){
        Scanner in = new Scanner(System.in);
        boolean correctNumber = false;

        int numberOfRoses = 0;
        int numberOfTulips = 0;
        int numberOfViolets = 0;

        int numberOfSparkles = 0;
        int numberOfStickers = 0;
        int numberOfTapes = 0;

        while (!correctNumber){
            try{
                System.out.println("Enter number of roses, tulips, violets: ");
                numberOfRoses = in.nextInt();
                numberOfTulips = in.nextInt();
                numberOfViolets = in.nextInt();
                System.out.println("And number of accessory: ");
                numberOfSparkles = in.nextInt();
                numberOfStickers = in.nextInt();
                numberOfTapes = in.nextInt();
                correctNumber = true;
            }
            catch (InputMismatchException exp){
                System.err.println("Wrong symbol!");
                in.nextLine();
            }
        }

        Bouquet bouquet = new Bouquet(numberOfRoses, numberOfTulips, numberOfViolets, numberOfSparkles, numberOfStickers, numberOfTapes);
        System.out.println("Price of bouquet(x" + numberOfRoses + " roses, "
                + "x" + numberOfTulips + " tulips, "
                + "x" + numberOfViolets + " violets, "
                + "x" + numberOfSparkles + " sparkles, "
                + "x" + numberOfStickers + " stickers, "
                + "x" + numberOfTapes + " tapes): "
                + bouquet.getPriceOfBouquet());
        return bouquet;
    }
}
