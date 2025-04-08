public class Course {
    private int courseId;
    private String courseName;
    private String courseCode;
    private int credit;
    private String schedule;
    private Teacher teacher;
    public Course(int courseId, String courseName, String courseCode, int credit, String schedule,Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;
        this.schedule = schedule;
        this.teacher = teacher;
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public int getCredit() {
        return credit;
    }
    public String getSchedule() {
        return schedule;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course [ID: %d, name: %s, code: %s, credit: %d, schedule: %s, teacher: %s]".formatted(courseId, courseName, courseCode, credit, schedule, teacher.getName());
    }
}