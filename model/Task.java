package calculate.model;

import static calculate.model.TaskState.COLD_WATER_STATE;
import static calculate.model.TaskState.READY_STATE;

public abstract class Task {
    protected Double coldWater;
    protected Double hotWater;
    protected Double Electricity;

    protected TaskState taskState = COLD_WATER_STATE;

    public String getNextMessage() {
        return taskState.getMessage();
    }

    public boolean isReady() {
        return READY_STATE == taskState;
    }

    private void rollState() {
        taskState = taskState.getNextState();
    }

    public Double getColdWater() {
        return coldWater;
    }

    public void setColdWater(Double coldWater) {
        this.coldWater = coldWater;
    }

    public Double getHotWater() {
        return hotWater;
    }

    public void setHotWater(Double hotWater) {
        this.hotWater = hotWater;
    }

    public Double getElectricity() {
        return Electricity;
    }

    public void setElectricity(Double electricity) {
        Electricity = electricity;
    }

}
