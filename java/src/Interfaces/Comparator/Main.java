package Interfaces.Comparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Task task0 = new Task("task0", -1);
        Task task1 = new Task("task1", 2);
        Task task2 = new Task("task2", 3);
        Task task3 = new Task("task3", -4);
        Task task4 = new Task("task4", -5);
        Task task5 = new Task("task5", 6);
        Task task6 = new Task("task6", 7);
        Task task7 = new Task("task7", 212);
        Task task8 = new Task("task8", 2);
        Task task9 = new Task("task9", 111);
        Task task10 = new Task("task10", 211);

        Queue<Task> taskQueue = new PriorityQueue<>(new TaskComparator());
        taskQueue.add(task0);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task1);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task2);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task3);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task4);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task5);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task6);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task7);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task8);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task9);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);
        taskQueue.add(task10);
//        System.out.println(taskQueue);
//        Thread.sleep(1000);


        while (!taskQueue.isEmpty()){
            System.out.println(taskQueue.poll());
            Thread.sleep(1000);

        }
    }
}
