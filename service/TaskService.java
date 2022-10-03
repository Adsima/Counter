package calculate.service;

import calculate.model.info.MeterReadingInfo;
import calculate.model.task.Task;

import java.util.Scanner;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.FINISH;
import static calculate.util.MessageConstants.KEY_WORD;

public final class TaskService {
    private final Scanner scanner;
    private final MeterReadingInfo info;
    private final Task task;

    private String input;

    public TaskService() {
        this.task = new Task();
        this.scanner = new Scanner(System.in);
        this.info = new MeterReadingInfo();
    }

        public void runTask() {
            print(task.getNextMessage());

            while (needContinue(input = scanner.next()) &&
                    task.isValidValue(input)) {

                task.setValueToNextState(Double.parseDouble(input));
                task.overwritingValueToNextState(Double.parseDouble(input));

                if(task.isReady()) {

                    info.printPayAmount();
                    return;
                } else {
                    print(task.getNextMessage());
                }
            }
        }

    public boolean needContinue(String inputString) {
        return !KEY_WORD.equals(inputString);
    }

    public void finish() {
        print(FINISH);
        scanner.close();
    }

    public String getLastInput() {
        return input;
    }

}
