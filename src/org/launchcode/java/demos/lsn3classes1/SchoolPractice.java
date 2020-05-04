package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student Noah = new Student("NPG", 1234, 25, 4.0);
        Student Toni = new Student("Tobi", 1235, 50, 3.8);

        ArrayList<Student> classRoster = new ArrayList<Student>();
        classRoster.add(Noah);
        classRoster.add(Toni);

        Course wizardingCourse = new Course(classRoster, "Wizarding 101", "Dumbledore");

        System.out.println(
                Noah.getGpa()
        );

        Noah.addGrade(3.0, 4);

        System.out.println(
                Noah.getGpa()
        );
    }
}

