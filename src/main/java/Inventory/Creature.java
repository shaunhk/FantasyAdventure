package Inventory;

import Inventory.InventoryEnums.CreatureType;

public class Creature {

    private CreatureType creatureType;
    private int health;

    public Creature(CreatureType creatureType) {
        this.creatureType = creatureType;
        this.health = creatureType.getStartHealth();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void takeDamage(int damage){
        setHealth(this.health - damage);
        if(this.health <= 0){
            this.health = 0;
        }
    }
}
