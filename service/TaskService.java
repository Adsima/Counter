package calculate.service;

import calculate.model.info.Payment;
import calculate.model.task.Task;

import java.util.Scanner;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.KEY_WORD;

public final class TaskService {
    private Scanner scanner;
    private Payment name;
    private Double value;

    public TaskService() {
        this.scanner = new Scanner(System.in);
        this.name = new Payment();
    }

        public void runTask(Task task) {
            print(task.getNextMessage());

            while (needContinue(value = scanner.nextDouble())) {

                task.setValueToNextState(value);
                //Здесь должна быть логика перезаписи файла:

                if(task.isReady()) {
                    name.paymentAmount();
                    scanner.close();
                } else {
                    print(task.getNextMessage());
                }
            }
        }

    public boolean needContinue(Double inputString) {
        return !KEY_WORD.equals(inputString);
    }



}
