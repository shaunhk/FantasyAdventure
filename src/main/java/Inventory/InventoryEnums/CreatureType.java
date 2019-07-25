package Inventory.InventoryEnums;

public enum CreatureType {
    OGRE(10),
    PHOENIX(4);

    private final int startHealth;

    CreatureType(int startHealth){
        this.startHealth = startHealth;
    }

    public int getStartHealth() {
        return this.startHealth;
    }
}

