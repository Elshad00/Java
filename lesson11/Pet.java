import java.util.Objects;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(){}

    public Pet(String nickname){
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits){
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }
    public String getNickname() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }
    public String[] getHabits() {
        return habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat(){
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj==null || this.getClass()!=obj.getClass()) {
            return false;
        }
        Pet pet = (Pet)obj;
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname) &&
                age==pet.age && trickLevel==pet.trickLevel;
    }
    @Override
    public int hashCode() {
        int result=17;
        result = 31 * result + species.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + age;
        result = 31 * result + trickLevel;
        return result;
    }

    @Override
    public String toString(){
        return "%s{nickname=%s, age=%d, trickLevel=%d, habits=[%s], can fly=%s, the number of legs=%d, has fur=%s}"
                .formatted(
                        this.species.getType(),
                        this.nickname,
                        this.age,
                        this.trickLevel,
                        String.join(", ", habits),
                        (this.species.isCanFly()) ? "Yes" : "No",
                        this.species.getNumberOfLegs(),
                        (this.species.isHasFur()) ? "Yes" : "No");
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human object is removed.");
    }
}
