package calculate.model.task.calculation;

import calculate.model.task.Task;

import static calculate.util.CounterUtil.HOT_WATER_COEFFICIENT;
import static calculate.util.CounterUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.HOT_WATER_LINK;

public class HotWaterTask extends Task {
    @Override
    public Double calculation() {
        String value = getPreviousCounterValue(HOT_WATER_LINK);

        return (getHotWater() - Double.parseDouble(value)) * HOT_WATER_COEFFICIENT;
    }
}
