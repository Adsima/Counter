package calculate.Calculation;

import static calculate.util.CounterUtil.HOT_WATER_COEFFICIENT;

public class HotWaterCalculation implements Calculation {

    @Override
    public Double calculationPaymentAmount(String oldCounterValue, Double newCounterValue) {
        return (Double.parseDouble(oldCounterValue) - newCounterValue) * HOT_WATER_COEFFICIENT;
    }
}
