package CharactersTest.Mages;

import Inventory.Creature;
import Inventory.Spell;

public class Warlock extends Mage {
    public Warlock(Spell spell, Creature creature) {
        super(spell, creature);
        setMaxHealth(8);
        setCurrentHealth(10);
    }
}
