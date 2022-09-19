package calculate;

import calculate.model.task.Task;
import calculate.model.service.TaskService;

import java.io.IOException;

import static calculate.util.ConsoleUtil.print;
import static calculate.util.MessageConstants.GREETINGS_STRING;

public class StartCalculate {

    TaskService taskService;
    Task task;
    StartCalculate() throws IOException {

    }

    public static void main(String[] args) throws IOException {
        new StartCalculate();
    }

    private void start() {
        print(GREETINGS_STRING);


    }
}
