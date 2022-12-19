package Interfaces.Comparable;

public class StudentNoImplement {

    private final int id;
    private final String firstName;
    private final String lastName;

    public StudentNoImplement(String name, String sureName){
        id = (int) (Math.random() * 100_000_000); // will produce a random number with 9 digits
        firstName = name;
        lastName = sureName;
    }
    public int compareTo(StudentNoImplement other) {

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
}
