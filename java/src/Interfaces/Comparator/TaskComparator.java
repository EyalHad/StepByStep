package Interfaces.Comparator;

import java.util.Comparator;

public class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task taskA, Task taskB) {
        return  Integer.compare(taskA.getPriority(), taskB.getPriority());
    }
}
