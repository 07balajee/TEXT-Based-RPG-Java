package model;

import java.io.Serializable;

public abstract class CharacterBase implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected int health;
    protected int attack;
    protected int defense;

    public CharacterBase(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public boolean isAlive() { return health > 0; }

    public void takeDamage(int dmg) {
        int actual = Math.max(0, dmg - defense);
        health = Math.max(0, health - actual);
    }

    public int getAttackValue() { return attack; }
    public String getName() { return name; }
    public int getHealth() { return health; }

    @Override
    public String toString() {
        return name + " [HP:" + health + " ATK:" + attack + " DEF:" + defense + "]";
    }
}
