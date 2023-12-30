package baitapbuoi8;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to generate an array of students
 *
 * @author LeVanAnh
 */
public class StudentArray {
    // Properties
    private List<Student> data;

    // Constructors
    public StudentArray() {
        this.data = new ArrayList<>();
    }

    public StudentArray(List<Student> data) {
        this.data = data;
    }

    // Getters and Setters
    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    // Methods
    /**
     * This method is used to get length of the data list
     *
     * @return length of the data list
     */
    public Integer size() {
        return this.data.size();
    }

    /**
     * This method is used to check empty list
     *
     * @return true if list empty, false if not
     */
    public Boolean isEmpty(){
        return this.data.isEmpty();
    }
}
