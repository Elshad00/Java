import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(){}

    public Pet(String nickname){
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
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

    public void setSpecies(String species) {
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

    public void respond(){
        System.out.println("Hello, owner " + this.nickname + ". I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if(that==null || this.getClass()!=that.getClass()) {
            return false;
        }
        Pet thatPet = (Pet)that;
        return Objects.equals(species, thatPet.species) &&
                Objects.equals(nickname, thatPet.nickname) &&
                age==thatPet.age && trickLevel==thatPet.trickLevel;
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
        return "%s{nickname=%s, age=%d, trickLevel=%d, habits=[%s]}".formatted(this.species, this.nickname, this.age, this.trickLevel, String.join(", ", habits));
    }
}
