package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*/1. Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");*/

        /*/2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        Scanner in = new Scanner(System.in);
        String[] arrayOfArguments = new String[5];
        System.out.println("Enter 5 args:");
        for (int i = 0; i < arrayOfArguments.length; i++){
            arrayOfArguments[i] = in.nextLine();
        }
        for (int i = arrayOfArguments.length - 1; i >= 0; i--){
            System.out.println(arrayOfArguments[i]);
        }*/

        /*/3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        for (int i = 0; i < 5; i++)
            System.out.println((int)(Math.random() * 10));
        for (int i = 0; i < 5; i++) {
            System.out.print((int)(Math.random() * 10));
        }*/

        /*/4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        final String PASSWORD = "pass";
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter password:");
        String myPassword = in.nextLine();
        if (!myPassword.equals(PASSWORD)) {
            System.out.println("Wrong password");
        } else System.out.println("You are welcome!");
        */

        /*/5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        int sumOfNumbers = 0;
        int multiplyingOfNumbers = 1;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < numbers.length; i++){
            sumOfNumbers = sumOfNumbers + numbers[i];
            multiplyingOfNumbers = multiplyingOfNumbers * numbers[i];
        }

        System.out.println("Sum is: " + sumOfNumbers);
        System.out.println("Multiplying is: " + multiplyingOfNumbers);*/


        /*/6. Вывести фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания.
        Path path = Paths.get("C:\\Users\\User\\Documents\\Projects\\Tasks\\src\\com\\company");
        BasicFileAttributes attr;
        try {
            attr = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Creation date: " + attr.creationTime());
            System.out.println("Last access date: " + attr.lastAccessTime());
            System.out.println("Last modified date: " + attr.lastModifiedTime());
        } catch (IOException e) {
            System.out.println("oops error! " + e.getMessage());
        }*/




    }
}