package InventoryTest;

import Inventory.Creature;
import Inventory.InventoryEnums.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature creature;
    private CreatureType creatureType;

    @Before
    public void setup(){
        creature = new Creature(creatureType.PHOENIX);
    }

    @Test
    public void creatureHasHealth(){
        assertEquals(4, creature.getHealth());
    }

    @Test
    public void canTakeDamage(){
        creature.takeDamage(1);
        assertEquals(3, creature.getHealth());
    }

    @Test
    public void creatureCanDie(){
        creature.takeDamage(5);
        assertEquals(0, creature.getHealth());
    }
}
