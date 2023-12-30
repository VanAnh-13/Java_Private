package baitapbuoi8;

/**
 * This class is used to generate a student
 *
 * @author LeVanAnh
 */
public class Student {
    public static Integer idCount = 0;
    // Properties
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Double gpa;

    // Constructors
    public Student() {
        this.id = idCount++;
    }

    public Student(String name, Integer age, String address, Double gpa) {
        this.id = ++idCount;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
