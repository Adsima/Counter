package calculate.model.task;

import calculate.model.counter.Counter;

import static calculate.model.task.TaskState.COLD_WATER_STATE;
import static calculate.model.task.TaskState.READY_STATE;

public class Task {
    protected Double coldWater;
    protected Double hotWater;
    protected Double electricity;

    protected Counter value;

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
    // сохранить значение
    public void setValueToNextState(Double value) {
        taskState.setActualValue(this, value);
        rollState();
    }

    public Double getColdWater() {
        return coldWater;
    }

    public void setColdWater(Double coldWater) {
        coldWater = coldWater;
    }

    public Double getHotWater() {
        return hotWater;
    }

    public void setHotWater(Double hotWater) {
        hotWater = hotWater;
    }

    public Double getElectricity() {
        return electricity;
    }

    public void setElectricity(Double electricity) {
        electricity = electricity;
    }
}
