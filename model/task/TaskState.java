package calculate.model.task;

import calculate.model.info.CounterInfo;
import calculate.model.task.calculate.ColdWaterTask;
import calculate.model.task.calculate.ElectricityTask;
import calculate.model.task.calculate.HotWaterTask;

import static calculate.util.ConsoleUtil.printFormat;
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
        void calculationSpecificState() {
            printFormat(PAYMENT_FOR_COLD_WATER, ColdWaterTask.calculation());
            CounterInfo.setColdWaterValue(ColdWaterTask.calculation());
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
        void calculationSpecificState() {
            printFormat(PAYMENT_FOR_HOT_WATER, HotWaterTask.calculation());
            CounterInfo.setHotWaterValue(HotWaterTask.calculation());
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
        void calculationSpecificState() {
            printFormat(PAYMENT_FOR_ELECTRICITY, ElectricityTask.calculation());
            CounterInfo.setElectricityValue(ElectricityTask.calculation());
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
        void calculationSpecificState() {

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
    abstract void calculationSpecificState();
    abstract void overwritingActualValue(Double value);

}
