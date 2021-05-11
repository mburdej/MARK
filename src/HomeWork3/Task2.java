package HomeWork3;

    /*
    В сформированной в 1-ой задаче строке заменить все двузначные числа на -1.
 */
    public class Task2 {

        public static final String DELIMITER = " ";
        public static final String REPLACEMENT = " -1 ";
        public static final String REGEXP = "(^|[^0-9])[0-9]{2}[^0-9]";

        public static final int LOWER_BOUND = 0;
        public static final int UPPER_BOUND = 1000;

        public static void main(String[] args) {
            String initialString = createUsingStringBuilder();
            String resultString = initialString.replaceAll(REGEXP, REPLACEMENT);
            System.out.println("Изначальная строка: " + initialString);
            System.out.println("Строка с замененными двузначными числами: " + resultString);
        }

        private static String createUsingStringBuilder() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                builder.append(generateRandomNumber(LOWER_BOUND, UPPER_BOUND)).append(DELIMITER);
            }
            return builder.toString();
        }

        public static int generateRandomNumber(int lowerBound, int upperBound) {
            return (int) Math.floor(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
        }
    }
