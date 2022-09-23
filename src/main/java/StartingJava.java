import java.util.Random;

public class StartingJava {
    public static void main(String[] args) {

        int valueFirst = new Random().nextInt(100);
        int valueSecond = new Random().nextInt(100);
        double doubleValue = new Random().nextDouble();

        //????????????? ?????????????? ??????????
        System.out.println(valueFirst + valueSecond);
        System.out.println(valueFirst * doubleValue);
        System.out.println(doubleValue / valueSecond);

        //?????????????? ?????????? ??? ??????????
        byte byteValue1 = 125;
        byte byteValue2 = 10;
        System.out.println((byte) (byteValue2 + byteValue1));

        String text = "";
        for (int i = 0; i < 5; i++) {
            int valueForChar = new Random().nextInt(1000);
            char charValue = (char) valueForChar;
            text += charValue;
        }
        System.out.println(text);
        if (text.length() == 5) {
            System.out.println("String length is 5!");
        } else {
            System.out.println("String length is not 5!");
        }

    }
}
