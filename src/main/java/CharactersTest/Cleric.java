package CharactersTest;
import CharactersTest.PlayCharacter;
import Inventory.Healer;

import java.util.ArrayList;

public class Cleric extends PlayCharacter {

    private ArrayList<Healer> tools;

    public Cleric() {
        setMaxHealth(10);
        this.tools = new ArrayList<Healer>();
        setCurrentHealth(10);
    }

    public ArrayList<Healer> getTools() {
        return tools;
    }

    public int getToolsAmount(){
        return this.tools.size();
    }

    public void addEquipment(Healer healer) {
        this.tools.add(healer);
    }
}
