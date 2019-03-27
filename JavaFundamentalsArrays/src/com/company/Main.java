package com.company;

import java.util.Scanner;

public class Main {
    //Ввести с консоли n-размерность матрицы a [n] [n].
    //Задать значения элементов матрицы в интервале значений от -n до n с помощью генератора случайных чисел.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int sizeOfMatrix = in.nextInt();
        int[][] matrix = createMatrix(sizeOfMatrix);
        printMatrix(matrix, sizeOfMatrix);

        //1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
        /*System.out.println("Enter value for sorting line / column");
        int valueForSort = in.nextInt();
        System.out.println("Sorting of k-line:");
        matrix = sortOfLine(matrix, sizeOfMatrix, valueForSort-1);
        printMatrix(matrix, sizeOfMatrix);
        System.out.println("Sorting of k-column:");
        matrix = sortOfColumn(matrix, sizeOfMatrix, valueForSort-1);
        printMatrix(matrix, sizeOfMatrix);*/

        //2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
        /*System.out.println("Enter value for shift");
        int shiftValue = in.nextInt();

        //matrix = rightShift(matrix, sizeOfMatrix, shiftValue);
        //System.out.println("Shift to right: ");
        //printMatrix(matrix, sizeOfMatrix);

        //matrix = leftShift(matrix, sizeOfMatrix, shiftValue);
        //System.out.println("Shift to left: ");
        //printMatrix(matrix, sizeOfMatrix);

        //matrix = upShift(matrix, sizeOfMatrix, shiftValue);
        //System.out.println("Shift to up: ");
        //printMatrix(matrix, sizeOfMatrix);

        matrix = downShift(matrix, sizeOfMatrix, shiftValue);
        System.out.println("Shift to down: ");
        printMatrix(matrix, sizeOfMatrix);
        */


        //3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
        //increaseElements(matrix, sizeOfMatrix);
        //decreaseElements(matrix, sizeOfMatrix);


        //4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
        //sumOfStrings(matrix, sizeOfMatrix);



        //5. Перестроить матрицу, переставляя в ней строки так, чтобы сумма элементов в строках полученной матрицы возрастала.
        /*
        matrix = rebuildMatrix(matrix, sizeOfMatrix);
        System.out.println("Increased matrix: ");
        printMatrix(matrix, sizeOfMatrix);
        */

        //6. Найти максимальный элемент (ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие
        /*
        int maxElement = searchMaxElement(matrix, sizeOfMatrix);
        matrix = deleteStringsAndColumnsWithMaxElement(matrix, sizeOfMatrix, maxElement);
        System.out.println("Delete " + maxElement + " from matrix:");
        printMatrix(matrix, sizeOfMatrix);
        */

    }

    public static int[][] createMatrix(int sizeOfMatrix){
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++){
            for(int j = 0; j < sizeOfMatrix; j++){
                //matrix[i][j] = (int)(Math.random()*(sizeOfMatrix*2+1)) - sizeOfMatrix;
                matrix[i][j] = (int)(Math.random()*7)+1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, int sizeOfMatrix){
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        return;
    }

    public static int[][] sortOfLine(int[][] matrix, int sizeOfMatrix, int valueForSort){
        for (int i = 0; i < sizeOfMatrix-1; i++){
            for (int j = i+1; j < sizeOfMatrix; j++){
                if (matrix[valueForSort][i] > matrix[valueForSort][j]){
                    int tempValue = matrix[valueForSort][j];
                    matrix[valueForSort][j] = matrix[valueForSort][i];
                    matrix[valueForSort][i] = tempValue;
                }
            }
        }
        return matrix;
    }

    public static int[][] sortOfColumn(int[][] matrix, int sizeOfMatrix, int valueForSort){
        for (int i = 0; i < sizeOfMatrix-1; i++){
            for (int j = i+1; j < sizeOfMatrix; j++){
                if (matrix[i][valueForSort] > matrix[j][valueForSort]){
                    int tempValue = matrix[i][valueForSort];
                    matrix[i][valueForSort] = matrix[j][valueForSort];
                    matrix[j][valueForSort] = tempValue;
                }
            }
        }
        return matrix;
    }

    public static int[][] rightShift(int[][] matrix, int sizeOfMatrix, int shiftValue){
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = sizeOfMatrix-1; j >= 0; j--){
                if (j-shiftValue < sizeOfMatrix && j-shiftValue >= 0){
                    matrix[i][j] = matrix[i][j-shiftValue];
                }
            }
        }
        return matrix;
    }

    public static int[][] leftShift(int[][] matrix, int sizeOfMatrix, int shiftValue) {
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                if (j+shiftValue < sizeOfMatrix && j+shiftValue >= 0){
                    matrix[i][j] = matrix[i][j+shiftValue];
                }
            }
        }
        return matrix;
    }

    public static int[][] upShift(int[][] matrix, int sizeOfMatrix, int shiftValue) {
        for (int j = 0; j < sizeOfMatrix; j++){
            for (int i = 0; i < sizeOfMatrix; i++){
                if (i+shiftValue < sizeOfMatrix && i+shiftValue >= 0){
                    matrix[i][j] = matrix[i+shiftValue][j];
                }
            }
        }
        return matrix;
    }

    public static int[][] downShift(int[][] matrix, int sizeOfMatrix, int shiftValue) {
        for (int j = 0; j < sizeOfMatrix; j++){
            for (int i = sizeOfMatrix-1; i >= 0; i--){
                if (i-shiftValue < sizeOfMatrix && i-shiftValue >= 0){
                    matrix[i][j] = matrix[i-shiftValue][j];
                }
            }
        }
        return matrix;
    }

    public static void increaseElements(int[][] matrix, int sizeOfMatrix){
        int[] arrayOfElements = new int[sizeOfMatrix*sizeOfMatrix];
        int k = 0;
        int startElement = 0;
        int increaseLength = 0;
        int maxIncreaseLength = 0;
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                arrayOfElements[k] = matrix[i][j];
                k++;
            }
        }

        for (int i = 0; i < arrayOfElements.length-1; i++) {
            if (arrayOfElements[i] <= arrayOfElements[i+1]){
                increaseLength++;
            }
            else if (increaseLength > maxIncreaseLength){
                maxIncreaseLength = increaseLength;
                startElement = i - increaseLength;
                increaseLength = 0;
            }
            else increaseLength = 0;
        }

        System.out.println("Increase elements: ");
        for(int i = startElement; i <= startElement + maxIncreaseLength; i++){
            System.out.print(arrayOfElements[i] + " ");
        }
    }

    public static void decreaseElements(int[][] matrix, int sizeOfMatrix){
        int[] arrayOfElements = new int[sizeOfMatrix*sizeOfMatrix];
        int k = 0;
        int startElement = 0;
        int decreaseLength = 0;
        int maxDecreaseLength = 0;
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                arrayOfElements[k] = matrix[i][j];
                k++;
            }
        }

        for (int i = 0; i < arrayOfElements.length-1; i++) {
            if (arrayOfElements[i] >= arrayOfElements[i+1]){
                decreaseLength++;
            }
            else if (decreaseLength > maxDecreaseLength){
                maxDecreaseLength = decreaseLength;
                startElement = i - decreaseLength;
                decreaseLength = 0;
            }
            else decreaseLength = 0;
        }

        System.out.println("\nDecrease elements: ");
        for(int i = startElement; i <= startElement + maxDecreaseLength; i++){
            System.out.print(arrayOfElements[i] + " ");
        }
    }

    public static void sumOfStrings(int[][] matrix, int sizeOfMatrix) {
        int[] sumOfElements = new int[sizeOfMatrix];
        int startElement = 0;
        int endElement = 0;
        for (int i = 0; i < sizeOfMatrix; i++){
            startElement = 0;
            endElement = 0;
            boolean hasEvenNumbers = false;
            int j = 0;
            while (matrix[i][j] % 2 == 1 && j < sizeOfMatrix-1){
                j++;
            }
            if (matrix[i][j] % 2 == 0){
                startElement = j;
                j++;
            }
            while (matrix[i][j] % 2 == 1 && j < sizeOfMatrix-1){
                j++;
            }
            if (matrix[i][j] % 2 == 0){
                endElement = j;
                hasEvenNumbers = true;
            }
            if (hasEvenNumbers){
                for (int k = startElement; k <= endElement; k++){
                    sumOfElements[i] = sumOfElements[i] + matrix[i][k];
                }
            }
        }

        for (int i = 0; i < sizeOfMatrix; i++) {
            System.out.println("Sum of " + (i+1) + " line between first even numbers: " + sumOfElements[i]);
        }
    }

    public static int[][] rebuildMatrix(int[][] matrix, int sizeOfMatrix) {
        int[] sumOfStrings = new int[sizeOfMatrix];
        int[] tempArray = new int[sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                sumOfStrings[i] = sumOfStrings[i] + matrix[i][j];
            }
        }

        for (int i = 0; i < sizeOfMatrix - 1; i++){
            for (int j = i + 1; j < sizeOfMatrix; j++){
                if (sumOfStrings[i] > sumOfStrings[j]){
                    tempArray = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = tempArray;
                    int tempValue = sumOfStrings[i];
                    sumOfStrings[i] = sumOfStrings[j];
                    sumOfStrings[j] = tempValue;
                }
            }
        }
        return matrix;
    }

    private static int searchMaxElement(int[][] matrix, int sizeOfMatrix) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                if (matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public static int[][] deleteStringsAndColumnsWithMaxElement(int[][] matrix, int sizeOfMatrix, int maxElement){
        for (int i = 0; i < sizeOfMatrix; i++){
            for (int j = 0; j < sizeOfMatrix; j++){
                if (matrix[i][j] == maxElement){
                    for (int k = 0; k < sizeOfMatrix; k++){
                        matrix[i][k] = 0;
                    }
                    for (int k = 0; k < sizeOfMatrix; k++){
                        matrix[k][j] = 0;
                    }
                }
            }
        }
        return matrix;
    }

}
