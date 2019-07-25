package CharactersTest.Mages;

import CharactersTest.PlayCharacter;
import Inventory.Creature;
import Inventory.Spell;

public abstract class Mage extends PlayCharacter {

    private Spell spell;
    private Creature creature;

    public Mage(Spell spell, Creature creature){
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }


    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
