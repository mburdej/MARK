package HomeWork3;

    /*
    Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
    разделённых пробелами (2 способа - String и StringBuilder)
 */

    public class Task1 {


        public static void main(String[] args) {
            StringCreator stringCreator = new StringCreator();
            String str1 =stringCreator.createUsingStringConcatenation();
            String str2 = stringCreator.createUsingStringBuilder();
            System.out.println("Using String: " + str1);
            System.out.println("Using StringBuilder: " + str2);
        }

    }

