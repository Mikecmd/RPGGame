package engine.classes;

import engine.race.Race;

public class Healer extends Class {
    private int magic;

    public Healer(String name, int health, int damage, Race race) {
        super(name, health, damage, race);
        this.magic = 10;
    }

    public int getMagic() {
        return magic;
    }

    public void heal(Character target) {
        // code to heal target
    }
    @Override
    public void attack1(Class target){
        //TODO Create the first skill for the Healer
    }
}
