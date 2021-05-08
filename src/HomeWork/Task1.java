package HomeWork;
import java.util.Scanner;
/*Вывести пирамиду из цифр. Размер вводится пользователем. Пирамида - фигура такого вида:*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер пирамиды: ");
        int size = scanner.nextInt();
        int[][] pyramid = constructPyramid(size);
        printPyramid(size, pyramid);
    }
    private static int[][] constructPyramid(int size) {
        int[][] pyramid = new int[size][size];
        for (int k = 0; k < Math.ceil(size / 2.0); k++) {
            for (int i = k; i < size - k; i++) {
                for (int j = k; j < size - k; j++) {
                    pyramid[i][j] = k + 1;
                }
            }
        }
        return pyramid;
    }
    private static void printPyramid(int size, int[][] pyramid) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pyramid[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}