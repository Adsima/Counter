package calculate.model.task.calculate;

import calculate.model.task.MeterReadingsTask;

import static calculate.util.MeterReadingsUtil.ELECTRICITY_COEFFICIENT;
import static calculate.util.MeterReadingsUtil.getPreviousCounterValue;
import static calculate.util.link.FileLink.ELECTRICITY_LINK;

public class ElectricityTask extends MeterReadingsTask {
    public static Double calculation() {
        String value = getPreviousCounterValue(ELECTRICITY_LINK);

        return (getElectricity() - Double.parseDouble(value)) * ELECTRICITY_COEFFICIENT;
    }
}
