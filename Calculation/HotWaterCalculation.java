package calculate.Calculation;

import java.io.IOException;

import static calculate.util.CounterUtil.HOT_WATER_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.HOT_WATER_LINK;

public class HotWaterCalculation implements Calculation {
    @Override
    public Double calculationPaymentAmount(Double newCounterValue) throws IOException {
        String value = getPreviousCounterValue(HOT_WATER_LINK);

        return (newCounterValue - Double.parseDouble(value)) * HOT_WATER_COEFFICIENT;
    }
}
