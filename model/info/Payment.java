package calculate.model.info;

import calculate.model.task.calculation.ColdWaterTask;
import calculate.model.task.calculation.ElectricityTask;
import calculate.model.task.calculation.HotWaterTask;

import static calculate.util.ConsoleUtil.printFormat;
import static calculate.util.MessageConstants.PAYMENT_TOTAL;

public class Payment  {
    private ColdWaterTask coldWater;
    private HotWaterTask hotWater;
    private ElectricityTask electricity;

    public Payment() {
        coldWater = new ColdWaterTask();
        hotWater = new HotWaterTask();
        electricity = new ElectricityTask();
    }

    public void paymentAmount() {
        printFormat(PAYMENT_TOTAL, totalAmount());
    }
    //Поздно выполняет то, что необходимо
    private Double totalAmount() {
        return coldWater.calculation() +
                hotWater.calculation() +
                electricity.calculation();
    }
}
