package calculate.Calculation;

import static calculate.util.CounterUtil.ELECTRICITY_COEFFICIENT;

public class ElectricityCalculation implements Calculation {

    @Override
    public Double calculationPaymentAmount(String oldCounterValue, Double newCounterValue) {
        return (Double.parseDouble(oldCounterValue) - newCounterValue) * ELECTRICITY_COEFFICIENT;
    }
}
