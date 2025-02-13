import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int IQ;
    private String[][] schedule;
    private Family family;

    public Human() {}

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Family family) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.family = family;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public int getIQ() {
        return IQ;
    }
    public String[][] getSchedule() {
        return schedule;
    }
    public Family getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    public void setFamily(Family family) {
        this.family = family;
    }




    @Override
    public String toString(){
        return "Human{name=%s, surname=%s, year=%d, iq=%d, schedule=%s".formatted(this.name, this.surname, this.dateOfBirth, this.IQ, Arrays.deepToString(schedule));
    }
}
