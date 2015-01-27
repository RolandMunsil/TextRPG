public class HealthPotion extends Item{
    private int healthRestored;
    private int level;
    private String name;
    public HealthPotion(String n, int l){
        name = n;
        level = l;
        healthRestored = level;
    }
}