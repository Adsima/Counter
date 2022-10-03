package calculate;

import calculate.service.TaskService;

public class StartCalculate {

    private TaskService service;
    StartCalculate() {
        service = new TaskService();
    }

    public static void main(String[] args) {
        new StartCalculate()
                .start();
    }

    private void start() {
        while (service.needContinue(service.getLastInput())) {
            service.runTask();
        }

//        service.finish();
    }
}
