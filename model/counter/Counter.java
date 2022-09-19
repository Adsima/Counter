package calculate.model.counter;

public class Counter {
    private Double coldWater;
    private Double hotWater;
    private Double electricity;

    public Counter(Double coldWater, Double hotWater, Double electricity) {
        this.coldWater = coldWater;
        this.hotWater = hotWater;
        this.electricity = electricity;
    }

//    public static CounterBuilder builder() {
//        return new CounterBuilder();
//    }

    public static class CounterBuilder {
        private Double coldWater;
        private Double hotWater;
        private Double electricity;

        public CounterBuilder coldWater(Double coldWater) {
            this.coldWater = coldWater;
            return this;
        }

        public CounterBuilder hotWater(Double hotWater) {
            this.hotWater = hotWater;
            return this;
        }

        public CounterBuilder electricity(Double electricity) {
            this.electricity = electricity;
            return this;
        }

        public Counter build() {
            return new Counter(coldWater, hotWater, electricity);
        }
    }
}
