package calculate;

import calculate.service.TaskService;

import java.io.IOException;

public class StartCalculate {

    private TaskService taskService;
    StartCalculate() {
        taskService = new TaskService();
    }

    public static void main(String[] args) throws IOException {
        new StartCalculate()
                .start();
    }

    private void start() {
        taskService.runTask();
    }
}
