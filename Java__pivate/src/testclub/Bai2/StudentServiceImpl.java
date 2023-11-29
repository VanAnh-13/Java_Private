package testclub.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService{
    static List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
        System.out.println("Add student successfully!");
    }

    @Override
    public void deleteStudent(Integer id) {
        list.removeIf(student -> student.getId().equals(id));
        System.out.println("Delete student successfully!");
    }

    @Override
    public void searchStudent(String name) {
        List<Student> listName = new ArrayList<>();
        listName = list.stream().filter(student -> student.getName().equals(name)).collect(Collectors.toList());

        if(!listName.isEmpty()){
            listName.forEach(System.out::println);
        }

        else{
            System.out.println("there is no student have name you want !");
        }
    }

    @Override
    public void sortStudent() {
        list.sort((student1, student2) -> (int) (student2.getScore() - student1.getScore())) ;
        System.out.println("Sort student successfully!");
    }

    @Override
    public void showAllStudent() {
        list.forEach(System.out::println);
    }
}