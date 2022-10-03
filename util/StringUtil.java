package calculate.util;

import static calculate.util.MessageConstants.INCORRECT_TEMPLATE;

public class StringUtil {
    public static Double doubleParseString(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(INCORRECT_TEMPLATE);
        }
    }
}
