package engine.race;

public class Human extends Race{
    private int charisma;

    public Human(String name, String description) {
        super(name, description);
        this.charisma = 10;
    }

    public int getCharisma() {
        return charisma;
    }
}
