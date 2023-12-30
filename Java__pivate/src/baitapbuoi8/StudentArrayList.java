package baitapbuoi8;

import java.util.List;

/**
 * This class is used to generate an array list of students
 *
 * @author LeVanAnh
 */
public class StudentArrayList extends StudentArray {
    // Constructor
    public StudentArrayList() {
    }

    public StudentArrayList(List<Student> data) {
        super(data);
    }

    // Methods
    /**
     * This method is used to add student to StudentArrayList
     *
     * @param student is a student you want to add
     */
    public void add(Student student){
        List<Student> studentList = this.getData();

        studentList.add(student);

        super.setData(studentList);
    }

    /**
     * This method is used to delete student
     * @param index is the index of student you want to delete
     */
    public void delete(Integer index){
        List<Student> studentList = this.getData();

        studentList.remove(studentList.get(index));

        super.setData(studentList);
    }

    /**
        * This method is used to sort student
        * @param comparator is the comparator you want to use
        */
    public void sort(StudentComparator comparator){
        List<Student> studentList = this.getData();

        for (int i = 0; i < studentList.size() - 1; i++) {
            comparator.compare(studentList.get(i), studentList.get(i + 1));
        }

        super.setData(studentList);
    }
}
