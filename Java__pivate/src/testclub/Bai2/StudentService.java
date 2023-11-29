package testclub.Bai2;

public interface StudentService {
    void addStudent(Student student);
    void deleteStudent(Integer id);
    void searchStudent(String name);
    void sortStudent();
    void showAllStudent();
}
