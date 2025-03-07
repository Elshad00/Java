public class Dog extends Pet implements Foul {
    public Dog() {
        super();
        setSpecies(Species.DOG);
    }

    public Dog(String nickname) {
        super(nickname);
        setSpecies(Species.DOG);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner " + super.getNickname() + ". I miss you!");
    }
}
