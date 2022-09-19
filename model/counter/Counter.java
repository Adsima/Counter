package calculate.model.counter;

public class Counter {
    private Double coldWater;
    private Double hotWater;
    private Double electricity;

    public static CounterBuilder builder() {
        return new CounterBuilder();
    }

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

        public Counter counter() {
            return new Counter();
        }
    }
}
