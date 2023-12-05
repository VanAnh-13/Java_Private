package baitapbuoi7;

/**
 * class Person is a class that represents a person<br>
 * Person is a superclass of Student class<br>
 * Person implements Displayable interface<br>
 *
 * @author Le_Van_Anh
 * @see Student
 * @see Displayable
 */
public abstract class Person implements Displayable {
    // properties
    private Integer id;
    private String name;

    // constructors
    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters and setters
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

    @Override
    public void displayInfor() {
        System.out.printf("%-20s%-20s", id, name);
    }

}
