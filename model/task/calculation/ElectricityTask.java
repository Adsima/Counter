package calculate.model.task.calculation;

import calculate.model.task.Task;

import static calculate.util.CounterUtil.ELECTRICITY_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.ELECTRICITY_LINK;

public class ElectricityTask extends Task {
    @Override
    public Double calculation() {
        String value = getPreviousCounterValue(ELECTRICITY_LINK);

        return (getElectricity() - Double.parseDouble(value)) * ELECTRICITY_COEFFICIENT;
    }
}
