package calculate.service;

import calculate.model.info.CounterInfo;
import calculate.model.task.Task;

import java.util.Scanner;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.KEY_WORD;

public final class TaskService {
    private Scanner scanner;
    private CounterInfo info;
    private Double value;

    private Task task;

    public TaskService() {
        this.task = new Task();
        this.scanner = new Scanner(System.in);
        this.info = new CounterInfo();
    }

        public void runTask() {
            print(task.getNextMessage());

            while (needContinue(value = scanner.nextDouble())) {

                task.setValueToNextState(value);
//                task.overwritingValueToNextState(value);

                if(task.isReady()) {

                    info.payAmount();
                    scanner.close();

                    return;
                } else {
                    print(task.getNextMessage());
                }
            }
        }

    public boolean needContinue(Double inputString) {
        return !KEY_WORD.equals(inputString);
    }



}
