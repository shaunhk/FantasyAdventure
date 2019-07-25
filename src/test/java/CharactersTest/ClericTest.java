package CharactersTest;

import Inventory.Healer;
import Inventory.InventoryEnums.HealType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private Healer potion;

    @Before
    public void setup(){
        cleric = new Cleric();
        potion = new Healer(HealType.HEALINGPOTION);
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
}
