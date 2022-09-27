package calculate.model.task;

import static calculate.model.task.TaskState.COLD_WATER_STATE;
import static calculate.model.task.TaskState.READY_STATE;

public class Task {

    protected TaskState taskState = COLD_WATER_STATE;

    public String getNextMessage() {
        return taskState.getMessage();
    }

    public boolean isReady() {
        return READY_STATE == taskState;
    }

    public void rollState() {
        taskState = taskState.getNextState();
    }

    public void setValueToNextState(Double value) {
        taskState.setActualValue(value);
    }

    public void overwritingValueToNextState(Double value) {
        taskState.overwritingActualValue(value);
        rollState();
    }
}
