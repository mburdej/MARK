package HomeWork3;

    /*
    Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
    разделённых пробелами (2 способа - String и StringBuilder)
 */

    public class Task1 {

        public static final String DELIMITER = " ";

        public static final int LOWER_BOUND = 0;
        public static final int UPPER_BOUND = 1000;

        public static void main(String[] args) {
            String str1 = createUsingStringConcatenation();
            String str2 = createUsingStringBuilder();
            System.out.println("Using String: " + str1);
            System.out.println("Using StringBuilder: " + str2);
        }

        private static String createUsingStringBuilder() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                builder.append(generateRandomNumber(LOWER_BOUND, UPPER_BOUND)).append(DELIMITER);
            }
            return builder.toString();
        }

        private static String createUsingStringConcatenation() {
            String resultString = "";
            for (int i = 0; i < 100; i++) {
                resultString += generateRandomNumber(LOWER_BOUND, UPPER_BOUND) + DELIMITER;
            }
            return resultString;
        }

        public static int generateRandomNumber(int lowerBound, int upperBound) {
            return (int) Math.floor(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
        }
    }

