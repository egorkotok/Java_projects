package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Выполнить задания из консоли и текстового файла информации, такой как текст, числа
    // и контролировать корректность вводимых данных, а также  контролируя состояние потоков ввода/вывода.
    // При возникновении ошибок, связанных с корректностью выполнения математических операций,
    // генерировать и обрабатывать исключительные ситуации. Предусмотреть обработку исключений,
    // возникающих при нехватке памяти, отсутствии требуемой записи (объекта) в файле, недопустимом значении поля и т. д.

    public static void main(String[] args) {
        //writeStringIntoFileFromConsole();
        //writeIntIntoFileFromConsole();

        //getStringFromFile();

        fromFileToFile();
    }



    private static void writeStringIntoFileFromConsole() {
        Scanner in = new Scanner(System.in);
        FileOutputStream fos;
        String valueToWrite;
        try {
            fos = new FileOutputStream("C:\\Users\\User\\Documents\\Projects\\JavaExceptions\\output.txt");
            System.out.println("Enter string to write into file: ");
            valueToWrite = in.nextLine();
            byte[] bufferValue = valueToWrite.getBytes();
            fos.write(bufferValue, 0, bufferValue.length);
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void writeIntIntoFileFromConsole() {
        Scanner in = new Scanner(System.in);
        FileOutputStream fos;
        int valueToWrite;
        try {
            fos = new FileOutputStream("C:\\Users\\User\\Documents\\Projects\\JavaExceptions\\output.txt");
            System.out.println("Enter int to write into file: ");
            valueToWrite = in.nextInt();
            byte[] bufferValue = String.valueOf(valueToWrite).getBytes();
            fos.write(bufferValue, 0, bufferValue.length);
            fos.close();
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.err.println(e);
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void getStringFromFile() {
        Scanner in = new Scanner(System.in);
        FileInputStream fis;
        try {
            fis = new FileInputStream("C:\\Users\\User\\Documents\\Projects\\JavaExceptions\\input.txt");
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            String valueToRead = new String(buffer, "UTF-8");
            System.out.println("Text from file: " + valueToRead);
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    private static void fromFileToFile() {
        FileInputStream  fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream("C:\\Users\\User\\Documents\\Projects\\JavaExceptions\\input.txt");
            fos = new FileOutputStream("C:\\Users\\User\\Documents\\Projects\\JavaExceptions\\output.txt");
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
