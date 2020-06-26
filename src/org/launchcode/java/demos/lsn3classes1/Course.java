package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int courseNumber;
    private Boolean graduateLevelClass;
    private String instructor;
    private ArrayList<Student> students;

    public Course(String courseName,
                  int courseNumber,
                  Boolean graduateLevelClass,
                  String instructor,
                  ArrayList<Student> students) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.graduateLevelClass = graduateLevelClass;
        this.instructor = instructor;
        this.students = students;
    }
}
