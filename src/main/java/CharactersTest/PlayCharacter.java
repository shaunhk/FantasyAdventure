package CharactersTest;

public abstract class PlayCharacter {

    private int gold;
    private int maxHealth;
    private int currentHealth;

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public PlayCharacter(){
        this.gold = 0;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void takeDamage(int damage){
        setCurrentHealth(this.currentHealth - damage);
        if(this.currentHealth < 0){
            this.currentHealth = 0;
        }
    }
}
