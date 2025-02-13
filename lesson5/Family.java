import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = new Pet();
    }

    public Human getMother() {
        return this.mother;
    }
    public Human getFather() {
        return this.father;
    }
    public Human[] getChildren() {
        return this.children;
    }
    public Pet getPet() {
        return this.pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {

        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
    }

    public boolean deleteChild(Human delChild) {
        boolean deleted = false;
        Human[] children1 = new Human[0];
        for(Human child : children) {
            if(child == delChild) {
                deleted = true;
                continue;
            }
            children1 = Arrays.copyOf(children1, children1.length + 1);
            children1[children1.length - 1] = child;
        }

        children = children1;
        return deleted;
    }

    public int countFamily() {
        return 2 + children.length;

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
            if(pet.getTrickLevel() > rand) {
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
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(){
        if(pet.getTrickLevel() >= 50) {
            System.out.printf("I have a(n) %s is %d years old, he is very sly\n", pet.getSpecies(), pet.getAge());
        } else {
            System.out.printf("I have a(n) %s is %d years old, he is almost not sly\n", pet.getSpecies(), pet.getAge());
        }
    }

    @Override
    public String toString() {
        String[] names = new String[children.length];
        for(int i = 0; i < children.length; i++) {
            String name = "";
            name = name + children[i].getName() + " ";
            name += children[i].getSurname();
            names[i] = name;
        }
        return "Family{mother: %s %s, father: %s %s, children: %s, pet: %s}"
                .formatted(mother.getName(), mother.getSurname(), father.getName(), father.getSurname(), (children.length == 0) ? "null" : String.join(", ", names), pet.getNickname());
    }
}
