package calculate.Calculation;

public class Example {
    public static void main(String[] args) {
        Task task = new Task();
        task.setName("name");
        System.out.println(task.getName());
    }

    static class Task {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
