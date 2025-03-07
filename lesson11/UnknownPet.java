public class UnknownPet extends Pet {
    public UnknownPet() {
        super();
        setSpecies(Species.UNKNOWN); // Set species to DOG
    }

    public UnknownPet(String nickname) {
        super(nickname);
        setSpecies(Species.UNKNOWN);
    }

    public UnknownPet(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.UNKNOWN);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner " + super.getNickname() + ". I miss you!");
    }
}
