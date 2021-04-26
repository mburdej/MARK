package HomeWork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input pivot value: ");
        int pivot = scanner.nextInt();
        double offset = pivot / 10.0;

        System.out.print("Input number: ");
        int input = scanner.nextInt();
        if (numberFitsIntoLimit(pivot, offset, input)) {
            System.out.println("Input fits in 10% limit");
        } else {
            System.out.println("Input doesn't fit");
        }
    }

    private static boolean numberFitsIntoLimit(int pivot, double offset, int input) {
        return input >= pivot - offset && input <= pivot + offset;
    }
}
