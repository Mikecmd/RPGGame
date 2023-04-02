package engine.race;

public class Orc extends Race{
    private int strength;

    public Orc(String name, String description, int strength) {
        super(name, description);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
