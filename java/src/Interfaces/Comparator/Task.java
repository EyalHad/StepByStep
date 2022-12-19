package Interfaces.Comparator;

public class Task {

    private enum PRIORITY{
        LOW,  MEDIUM,  HIGH

    }

    private PRIORITY priority;
    private String name;

    public Task(String name, int number) {
        setPriority(number);
        this.name = name;
    }


    public void setPriority(int number){
        if (number < 0){
            this.priority = PRIORITY.LOW;
        } else if (number > 100) {
            this.priority = PRIORITY.HIGH;
        } else {
            this.priority = PRIORITY.MEDIUM;
        }
    }

    public int getPriority() {
        switch (priority) {
            case LOW: return 1;
            case MEDIUM: return 0;
            case HIGH: return -1;
        }
        return 0;
    }
    public String getName() { return name; }
    public void setPriority(PRIORITY priority) { this.priority = priority; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }
}
