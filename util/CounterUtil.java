package calculate.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public final class CounterUtil {
    public static final Double HOT_WATER_COEFFICIENT = 206.16;
    public static final Double COLD_WATER_COEFFICIENT = 59.93;
    public static final Double ELECTRICITY_COEFFICIENT = 2.58;

    public static String getPreviousCounterValue(String string) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(string))) {
            String str = bufferedReader.readLine();
            if (str != null) {
                return str;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printPaymentCounters(Double amount) {
        System.out.println(amount);
    }

}
