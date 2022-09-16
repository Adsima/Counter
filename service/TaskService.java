package calculate.service;

import calculate.Calculation.ColdWaterCalculation;
import calculate.Calculation.ElectricityCalculation;
import calculate.Calculation.HotWaterCalculation;
import calculate.model.Task;

import java.util.Scanner;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.KEY_WORD;

public final class TaskService {
    ColdWaterCalculation coldWater;
    HotWaterCalculation hotWater;
    ElectricityCalculation electricity;

    private final Scanner scanner;

    private String lastInput;

    public TaskService(Scanner scanner) {
        this.scanner = scanner;
    }

        public void runTask(Task task) {
            print(task.getNextMessage());
            while (needContinue(lastInput = scanner.nextLine())) {
                if(task.isReady()) {

                } else {
                    print(task.getNextMessage());
                }
            }
        }

    public boolean needContinue(String inputString) {
        return !KEY_WORD.equals(inputString);
    }

}
