package baitapbuoi7;

/**
 * class Student is a class that represents a student<br>
 * Student is a subclass of Person class<br>
 * Student implements Displayable interface<br>
 * @see Person
 * @see Displayable
 * @author Le_Van_Anh
 *
 */
public class Student extends Person implements Displayable {
    // properties
    private Byte age;
    private String grade;

    // constructors
    public Student() {
        super();
    }

    public Student(Integer id, String name, Byte age, String grade) {
        super(id, name);
        this.age = age;
        this.grade = grade;
    }

    // getters and setter
    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // other methods

    /**
     * method study() is a method that add a course to student
     */
    public void enroll() {
        System.out.println("Enter course ID: ");
        String courseId = Menu.sc.nextLine();

        System.out.println("Enter course name: ");
        String courseName = Menu.sc.nextLine();

        Course course = new Course(courseId, courseName, null);
        System.out.println("Add course successfully!");
    }

    /**
     * method displayInfor() is a method that display information of a student
     */
    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.printf("%-20s%-20s", age, grade);
    }
}
