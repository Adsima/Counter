package calculate.Calculation;

import java.io.IOException;

import static calculate.util.CounterUtil.COLD_WATER_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.COLD_WATER_LINK;

public class ColdWaterCalculation implements Calculation {
    @Override
    public Double calculationPaymentAmount(Double newCounterValue) throws IOException {
        String value = getPreviousCounterValue(COLD_WATER_LINK);

        return (newCounterValue - Double.parseDouble(value)) * COLD_WATER_COEFFICIENT;
    }
}
