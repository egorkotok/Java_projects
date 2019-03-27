package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*/1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");
        int lowestNumber = 0;
        int highestNumber = 0;
        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
            if (i == 0){
                lowestNumber = highestNumber = arrayOfNumbers[0];
            }
            if (String.valueOf(arrayOfNumbers[i]).length() > String.valueOf(highestNumber).length()){
                highestNumber = arrayOfNumbers[i];
            }
            if (String.valueOf(arrayOfNumbers[i]).length() < String.valueOf(lowestNumber).length()) {
                lowestNumber = arrayOfNumbers[i];
            }
        }

        if (countOfNumbers != 0) {
            System.out.println("Highest number: " + highestNumber + "; Length of highest number: "  + String.valueOf(biggestNumber).length());
            System.out.println("Lowest number: " + lowestNumber + "; Length of lowest number: "  + String.valueOf(lowestNumber).length());
        }*/

        /*/2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
        }

        for (int i = 0; i < countOfNumbers; i++) {
            for (int j = i; j <countOfNumbers; j++) {
                if (String.valueOf(arrayOfNumbers[i]).length()<String.valueOf(arrayOfNumbers[j]).length()){
                    int temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = temp;
                }
            }
        }

        System.out.print("Sort desc:");
        for (int i = 0; i < countOfNumbers; i++){
            System.out.print(" " + arrayOfNumbers[i]);;
        }

        System.out.print("\nSort inc:");
        for (int i = countOfNumbers - 1 ; i >= 0; i--){
            System.out.print(" " + arrayOfNumbers[i]);;
        }*/


        /*/3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");
        int averageLenght = 0;
        int lengthOfAllnumbers = 0;

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
            lengthOfAllnumbers = lengthOfAllnumbers + String.valueOf(arrayOfNumbers[i]).length();
        }

        averageLenght = Math.round((float)lengthOfAllnumbers/(float)countOfNumbers);

        System.out.println("Length lower than average(" + averageLenght + "): ");
        for(int i = 0; i<countOfNumbers; i++){
            if (String.valueOf(arrayOfNumbers[i]).length()<averageLenght){
                System.out.print("Number: " + arrayOfNumbers[i] + "; Length: " + String.valueOf(arrayOfNumbers[i]).length() + "\n");
            }
        }

        System.out.println("Length highter than average(" + averageLength + "): ");
        for(int i = 0; i<countOfNumbers; i++){
            if (String.valueOf(arrayOfNumbers[i]).length()>averageLength){
                System.out.print("Number: " + arrayOfNumbers[i] + "; Length: " + String.valueOf(arrayOfNumbers[i]).length() + "\n");
            }
        }*/

        /*/4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
        }

        int uniqValue = 0;
        int minUniqNumbers = 555;

        for (int i = 0; i < countOfNumbers; i++){
            char[] strChars = (String.valueOf(arrayOfNumbers[i])).toCharArray();
            String uniq = "";
            for (int j = 0; j<String.valueOf(arrayOfNumbers[i]).length(); j++){
                if (uniq.indexOf(strChars[j]) == -1) {
                    uniq = uniq + strChars[j];
                }
            }
            if (uniq.length() < minUniqNumbers) {
                minUniqNumbers = uniq.length();
                uniqValue = arrayOfNumbers[i];
            }
        }

        if (uniqValue != 0){
            System.out.println("Value with min uniq numbers: " + uniqValue);
        }*/



        /*/5. Найти количество чисел, содержащих только четные цифры, а среди них — количество чисел с равным числом четных и нечетных цифр.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
        }

        int[] arrOfEvenNumbers = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++){
            boolean isEven = true;
            char[] word = (String.valueOf(arrayOfNumbers[i])).toCharArray();
            for (int j = 0; j < word.length; j++){
                if ((int)word[j] % 2 == 1) {
                    isEven = false;
                }
            }
            if (isEven == true){
                arrOfEvenNumbers[i] = arrayOfNumbers[i];
            }
        }

        int countOfEvenNumbers = 0;
        for (int i = 0; i < countOfNumbers; i++){
            if (arrOfEvenNumbers[i] != 0 ){
                countOfEvenNumbers++;
            }
        }

        System.out.println("Count of numbers: " + countOfEvenNumbers);
        */

        /*/6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
        }

        int incNumber = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++){
            boolean isFound = true;
            char[] word = (String.valueOf(arrayOfNumbers[i])).toCharArray();
            for (int j = 0; j < word.length-1; j++){
                if (word[j]>word[j+1]) {
                    isFound = false;
                }
            }

            if (isFound == true) {
                incNumber = arrayOfNumbers[i];
                break;
            }
        }
        if (incNumber != 0){
            System.out.println("Value with inc numbers: " + incNumber);
            }
        */


        /*/7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
        }

        int uniqNumber = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++){
            boolean isFound = true;
            char[] word = (String.valueOf(arrayOfNumbers[i])).toCharArray();
            for (int j = 0; j < word.length-1; j++){
                for (int k = j+1; k < word.length; k++){
                    if (word[j] == word[k]){
                        isFound = false;
                    }
                }
            }
            if (isFound == true) {
                uniqNumber = arrayOfNumbers[i];
                break;
            }
        }

        if (uniqNumber != 0){
            System.out.println("Uniq value: " + uniqNumber);
        }
        */

        //8. Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int countOfNumbers = in.nextInt();
        int[] arrayOfNumbers = new int[countOfNumbers];
        System.out.println("Enter " + countOfNumbers + " numbers");

        for (int i = 0; i < countOfNumbers; i++){
            arrayOfNumbers[i] = in.nextInt();
        }

        int[] arrOfPalindroms = new int[countOfNumbers];

        for (int i = 0; i < arrayOfNumbers.length; i++){
            boolean isFound = true;
            char[] word = (String.valueOf(arrayOfNumbers[i])).toCharArray();
            for (int j = 0; j < word.length/2; j++){
                if (word[j] != word[word.length-1-j]){
                    isFound = false;
                }
            }
            if (isFound == true) {
                arrOfPalindroms[i] = arrayOfNumbers[i];
            }
        }
        System.out.println("Palendroms: ");
        for (int i = 0; i < countOfNumbers; i++){
            if (arrOfPalindroms[i] != 0) {
                System.out.println(arrOfPalindroms[i]);
            }
        }


    }
}
