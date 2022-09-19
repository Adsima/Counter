package calculate.model.not_name;

import calculate.Calculation.ColdWaterCalculation;
import calculate.Calculation.ElectricityCalculation;
import calculate.Calculation.HotWaterCalculation;
import calculate.model.task.Task;

import java.io.IOException;

import static calculate.util.ConsoleUtil.printFormat;

public class NotName extends Task {
    private ColdWaterCalculation coldWater;
    private HotWaterCalculation hotWater;
    private ElectricityCalculation electricity;

    public NotName() {
        coldWater = new ColdWaterCalculation();
        hotWater = new HotWaterCalculation();
        electricity = new ElectricityCalculation();
    }

    public void paymentInformation() throws IOException {
        printFormat("Общая сумма платежа: %s", totalAmount());
    }
//     Как будем передавать новые значения?
    private Double totalAmount() throws IOException {
        return coldWater.calculationPaymentAmount(getColdWater()) +
                hotWater.calculationPaymentAmount(getHotWater()) +
                electricity.calculationPaymentAmount(getElectricity());
    }
}
