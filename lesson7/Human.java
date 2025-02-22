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


    public boolean feedPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Isn't it time for feeding: ");
        boolean feed = scanner.nextBoolean();
        if(feed) {
            System.out.println("Hm... I will feed Jack");
            scanner.close();
            return true;
        }
        else {
            Random random = new Random();
            int rand = random.nextInt(0, 101);
            if(family.getPet().getTrickLevel() > rand) {
                System.out.println("Hm... I will feed Jack");
                scanner.close();
                return true;
            }
            else {
                System.out.println("I think Jack is not hungry");
                scanner.close();
                return false;
            }
        }
    }

    public void greetPet(){
        System.out.println("Hello, " + family.getPet().getNickname());
    }

    public void describePet(){
        if(family.getPet().getTrickLevel() >= 50) {
            System.out.printf("I have a(n) %s is %d years old, he is very sly\n", family.getPet().getSpecies(), family.getPet().getAge());
        } else {
            System.out.printf("I have a(n) %s is %d years old, he is almost not sly\n", family.getPet().getSpecies(), family.getPet().getAge());
        }
    }

    @Override
    public String toString(){
        return "Human{name=%s, surname=%s, year=%d, iq=%d, schedule=%s}".formatted(this.name, this.surname, this.dateOfBirth, this.IQ, Arrays.deepToString(schedule));
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human object is removed.");
    }
}
