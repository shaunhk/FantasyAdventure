package InventoryTest;

import Inventory.Healer;
import Inventory.InventoryEnums.HealType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    private Healer potion;

    @Before
    public void setup(){
        potion = new Healer(HealType.HEALINGPOTION);
    }

    @Test
    public void canGetHealingValue(){
        assertEquals(3, potion.getHealValue());
    }
}
