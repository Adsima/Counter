package calculate.model.task;

import static calculate.util.CounterUtil.overwriting;
import static calculate.util.MessageConstants.*;
import static calculate.util.link.FileLink.*;

public enum TaskState {
    COLD_WATER_STATE {
        @Override
        String getMessage() {
            return VALUE_COLD_WATER_COUNTER;
        }

        void setActualValue(Double value) {
            CounterTask.setColdWater(value);
        }

        @Override
        void overwritingActualValue(Double value) {
            overwriting(COLD_WATER_LINK, value);
        }

        @Override
        TaskState getNextState() {
            return HOT_WATER_STATE;
        }

    },
    HOT_WATER_STATE {
        @Override
        String getMessage() {
            return VALUE_HOT_WATER_COUNTER;
        }


        void setActualValue(Double value) {
            CounterTask.setHotWater(value);
        }

        @Override
        void overwritingActualValue(Double value) {
            overwriting(HOT_WATER_LINK, value);
        }

        @Override
        TaskState getNextState() {
            return ELECTRICITY_STATE;
        }


    },
    ELECTRICITY_STATE {
        @Override
        String getMessage() {
            return VALUE_ELECTRICITY_COUNTER;
        }


        void setActualValue(Double value) {
            CounterTask.setElectricity(value);
        }

        @Override
        void overwritingActualValue(Double value) {
            overwriting(ELECTRICITY_LINK, value);
        }

        @Override
        TaskState getNextState() {
            return READY_STATE;
        }
    },
    READY_STATE {
        @Override
        String getMessage() {
            return UNKNOWN_STATE_MESSAGE;
        }

        @Override
        void setActualValue(Double value) {
        }

        @Override
        void overwritingActualValue(Double value) {
        }

        @Override
        TaskState getNextState() {
            return COLD_WATER_STATE;
        }


    };
    abstract String getMessage();
    abstract TaskState getNextState();
    abstract void setActualValue(Double value);
    abstract void overwritingActualValue(Double value);
}
