package sample;

import java.util.HashMap;

public class Professor {

    private HashMap<Integer, Course> coursesTeaching;
    private String specialization;
    private String title;

    public Professor(String specialization, String title) {
        this.specialization = specialization;
        this.title = title;
        coursesTeaching = new HashMap<>();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
