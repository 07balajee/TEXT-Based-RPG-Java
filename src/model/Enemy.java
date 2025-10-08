package model;

import java.io.Serializable;

public class Enemy extends CharacterBase implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int rewardXP;

    public Enemy(String name, int health, int attack, int defense, int rewardXP)
    {
        super(name, health, attack, defense);
        this.rewardXP = rewardXP;
    }

    public int getRewardXP()
     {
         return rewardXP; 
     }
}
