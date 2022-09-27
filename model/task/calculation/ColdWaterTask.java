package calculate.model.task.calculation;

import calculate.model.task.CounterTask;

import static calculate.util.CounterUtil.COLD_WATER_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.COLD_WATER_LINK;

public class ColdWaterTask extends CounterTask {

    public Double calculation() {
        String value = getPreviousCounterValue(COLD_WATER_LINK);

        return (getColdWater() - Double.parseDouble(value)) * COLD_WATER_COEFFICIENT;
    }
}
