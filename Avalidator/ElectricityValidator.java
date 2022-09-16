package calculate.Avalidator;

import static calculate.util.ConsoleUtil.printFormat;
import static calculate.util.MessageConstants.INCORRECT_VALUE_TEMPLATE;

public class ElectricityValidator implements Validator {
    @Override
    public boolean validate(Double input) {
            printFormat(INCORRECT_VALUE_TEMPLATE, input);
            return false;
    }
}
