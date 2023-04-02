package engine.classes;

import engine.race.Race;

public class Warrior extends Class {
    private int strength;

   public Warrior(String name, int health, int damage, Race race){
       super(name, health, damage, race);
        this.strength = 10;
   }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void attack1(Class target){
       //TODO Create the first skill for the Warrior
    }

}
