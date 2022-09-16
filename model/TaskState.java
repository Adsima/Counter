package calculate.model;

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
    };
    abstract String getMessage();
    abstract TaskState getNextState();
}
