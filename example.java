package calculate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static calculate.util.link.FileLink.ELECTRICITY_LINK;
import static calculate.util.MessageConstants.PAYMENT_FOR_ELECTRICITY;
import static calculate.util.MessageConstants.VALUE_ELECTRICITY_COUNTER;

public class example {
    public static void main(String[] args) throws Exception {
        printInfo();
    }

    public static String getPreviousCounterValue(String string) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(string))) {
            String line = br.readLine();
            if (line != null) {
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Double calculation(String previousCounterValue) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(VALUE_ELECTRICITY_COUNTER);
            Double newValue = scanner.nextDouble();
        } catch (Exception e) {
            System.err.println(new Exception("Неккоретное введенное значение"));
        }
        return 1.0;
    }

    public static void printInfo() throws Exception {
        System.out.println(PAYMENT_FOR_ELECTRICITY + "=" + calculation(getPreviousCounterValue(ELECTRICITY_LINK)));
    }
}
