public class Exam {
    private int examId;
    private Course course;
    private Student student;
    private String date;
    private int score;

    public Exam(int examId, Course course, Student student,String date ,int score) {
        this.examId = examId;
        this.course = course;
        this.student = student;
        this.date = date;
        this.score = score;
    }

    public int getExamId() {
        return examId;
    }
    public Course getCourse() {
        return course;
    }
    public Student getStudent() {
        return student;
    }
    public String getDate() {
        return date;
    }
    public int getScore() {
        return score;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Exam [ID: %d, course: %s, student: %s, date: %s, score: %d]".formatted(examId, course.getCourseName(), student.getName(), date, score);
    }
}