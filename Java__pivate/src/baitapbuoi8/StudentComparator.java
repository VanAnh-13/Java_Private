package baitapbuoi8;

/**
 * This interface is used to compare two student
 *
 * @author LeVanAnh
 */
@FunctionalInterface
public interface StudentComparator {
    Boolean compare(Student s1, Student s2);
}
