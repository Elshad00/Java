import java.util.*;
import java.util.stream.Collectors;

public class Student extends Human {

    private List<Course> courses = new ArrayList<>();
    public Student(int id, String name, String surname, String gender, String email, int birthDate) {
        super(id, name, surname, gender, email, birthDate );
    }

    @Override
    public String toString() {
        return "ID: %d, name: %s, surname: %s, gender: %s, email: %s, date of birth: %d, enrolled courses: %s".formatted(
                getId(),
                getName(),
                getSurname(),
                getGender(),
                getEmail(),
                getBirthDate(),
                courses.stream()
                        .map(Course::toString)
                        .collect(Collectors.joining("\n\t")));
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

}