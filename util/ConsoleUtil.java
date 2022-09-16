package calculate.util;

public final class ConsoleUtil {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void printFormat(String template, Double... value) {
        System.out.println(String.format(template, value));
    }
}
