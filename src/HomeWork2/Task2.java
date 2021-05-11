package HomeWork2;
import java.util.Scanner;

/*
    Пользователь вводит месяц и день (числа).
    Вывести, есть ли такой день в этом месяце.
 */
 public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите месяц: ");
        int monthIndex = scanner.nextInt();

        System.out.print("Введите день: ");
        int dayIndex = scanner.nextInt();

        boolean present = false;
        if (monthIndex == 1 || monthIndex == 3 || monthIndex == 5 || monthIndex == 7 ||
                monthIndex == 8 || monthIndex == 10 || monthIndex == 12) {
            if (between(dayIndex, 1, 31))
                present = true;
        } else if (monthIndex == 4 || monthIndex == 6 || monthIndex == 9 || monthIndex == 11) {
            if (between(dayIndex, 1, 30))
                present = true;
        } else if (monthIndex == 2) {
            if (between(dayIndex, 1, 29))
                present = true;
        }

        System.out.println(present ? "Есть" : "Нет");
    }

    public static boolean between(int val, int min, int max) {
        return val >= min && val <= max;
    }
}
