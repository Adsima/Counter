package calculate;

import calculate.service.TaskService;

import java.io.IOException;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.GREETINGS_STRING;

public class StartCalculate {

    TaskService taskService;
    StartCalculate() {
        taskService = new TaskService();
    }

    public static void main(String[] args) throws IOException {
        new StartCalculate()
                .start();
    }

    private void start() {
        print(GREETINGS_STRING);

        taskService.runTask();

    }
}
