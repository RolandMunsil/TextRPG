public class ManaPotion extends Item{
    private int manaRestored;

    public ManaPotion(String name, int level){
        this.name = name;
        this.level = level;
        manaRestored = level;
    }
}