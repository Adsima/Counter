package calculate.Calculation;

import static calculate.util.CounterUtil.COLD_WATER_COEFFICIENT;

public class ColdWaterCalculation implements Calculation {

    @Override
    public Double calculationPaymentAmount(String oldCounterValue, Double newCounterValue) {
        return (Double.parseDouble(oldCounterValue) - newCounterValue) * COLD_WATER_COEFFICIENT;
    }
}
