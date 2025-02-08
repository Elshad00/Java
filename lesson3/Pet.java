public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    Pet(){}

    Pet(String nickname){
        this.nickname = nickname;
    }

    Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String toString(){
        return this.species + "{nickname='" + this.nickname + "', age=" + this.age + ", trickLevel=" + this.trickLevel + ", habits=[" +
                String.join(", ", habits) + "]}";
    }

    void eat(){
        System.out.println("I am eating");
    }

    void respond(){
        System.out.println("Hello, owner " + this.nickname + ". I miss you!");
    }

    void foul(){
        System.out.println("I need to cover it up");
    }
}
