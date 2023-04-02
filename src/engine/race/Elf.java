package engine.race;

public class Elf extends Race{
    private int intelligence;

    public Elf(String name, String description, int intelligence) {
        super(name, description);
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
