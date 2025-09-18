package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends CharacterBase implements Serializable {
    private static final long serialVersionUID = 1L;
    private int level;
    private int experience;
    private List<Item> inventory = new ArrayList<>();

    public Player(String name) {
        super(name, 100, 20, 8);
        this.level = 1;
        this.experience = 0;
    }

    public void gainExperience(int xp) {
        experience += xp;
        while (experience >= level * 50) {
            experience -= level * 50;
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        health += 20;
        attack += 5;
        defense += 2;
        System.out.println("Leveled up! Now level " + level);
    }

    public void heal(int amount) {
        health = Math.min(getMaxHealth(), health + amount);
    }

    public int getMaxHealth() {
        return 100 + (level - 1) * 20;
    }

    public void addItem(Item item) { inventory.add(item); }
    public boolean useItem(String itemName) {
        for (Item it : new ArrayList<>(inventory)) {
            if (it.getName().equalsIgnoreCase(itemName)) {
                applyItemEffect(it);
                inventory.remove(it);
                return true;
            }
        }
        return false;
    }

    private void applyItemEffect(Item it) {
        switch (it.getCategory().toLowerCase()) {
            case "potion": heal(30); System.out.println("Used potion. HP: " + health); break;
            case "weapon": attack += 5; System.out.println("Equipped weapon. ATK:" + attack); break;
            case "armor": defense += 3; System.out.println("Equipped armor. DEF:" + defense); break;
            default: System.out.println("Used " + it.getName()); break;
        }
    }

    public List<Item> getInventory() { return new ArrayList<>(inventory); }
    public int getLevel() { return level; }
    public int getExperience() { return experience; }
}
