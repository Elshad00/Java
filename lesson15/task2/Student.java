public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String surname;
    private double grade;
    private int birthDate;
    private String gender;

    public Student(int id, String name, String surname, double grade, int birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGrade() {
        return grade;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}