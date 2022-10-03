package calculate.model.task.calculate;

import calculate.model.task.MeterReadingsTask;

import static calculate.util.MeterReadingsUtil.COLD_WATER_COEFFICIENT;
import static calculate.util.MeterReadingsUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.COLD_WATER_LINK;

public class ColdWaterTask extends MeterReadingsTask {

    public static Double calculation() {
            String value = getPreviousCounterValue(COLD_WATER_LINK);

        return (getColdWater() - Double.parseDouble(value)) * COLD_WATER_COEFFICIENT;
    }
}
