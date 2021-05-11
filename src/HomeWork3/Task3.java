package HomeWork3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    /*
        Пользователь вводит имя и возраст. Вывести сообщение,
        приветствующее пользователя, выводя текущую дату и время.
        - форматирование (String.format) через спецификаторы
     */
    public class Task3 {

        private static final String GREETING_MESSAGE_TEMPLATE = "Привет %s. Твой возраст %d. Текущие дата и время: %s";

        private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = scanner.next();
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();
            System.out.println(createFormattedGreetingMessage(name, age));
        }

        private static String createFormattedGreetingMessage(String name, int age) {
            String formattedLocalDateTime = LocalDateTime.now().format(DATE_TIME_FORMATTER);
            return String.format(GREETING_MESSAGE_TEMPLATE, name, age, formattedLocalDateTime);
        }
    }
