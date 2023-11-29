package testclub.Bai2;

public abstract class Person {
    private static Integer id = 0;
    private String name;
    private Short age;
    private Address address;

public Person() {
        id++;
    }

    public Person(String name, Short age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Person.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", Age: " + age + ", Address: " + address;
    }

    public abstract String getCapacity();
}
