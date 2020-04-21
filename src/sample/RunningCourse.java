package sample;

import java.util.HashMap;

public class RunningCourse extends Course {

    private HashMap<Integer, Student> students;
    private HashMap<Integer, Integer> studentsGrades;
    private int year;
    private String semester;

    public RunningCourse(Course course) {
        super(course);

    }
}
