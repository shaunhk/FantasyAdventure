package Inventory;

import Behaviours.IMartial;
import Inventory.InventoryEnums.SpellType;

public class Spell implements IMartial {

    private SpellType spellType;

    public Spell(SpellType spellType){
        this.spellType = spellType;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }
}
