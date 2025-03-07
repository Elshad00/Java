public class RoboCat extends Pet {
    public RoboCat() {
        super();
        setSpecies(Species.ROBO_CAT);
    }

    public RoboCat(String nickname) {
        super(nickname);
        setSpecies(Species.ROBO_CAT);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.ROBO_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner " + super.getNickname() + ". I miss you!");
    }
}
