public class HealthPotion extends Item{
    private int healthRestored;
    public HealthPotion(String name, int level){
        this.name = name;
        this.level = level;
        healthRestored = level;
    }
}