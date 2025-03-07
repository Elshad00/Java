public class DomesticCat extends Pet implements Foul {
    public DomesticCat() {
        super();
        setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat(String nickname) {
        super(nickname);
        setSpecies(Species.DOMESTIC_CAT);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOMESTIC_CAT);
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
