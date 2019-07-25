package CharactersTest;

import CharactersTest.Mages.Wizard;
import Inventory.Creature;
import Inventory.InventoryEnums.CreatureType;
import Inventory.InventoryEnums.SpellType;
import Inventory.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Spell spell;
    private Spell spell2;
    private Creature creature;
    private Creature creature2;

    @Before
    public void setup(){
        spell = new Spell(SpellType.FIREBALL);
        spell2 = new Spell(SpellType.ICESPIKE);
        creature = new Creature(CreatureType.PHOENIX);
        creature2 = new Creature(CreatureType.OGRE);
        wizard = new Wizard(spell, creature);
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(spell2);
        assertEquals(spell2, wizard.getSpell());
    }

    @Test
    public void hasCreature(){
        assertEquals(creature, wizard.getCreature());
    }

    @Test
    public void canChangeCreature(){
        wizard.changeCreature(creature2);
        assertEquals(creature2, wizard.getCreature());
    }
}
