import java.util.Arrays;
import java.util.Objects;

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
            if(child.equals(delChild)) {
                deleted = true;
                continue;
            }
            children1 = Arrays.copyOf(children1, children1.length + 1);
            children1[children1.length - 1] = child;
        }

        children = children1;
        return deleted;
    }

    public boolean deleteChildrenWithIndex(int index) {
        boolean deleted = false;
        Human[] children1 = new Human[0];
        for (int i = 0; i < children.length; i++) {
            if (i == index) {
                deleted = true;
                continue;
            }
            children1 = Arrays.copyOf(children1, children1.length + 1);
            children1[children1.length - 1] = children[i];
        }

        children = children1;
        return deleted;
    }

    public int countFamily() {
        return 2 + children.length;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father);
    }
    @Override
    public int hashCode() {
        int result=17;
        result=31*result+mother.hashCode();
        result=31*result+father.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String[] names = new String[children.length];
        for(int i = 0; i < children.length; i++) {
            String name = "";
            name = name + children[i].toString() + " ";
            names[i] = name;
        }
        return "Family{mother: %s, \n%7sfather: %s, \n%7schildren: %s, \n%7spet: %s}"
                .formatted(mother.toString(),
                        " ",
                        father.toString(),
                        " ",
                        (children.length == 0) ? "null" : String.join(", \n%17s".formatted(" "), names),
                        " ",
                        (pet != null) ? pet.toString() : "null");
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human object is removed.");
    }
}
