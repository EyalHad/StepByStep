package Interfaces.Comparable;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        boolean runTruckExample = false;
        boolean runStudentExample = true;

        if (runTruckExample) {

            Truck ford = new Truck(123123, "Ford", 2018, 37);
            Truck toyota = new Truck(564222, "Toyota", 2022, 17);
            Truck kia = new Truck(564222, "Kia", 2000);
            Truck bugatti = new Truck(564222, "Bugatti", 2020, 23);
            Truck subaru = new Truck(564222, "Subaru", 2019, 21);


            /**
             *    public static <T extends Comparable<? super T>> void sort(List<T> list) {
             *         list.sort(null);
             *     }
             */

            List<Truck> truckLinkedList = new LinkedList<>();

            truckLinkedList.add(ford);
            truckLinkedList.add(toyota);
            truckLinkedList.add(kia);
            truckLinkedList.add(bugatti);
            truckLinkedList.add(subaru);

            List<Truck> truckArrayList = new ArrayList<>();

            truckArrayList.add(toyota);
            truckArrayList.add(kia);
            truckArrayList.add(ford);
            truckArrayList.add(subaru);
            truckArrayList.add(bugatti);

            System.out.println("-----------------------------------------------------");


            System.out.println("Truck LinkedList");
            for (Truck truck : truckLinkedList) {
                System.out.println(truck);
            }
            System.out.println();
            Collections.sort(truckLinkedList);

            System.out.println("Truck LinkedList Sorted");
            for (Truck truck : truckLinkedList) {
                System.out.println(truck);
            }

            System.out.println("-----------------------------------------------------");

            System.out.println("Truck ArrayList");
            for (Truck truck : truckArrayList) {
                System.out.println(truck);
            }
            System.out.println();
            Collections.sort(truckArrayList);

            System.out.println("Truck ArrayList Sorted");
            for (Truck truck : truckArrayList) {
                System.out.println(truck);
            }

            System.out.println("-----------------------------------------------------");

        }

        if (runStudentExample){

            Student a = new Student("Adi", "Navon");
            Student b = new Student("Abraham", "Lincoln");
            Student c = new Student("Abraham", "Mandarin");
            Student d = new Student("Edward", "Jason");
            Student e = new Student("Jason", "blah");

            List<Student> students = new ArrayList<>();
            students.add(a);
            students.add(b);
            students.add(c);
            students.add(d);
            students.add(e);


            System.out.println("Students");
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println();
            Collections.sort(students);

            System.out.println("Students Sorted");
            for (Student student : students) {
                System.out.println(student);
            }


//            StudentNoImplement a1 = new StudentNoImplement("Adi", "Navon");
//            StudentNoImplement b1 = new StudentNoImplement("Abraham", "Lincoln");
//            StudentNoImplement c1 = new StudentNoImplement("Abraham", "Mandarin");
//            StudentNoImplement d1 = new StudentNoImplement("Edward", "Jason");
//            StudentNoImplement e1 = new StudentNoImplement("Jason", "blah");
//
//            List<StudentNoImplement> studentNoImplements = new ArrayList<>();
//            studentNoImplements.add(a1);
//            studentNoImplements.add(b1);
//            studentNoImplements.add(c1);
//            studentNoImplements.add(d1);
//            studentNoImplements.add(e1);
//
//
//            System.out.println("Students");
//            for (StudentNoImplement student : studentNoImplements) {
//                System.out.println(student);
//            }
//            System.out.println();
//            Collections.sort(studentNoImplements);
//
//            System.out.println("Students Sorted");
//            for (StudentNoImplement student : studentNoImplements) {
//                System.out.println(student);
//            }





        }

    }
}
