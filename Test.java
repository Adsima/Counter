package calculate;

public class Test {
    static Integer num = 1;
    public static final String INFO = "Info - %s";
    public static void main(String[] args) {
        printFormat(INFO, num);
    }

    private static void printFormat(String str, Object... template) {
        System.out.println(String.format(str, template));
    }
}
