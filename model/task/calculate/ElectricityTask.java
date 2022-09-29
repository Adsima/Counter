package calculate.model.task.calculate;

import calculate.model.task.CounterTask;

import static calculate.util.CounterUtil.ELECTRICITY_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.ELECTRICITY_LINK;

public class ElectricityTask extends CounterTask {
    public static Double calculation() {
        String value = getPreviousCounterValue(ELECTRICITY_LINK);

        return (getElectricity() - Double.parseDouble(value)) * ELECTRICITY_COEFFICIENT;
    }
}
