package HomeWork3;

/*
    В сформированной в 1-ой задаче строке заменить все двузначные числа на -1.
*/
    public class Task2 {

        public static final String REPLACEMENT = " -1 ";
        public static final String REGEXP = "(^|\\s)[0-9]{2}\\s";


        public static void main(String[] args) {
            StringCreator stringCreator = new StringCreator();
            String initialString = stringCreator.createUsingStringBuilder();
            String resultString = initialString.replaceAll(REGEXP, REPLACEMENT);
            System.out.println("Изначальная строка: " + initialString);
            System.out.println("Строка с замененными двузначными числами: " + resultString);
        }

    }
