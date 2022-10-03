package calculate.model.task;

import calculate.model.info.MeterReadingInfo;
import calculate.model.task.calculate.ColdWaterTask;
import calculate.model.task.calculate.ElectricityTask;
import calculate.model.task.calculate.HotWaterTask;
import calculate.validator.ColdWaterValidator;
import calculate.validator.ElectricityValidator;
import calculate.validator.HotWaterValidator;
import calculate.validator.Validator;

import static calculate.util.ConsoleUtil.printFormat;
import static calculate.util.MessageConstants.*;
import static calculate.util.MeterReadingsUtil.overwriting;
import static calculate.util.link.FileLink.*;

public enum TaskState {
    COLD_WATER_STATE {
        @Override
        String getMessage() {
            return VALUE_COLD_WATER_COUNTER;
        }

        void setActualValue(Double value) {
            MeterReadingsTask.setColdWater(value);
        }

        @Override
        void calculationSpecificState() {
            printFormat(PAYMENT_FOR_COLD_WATER, ColdWaterTask.calculation());
            MeterReadingInfo.setColdWaterValue(ColdWaterTask.calculation());
        }

        @Override
        Validator getValidator(String value) {
            return new ColdWaterValidator();
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
            MeterReadingsTask.setHotWater(value);
        }

        @Override
        void calculationSpecificState() {
            printFormat(PAYMENT_FOR_HOT_WATER, HotWaterTask.calculation());
            MeterReadingInfo.setHotWaterValue(HotWaterTask.calculation());
        }

        @Override
        Validator getValidator(String value) {
            return new HotWaterValidator();
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
            MeterReadingsTask.setElectricity(value);
        }

        @Override
        void calculationSpecificState() {
            printFormat(PAYMENT_FOR_ELECTRICITY, ElectricityTask.calculation());
            MeterReadingInfo.setElectricityValue(ElectricityTask.calculation());
        }

        @Override
        Validator getValidator(String value) {
            return new ElectricityValidator();
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
        Validator getValidator(String value) {
            return null;
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
    abstract Validator getValidator(String value);

}
