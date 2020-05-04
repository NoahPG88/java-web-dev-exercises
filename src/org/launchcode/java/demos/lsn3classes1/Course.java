package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    //Fields
    private ArrayList<Student> courseRoster;
    private String name;
    private String teacher;

    //Constructor
    public Course(ArrayList<Student> courseRoster, String name, String teacher) {
        this.courseRoster = courseRoster;
        this.name = name;
        this.teacher = teacher;
    }

    //Methods

    //GETS AND SETS

    public ArrayList<Student> getCourseRoster() {
        return courseRoster;
    }

    public void setCourseRoster(ArrayList<Student> courseRoster) {
        this.courseRoster = courseRoster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
