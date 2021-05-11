package HomeWork3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова.
  - через split - будет считать разделителем пробел
*/
    public class Task4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            String[] words = input.split("\\s");
            Map<String, Integer> wordCounterMap = countWords(words);
            System.out.println(wordCounterMap);
        }

        private static Map<String, Integer> countWords(String[] words) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                Integer count = map.getOrDefault(word, 0);
                map.put(word, ++count);
            }
            return map;
        }
    }
