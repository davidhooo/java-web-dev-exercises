package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student student1 = new Student("David Ho", 69696969, 1, 4.0);
        Teacher teacher1 = new Teacher("Elon", "Musk", "Designer", 0);

        System.out.println("Student 1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + "." );
        System.out.println("Teacher 1's name is " + teacher1.getName() + " and they have been teaching for " + teacher1.getYearsTeaching() + " years." );

        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(student1);

        Course course1 = new Course("Introduction to Dance", 101, false, "Michael Jackson", listOfStudents);

    }
}
