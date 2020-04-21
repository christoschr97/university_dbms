package sample;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private String name;
    private String shortcut;
    private static int id_tracker = 1;
    private int id;
    private int ects;
    private String description;
    private ArrayList<Professor> professors;

    public Course(String name, int ects, String descriptionn, String shortcut) {
        this.name = name;
        this.ects = ects;
        this.shortcut = shortcut;
        this.id = id_tracker;
        id_tracker++;
        this.description = description;
        this.professors = new ArrayList<>();
    }

    public Course(Course course) {
        this.name = course.name;
        this.ects = course.ects;
        this.shortcut = course.shortcut;
        this.id = course.id;
        id_tracker++;
        this.description = course.description;
        this.professors = course.getProfessors();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public int getId() {
        return id;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }




}
