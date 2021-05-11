package HomeWork2;

import java.util.Scanner;

/*
    Задать пользователю любой вопрос и дать ограниченное количество попыток для верного ответа.
    Предусмотреть возможность сдаться.
 */
  public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ответ на главный вопрос жизни, вселенной и всего такого?");
        while (true) {
            System.out.print("Ваш ответ: ");
            String answer = scanner.next();
            if (answer.equals("сдаюсь")) {
                System.out.println("Правильный ответ: 42");
                break;
            }
            if (answer.equals("42")) {
                System.out.println("Верно");
                break;
            }
            if (answer.equals("подсказка")) {
                System.out.println("Сколько получится, если умножить 6 на 7?");
                continue;
            }
            System.out.println(
                    "Введите 'сдаюсь' если не знаете правильный ответ, " +
                            "либо 'подсказка' если хотите помощи, " +
                            "либо просто продолжите игру"
            );
        }
    }
}