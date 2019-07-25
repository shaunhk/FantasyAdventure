package Inventory;

import Inventory.InventoryEnums.HealType;

public class Healer {

    private HealType healType;

    public Healer(HealType healType){
        this.healType = healType;
    }

    public HealType getHealType() {
        return this.healType;
    }

    public int getHealValue() {
        return this.healType.getHealingValue();
    }
}
