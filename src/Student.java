public class Student extends Person {

    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public void setScore(double score) {
        if (score < 2 || score > 6) {
            throw new IllegalArgumentException("The score must be [2...6]");
        }
        this.score = score;
    }

    public void showStudentinfo() {
        System.out.println(super.getName() + super.getAge() + this.score);
    }
}
