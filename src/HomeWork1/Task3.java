package HomeWork1;

import java.util.Scanner;
/*
Заданы три числа. Найти среди них минимальное, максимальное и среднее арифметическое и вывести.
Без использования дополнительных библиотек, только операторы сравнения и логические.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt(), j = scanner.nextInt(), k = scanner.nextInt();
        int min, max;

        min = findMin(i, j, k);
        System.out.println("Min: " + min);

        max = findMax(i, j, k);
        System.out.println("Max: " + max);

        int avg = findAverage(i, j, k);
        System.out.println("Avg: " + avg);
    }

    private static int findAverage(int i, int j, int k) {
        return (i + j + k) / 3;
    }

    private static int findMin(int i, int j, int k) {
        int min = i;
        if (j < min) {
            min = j;
        }
        if (k < min) {
            min = k;
        }
        return min;
    }

    private static int findMax(int i, int j, int k) {
        int max = i;
        if (j > max) {
            max = j;
        }
        if (k > max) {
            max = k;
        }
        return max;
    }
    }
