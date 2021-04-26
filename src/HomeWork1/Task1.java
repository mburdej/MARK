package HomeWork1;

import java.util.Random;
/*
Задано целое число. Определить, какой день недели соответствует заданному числу и вывести в консоль.
Если ни одному - вывести соответствующее сообщение.
 */

public class Task1 {
    public static void main(String[] args) {

        int day = new Random().nextInt(9);
        System.out.println(day);

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Fall");
                break;

        }
    }
}
