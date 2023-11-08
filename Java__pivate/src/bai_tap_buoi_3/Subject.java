package bai_tap_buoi_3;

import java.util.Scanner;

class Subject implements Comparable<Subject>{
    private String id;
    private String subjectName;
    private Integer studentCount;
    private String timeStart;
    private String timeEnd;

    public Subject() {
        Scanner in = new Scanner(System.in);

        System.out.print("Id: ");
        this.id = in.nextLine();

        System.out.print("SUbject Name: ");
        this.subjectName = in.nextLine();

        System.out.print("Student count: ");
        this.studentCount = in.nextInt();
        in.nextLine();

        System.out.print("Time start: ");
        this.timeStart = in.nextLine();

        System.out.print("Time end: ");
        this.timeEnd = in.nextLine();
    }

    public Subject(String id, String subjectName, Integer studentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void display(){
        System.out.printf("%-8s%-20s%-20d%s\n", getId(), getSubjectName(), getStudentCount(), (getTimeStart() + " - " + getTimeEnd()));
    }

    @Override
    public int compareTo(Subject o) {
//        int startTimeCompare = this.timeStart.compareTo(o.timeStart);
//        if (startTimeCompare != 0) {
//            return startTimeCompare;
//        }

        int endTimeCompare = this.timeEnd.compareTo(o.timeEnd);
        return endTimeCompare;
    }
}
