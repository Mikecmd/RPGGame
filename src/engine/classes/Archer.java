package engine.classes;

import engine.race.Race;

public class Archer extends Class {
    private int dexterity;

    public Archer(String name, int level, int health, int damage, Race race) {
        super(name, health, damage, race);
        this.dexterity = 10;
    }

    public int getDexterity() {
        return dexterity;
    }

    @Override
    public void attack1(Class target) {
        //TODO Create the first skill for the Warrior
    }
}
