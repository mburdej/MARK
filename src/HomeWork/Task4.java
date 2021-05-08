package HomeWork;
/*Пользователь вводит число в небольшом диапазоне (от 0 до 100).
 Программа должна угадать, что это за число и продемонстрировать количество попыток, которое потребовалось для угадывания.*/
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
            int userInput, attempts = 0;
            int requiredNumber = (int) (Math.random() * 100);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Угадайте число в диапазоне от 0 до 100");
            do {
                attempts++;
                System.out.print("Ввод: ");
                userInput = scanner.nextInt();
                if (userInput > requiredNumber)
                    System.out.println("Введенное число больше искомого");
                else if (userInput < requiredNumber)
                    System.out.println("Введенное число меньше искомого");
                else
                    System.out.println("Верно");
            } while (userInput != requiredNumber);
            System.out.println("Количество попыток: " + attempts);
        }
    }


