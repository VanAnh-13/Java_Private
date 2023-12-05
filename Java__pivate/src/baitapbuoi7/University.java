package baitapbuoi7;

import java.util.List;

/**
 * class University is a class that manage student and course <br>
 * @see Student
 * @see Course
 * @author Le_Van_Anh
 */
public class University {
    // properties
    private List<Student> students;
    private List<Course> courses;

    // constructors
    public University() {
    }

    public University(List<Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    // getters and setters
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
