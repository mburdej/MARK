package HomeWork3;

public class StringCreator {

    private static final String DELIMITER = " ";

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 1000;

    public String createUsingStringBuilder() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(generateRandomNumber(LOWER_BOUND, UPPER_BOUND)).append(DELIMITER);
        }
        return builder.toString();
    }

    public String createUsingStringConcatenation() {
        String resultString = "";
        for (int i = 0; i < 100; i++) {
            resultString += generateRandomNumber(LOWER_BOUND, UPPER_BOUND) + DELIMITER;
        }
        return resultString;
    }

    private int generateRandomNumber(int lowerBound, int upperBound) {
        return (int) Math.floor(Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }
}
