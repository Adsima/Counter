package calculate.model.info;

import static calculate.util.ConsoleUtil.printFormat;
import static calculate.util.MessageConstants.*;

public class MeterReadingInfo {
    private static Double coldWaterValue;
    private static Double hotWaterValue;
    private static Double electricityValue;

    public void printPayAmount() {
        printFormat(PAYMENT_TOTAL, calculateTotalAmount());
    }

    private Double calculateTotalAmount() {
        return getColdWaterValue() +
                getHotWaterValue() +
                getElectricityValue();
    }

    public Double getColdWaterValue() {
        return coldWaterValue;
    }

    public static void setColdWaterValue(Double coldWaterValue) {
        MeterReadingInfo.coldWaterValue = coldWaterValue;
    }

    public Double getHotWaterValue() {
        return hotWaterValue;
    }

    public static void setHotWaterValue(Double hotWaterValue) {
        MeterReadingInfo.hotWaterValue = hotWaterValue;
    }

    public Double getElectricityValue() {
        return electricityValue;
    }

    public static void setElectricityValue(Double electricityValue) {
        MeterReadingInfo.electricityValue = electricityValue;
    }
}
