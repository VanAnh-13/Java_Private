package baitapbuoi8;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to set the student
 *
 * @author LeVanAnh
 */
public class StudentSet extends StudentArray {
    // Properties
    private StudentComparator comparator;

    // Constructor
    public StudentSet() {
        List<Student> students = this.getData();

        for (int i = 0; i < students.size() - 1; i++) {
            this.comparator.compare(students.get(i), students.get(i + 1));
        }

        super.setData(students);
    }

    public StudentSet(StudentComparator comparator, List<Student> data) {
        super(data);
        this.comparator = comparator;
    }

    // Method
    /**
     * This method is used to insert student to StudentSet
     *
     * @param student is a student you want to insert
     */
    public void insert(Student student) {
        List<Student> studentList = this.getData();

        studentList.add(student);

        for (int i = 0; i < studentList.size() - 1; i++) {
            this.comparator.compare(studentList.get(i), studentList.get(i + 1));
        }

        this.setData(studentList);
    }

    /**
     * This method is used to remove student
     *
     * @param student is a student you want to remove
     */
    public void remove(Student student) {
        List<Student> studentList = this.getData();

        studentList.removeIf(student1 -> student1.equals(student));

        super.setData(studentList);
    }

    /**
     * This method is used to contain student in list
     *
     * @param student is a student you want to check
     * @return true if it has, false if not
     */
    public Boolean contain(Student student) {
        List<Student> studentList = this.getData();

        return studentList.stream()
                .anyMatch(student1 -> student1.equals(student));
    }
}
