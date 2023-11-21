package Bai_tap_buoi_5.Bai_1;

import java.util.List;
import java.util.ArrayList;

public class ClassRoom {
    private List<Student> students;

    public ClassRoom() {
        this.students = new ArrayList<Student>();
    }

    public ClassRoom(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    void sortByGpa(){
        for(int i = 0; i < students.size() - 1; i++){
            for(int j = i + 1; j < students.size(); j++){
                if(students.get(i).getGpa() > students.get(j).getGpa()){
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    void inputListStudent(){
        Integer number = 0;
        Integer count = 1;

        while (true){
            System.out.printf("Enter information of student %d: \n", count++);

            Student student = new Student();
            student.input();

            if(student.getId().equals(555)){
              return;
            }

            students.add(student);
        }
    }

    void outputListStudent(){
        System.out.printf("%-16s %-22s %-17s %-25s %-25s %-20s %-18s %s\n", "Id", "Name", "Age", "Commune", "District", "City", "NameClass", "Gpa");
        for(Student student : students){
            student.output();
        }
    }

    boolean removeStudentById(Integer id){
        for(Student student : students){
            if(student.getId().equals(id)){
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}
