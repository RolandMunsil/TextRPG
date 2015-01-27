public class ManaPotion extends Item{
    private int manaRestored;
    private int level;
    private String name;
    public ManaPotion(String n, int l){
        name = n;
        level = l;
        manaRestored = level;
    }
}