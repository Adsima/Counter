package calculate.validator;

import static calculate.util.ConsoleUtil.printFormat;
import static calculate.util.MessageConstants.INCORRECT_ELECTRICITY_TEMPLATE;
import static calculate.util.MeterReadingsUtil.getPreviousCounterValue;
import static calculate.util.StringUtil.doubleParseString;
import static calculate.util.link.FileLink.ELECTRICITY_LINK;

public class ElectricityValidator implements Validator {
    @Override
    public boolean validate(String value) {
        return Validator.super.validate(value);
    }

    public boolean isAlpha(String input) {
        String util = getPreviousCounterValue(ELECTRICITY_LINK);
        if(doubleParseString(input) >= doubleParseString(util)) {
            return true;
        } else {
            printFormat(INCORRECT_ELECTRICITY_TEMPLATE, input);
            return false;
        }
    }
}
