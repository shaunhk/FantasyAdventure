package CharactersTest;

import CharactersTest.Mages.Warlock;
import CharactersTest.Mages.Wizard;
import Inventory.Creature;
import Inventory.Healer;
import Inventory.InventoryEnums.CreatureType;
import Inventory.InventoryEnums.HealType;
import Inventory.InventoryEnums.SpellType;
import Inventory.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private Healer potion;
    private Warlock wizard;
    private Spell spell;
    private Creature creature;

    @Before
    public void setup(){
        cleric = new Cleric();
        creature = new Creature(CreatureType.PHOENIX);
        spell = new Spell(SpellType.FIREBALL);
        potion = new Healer(HealType.HEALINGPOTION);
        wizard = new Warlock(spell, creature);
    }

    @Test
    public void has10MaxHealth(){
        assertEquals(10, cleric.getMaxHealth());
    }

    @Test
    public void startsWithNoTools(){
        assertEquals(0, cleric.getToolsAmount());
    }

    @Test
    public void canAddHealingEquipment(){
        cleric.addEquipment(potion);
        assertEquals(1, cleric.getToolsAmount());
    }

    @Test
    public void has10Health(){
        assertEquals(10, cleric.getCurrentHealth());
    }

    @Test
    public void canTakeDamage(){
        cleric.takeDamage(2);
        cleric.takeDamage(2);
        assertEquals(6, cleric.getCurrentHealth());
    }

    @Test
    public void healthCantGoBelow0(){
        cleric.takeDamage(12);
        assertEquals(0, cleric.getCurrentHealth());
    }

    @Test
    public void canHealOthers(){
        cleric.addEquipment(potion);
        wizard.takeDamage(4);
        cleric.heal(wizard, potion);
        assertEquals(8, wizard.getCurrentHealth());
        assertEquals(0, cleric.getToolsAmount());
    }
}
