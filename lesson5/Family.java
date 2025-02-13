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
        mother.setFamily(this);
        this.father = father;
        father.setFamily(this);
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
