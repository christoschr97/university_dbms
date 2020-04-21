package sample;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Member {

     private Professor tutor;
     private int grade;
     private HashMap<Integer, Integer> currentCourses;
     private HashMap<Integer, Course> coursesPassed;


     public Student(String name, int member_id, String email, int age, Professor tutor) {
          super(name, member_id, email, age);
          this.tutor = tutor;
          currentCourses = new HashMap<>();
          coursesPassed = new HashMap<>();
     }

     public Professor getTutor() {
          return tutor;
     }

     public void setTutor(Professor tutor) {
          this.tutor = tutor;
     }

     public int getGrade() {
          return grade;
     }

     public void setGrade(int grade) {
          this.grade = grade;
     }

     @Override
     public String toString() {
          return super.toString() + "\nStudent{" +
                  "grade=" + grade +
                  "} }";
     }

}
