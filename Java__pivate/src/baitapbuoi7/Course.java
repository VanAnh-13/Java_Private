package baitapbuoi7;

import java.util.List;

/**
 * class Course is a class that represents a course<br>
 * class Course is a class implements Displayable interface<br>
 * @see Displayable
 * @author Le_Van_Anh
 */
public class Course implements Displayable{
    // properties
    private String courseId;
    private String courseName;
    private List<Student> students;

    // constructors
    public Course() {
    }

    public Course(String courseId, String courseName, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = students;
    }

    // getters and setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // other method
    /**
     * method displayInfor() is a method that display information of a course
     */
    @Override
    public void displayInfor() {
        students.forEach(student -> {
            student.displayInfor();
            System.out.printf("%-20s%-20s\n", courseId, courseName);
        });
    }
}
