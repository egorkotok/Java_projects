package com.company;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;

import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*/1. Определить принадлежность некоторого значения k интервалам (n, m], [n, m), (n, m), [n, m].
        Scanner in = new Scanner(System.in);
        System.out.println("Enter interval(from n to m): ");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Enter number: ");
        int number = in.nextInt();
        if (number < n || number > m)
            System.out.println("Dont belong");
        else if (number == n)
            System.out.print("Number belong [n, m), [n, m]");
        else if (number == m)
            System.out.print("Number belong (n, m], [n, m]");
        else
            System.out.println("Number belong (n, m], [n, m), (n, m), [n, m]");*/


        /*/2. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter matrix size(N x N): ");
        int sizeOfMatrix = in.nextInt();
        int matrix[][] = new int[sizeOfMatrix][sizeOfMatrix];
        System.out.println("Enter amount of numbers(k): ");
        int amountOfNumbers = in.nextInt();
        int currentValue = 1;

        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                if (currentValue <= amountOfNumbers) {
                    matrix[i][j] = currentValue;
                    currentValue++;
                }
            }
        }

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }*/

        /*/3. Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter parameters: a, b, c");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.println("Result: " + a + "*x^2 + " + b + "*x + " + c + " = 0");

        double discr = b * b - 4 * a * c;
        if (discr > 0) {
            double firstX = (-b - Math.sqrt(discr)) / (2 * a);
            double secondX = (-b + Math.sqrt(discr)) / (2 * a);
            System.out.println("First value of x: " + firstX + "; Second value of x: " + secondX);
        }
        else if (discr == 0) {
            double firstX = (-b) / (2 * a);
            System.out.println("Value of x: " + firstX);
        }
        else System.out.println("X not found");
        */

        //4. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
        Scanner in = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Enter number of month: ");


        while (in.hasNext()){
            try{
                int numberOfMonth = in.nextInt();
                if (numberOfMonth < 1 || numberOfMonth > 12){
                    throw new WrongNumberArgsException("Wrong number");
                }
                else {
                    System.out.println("Month is: " + month[numberOfMonth-1]);
                    break;
                }
            }
            catch (FormatterClosedException exp) {
                System.out.println(exp);
                break;
            }
            catch (NoSuchElementException exp) {
                System.err.println("Invalid input! Try again:");
                in.nextLine();
            }
            catch (WrongNumberArgsException exp){
                System.err.println("Wrong number! Try again:");
                in.nextLine();
            }
        }






    }
}
