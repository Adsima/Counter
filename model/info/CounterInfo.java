package calculate.model.info;

import static calculate.util.ConsoleUtil.printFormat;
import static calculate.util.MessageConstants.PAYMENT_TOTAL;

public class CounterInfo {
    private static Double coldWaterValue;
    private static Double hotWaterValue;
    private static Double electricityValue;

    public void payAmount() {
        printFormat(PAYMENT_TOTAL, totalAmount());
    }

    private Double totalAmount() {
        return getColdWaterValue() +
                getHotWaterValue() +
                getElectricityValue();
    }

    public Double getColdWaterValue() {
        return coldWaterValue;
    }

    public static void setColdWaterValue(Double coldWaterValue) {
        CounterInfo.coldWaterValue = coldWaterValue;
    }

    public Double getHotWaterValue() {
        return hotWaterValue;
    }

    public static void setHotWaterValue(Double hotWaterValue) {
        CounterInfo.hotWaterValue = hotWaterValue;
    }

    public Double getElectricityValue() {
        return electricityValue;
    }

    public static void setElectricityValue(Double electricityValue) {
        CounterInfo.electricityValue = electricityValue;
    }
}
