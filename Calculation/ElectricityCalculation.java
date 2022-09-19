package calculate.Calculation;

import java.io.IOException;

import static calculate.util.CounterUtil.ELECTRICITY_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.ELECTRICITY_LINK;

public class ElectricityCalculation implements Calculation {
    @Override
    public Double calculationPaymentAmount(Double newCounterValue) throws IOException {
        String value = getPreviousCounterValue(ELECTRICITY_LINK);

        return (newCounterValue - Double.parseDouble(value)) * ELECTRICITY_COEFFICIENT;
    }

}
