package model;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final String category; // potion, weapon, armor, rare

    public Item(String name, String category) {
        this.name = name;
        this.category = category.toLowerCase();
    }

    public String getName() { return name; }
    public String getCategory() { return category; }

    @Override
    public String toString() { return name + " (" + category + ")"; }
}
