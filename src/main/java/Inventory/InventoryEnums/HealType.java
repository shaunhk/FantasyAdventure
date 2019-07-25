package Inventory.InventoryEnums;

public enum HealType {
    HEALINGPOTION(3),
    HEALINGHERB(1);

    private final int healingValue;

    HealType(int healingValue){
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
