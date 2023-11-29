package testclub;

public class Student extends Person {
    private Double score;

    public Student() {
        super();
    }

    public Student(String name, Short age, Address address, Double score) {
        super(name, age, address);
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + ", Score: " + score + ", Capacity: " + getCapacity();
    }

    @Override
    public String getCapacity() {
        if (score >= 9.0) {
            return "Excellent";
        } else if (score >= 8.0 && score < 9.0) {
            return "Good";
        } else if (score >= 6.5 && score < 8.0) {
            return "Average";
        } else {
            return "Bad";
        }
    }
}
