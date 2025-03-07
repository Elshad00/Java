public class Fish extends Pet implements Foul {
    public Fish() {
        super();
        setSpecies(Species.FISH);
    }

    public Fish(String nickname) {
        super(nickname);
        setSpecies(Species.FISH);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner " + super.getNickname() + ". I miss you!");
    }
}
