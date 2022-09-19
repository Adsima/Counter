package calculate.model.task;

import calculate.model.counter.Counter;

public class CounterTask extends Task {
    @Override
    public Counter getValue() {
//        if(isNull(value)) {
//            value = Counter.builder()
//                    .coldWater(coldWater)
//                    .hotWater(hotWater)
//                    .electricity(electricity)
//                    .build();
//        }
        return value;
    }
}
