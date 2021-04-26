package HomeWork1;

import java.util.Scanner;

/*Даны два целых числа, задающие три диапазона чисел.
Определить, какому диапазону принадлежит введенное пользователем число.
 */

public class Task2 {

    public static void main(String[] args) {
        int k = 5, j = 10;

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


    }

    private static void secondWay(int k, int j, int input) {
        String result = input <= k ? "first" : (input < j ? "second" : "third");
        System.out.println(result);
    }

    private static void Firstway(int k, int j, int input) {
        if (input <= k) {
            System.out.println("first");
        } else if (input < j) {
            System.out.println("second");
        } else {
            System.out.println("third");
        }
    }

}
