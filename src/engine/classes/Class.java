package engine.classes;

import engine.race.Race;

public class Class {
    private String name;
    private Race race;
    private int level;
    private int health;
    private int damage;

    public Class(String name, int health, int damage, Race race) {
        this.name = name;
        this.level = 1;
        this.health = health;
        this.damage = damage;
        this.race = race;
    }

    public void attack1(Class target){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
