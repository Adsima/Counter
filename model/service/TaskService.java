package calculate.model.service;

import calculate.model.not_name.NotName;
import calculate.model.task.Task;

import java.io.IOException;
import java.util.Scanner;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.KEY_WORD;

public final class TaskService {
    private Scanner scanner;
    private NotName name;

    private Double value;

    public TaskService() throws IOException {
        this.scanner = new Scanner(System.in);
        this.name = new NotName();
    }

        public void runTask(Task task) throws IOException {
            print(task.getNextMessage());

            while (needContinue(value = scanner.nextDouble())) {

                task.setValueToNextState(value);
                //Здесь должна быть логика перезаписи файла:

                if(task.isReady()) {
                    name.paymentInformation();
                    scanner.close();
                } else {
                    print(task.getNextMessage());
                }
            }
        }

    public boolean needContinue(Double inputString) {
        return !KEY_WORD.equals(inputString);
    }

    public Double getValue() {
        return value;
    }
}
