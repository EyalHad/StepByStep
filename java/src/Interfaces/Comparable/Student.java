package Interfaces.Comparable;

public class Student implements Comparable<Student>{

    private final int id;
    private final String firstName;
    private final String lastName;

    public Student(String name, String sureName){
        id = (int) (Math.random() * 1_000_000_000); // will produce a random number with 9 digits
        firstName = name;
        lastName = sureName;
    }
    @Override
    public int compareTo(Student other) {

        int firstNames = nameComparing(this.firstName, other.firstName);
        if (firstNames != 0){ return firstNames; }

        int lastNames = nameComparing(this.lastName, other.lastName);
        if (lastNames != 0){ return firstNames; }

        int firstNameLength = this.firstName.length() - other.firstName.length();
        if (firstNameLength != 0){ return firstNameLength; }

        return this.lastName.length() - other.lastName.length();
    }

    private int nameComparing(String a, String b){

        String one = a.toLowerCase();
        String two = b.toLowerCase();

        int length = Math.min(one.length(), two.length());

        for (int i = 0; i < length; i++) {
            if (one.charAt(i) > two.charAt(i)){
                return 1;
            }
            if (one.charAt(i) < two.charAt(i)){
                return -1;
            }
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Student[ " +
                "id = " + id +
                "| firstName = " + firstName + '\'' +
                "| lastName = " + lastName + '\'' +
                " ]";
    }
}
