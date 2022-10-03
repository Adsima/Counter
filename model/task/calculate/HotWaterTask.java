package calculate.model.task.calculate;

import calculate.model.task.MeterReadingsTask;

import static calculate.util.MeterReadingsUtil.HOT_WATER_COEFFICIENT;
import static calculate.util.MeterReadingsUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.HOT_WATER_LINK;

public class HotWaterTask extends MeterReadingsTask {
    public static Double calculation() {
        String value = getPreviousCounterValue(HOT_WATER_LINK);

        return (getHotWater() - Double.parseDouble(value)) * HOT_WATER_COEFFICIENT;
    }
}
