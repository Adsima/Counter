package calculate.model.task;

import static calculate.util.MessageConstants.*;

public enum TaskState {
    COLD_WATER_STATE {
        @Override
        String getMessage() {
            return VALUE_COLD_WATER_COUNTER;
        }

        @Override
        TaskState getNextState() {
            return HOT_WATER_STATE;
        }

        void setActualValue(Task task, Double value) {
            task.setColdWater(value);
        }
    },
    HOT_WATER_STATE {
        @Override
        String getMessage() {
            return VALUE_HOT_WATER_COUNTER;
        }

        @Override
        TaskState getNextState() {
            return ELECTRICITY_STATE;
        }

        void setActualValue(Task task, Double value) {
            task.setHotWater(value);
        }
    },
    ELECTRICITY_STATE {
        @Override
        String getMessage() {
            return VALUE_ELECTRICITY_COUNTER;
        }

        @Override
        TaskState getNextState() {
            return READY_STATE;
        }

        void setActualValue(Task task, Double value) {
            task.setElectricity(value);
        }
    },
    READY_STATE {
        @Override
        String getMessage() {
            return UNKNOWN_STATE_MESSAGE;
        }

        @Override
        TaskState getNextState() {
            return COLD_WATER_STATE;
        }

        @Override
        void setActualValue(Task task, Double value) {
        }
    };
    abstract String getMessage();
    abstract TaskState getNextState();
    abstract void setActualValue(Task task, Double value);

}
