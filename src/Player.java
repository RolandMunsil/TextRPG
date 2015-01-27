import java.util.ArrayList;
public class Player {
    public String name;
    private int physicalBaseDamage;
    private int magicalBaseDamage;
    private int rangedBaseDamage;
    private int strength;
    private int dexterity;
    private int charisma;
    private int intelligence;
    public int level;
    public double exp;
    private Weapon weapon1;
    private Weapon weapon2;
    public int wealth;
    private ArrayList<Spell> spells = new ArrayList<Spell>();
    /*
     * Variables to add?:
     * array of spells
     * array of items that Player has
     *
     * Methods to add?
     * use spell
     * die
     * stat boosting
     * equipping items
     */

    public Player(String name, int strength, int dexterity, int charisma, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.intelligence = intelligence;

        level = 1;
        exp = 0;
        wealth = 0;
        weapon1 = new Weapon(level, "Skullcrusher Omega", 10, 2, "Bastard sword");

        physicalBaseDamage = (level + strength + (dexterity / 2));
        rangedBaseDamage = (level + dexterity + (strength / 2));
        magicalBaseDamage = (level + intelligence + (dexterity / 2));
    }
    public void playerDeath(){
        System.out.println("You have died!");
        wealth = wealth/2;
        System.out.println("You have lost "+wealth+" wealth...");
    }

    public int gainExp(int gainedExp) {
        int levelsGained = 0;
        exp += gainedExp;
        while (exp >= 10) {
            exp -= 10;
            levelsGained++;
        }
        level += levelsGained;
        return levelsGained;
    }
    public void addSpell(Spell newSpell){
        spells.add(newSpell);
    }
    public ArrayList<String> getSpellNames(){
        ArrayList<String> spellNames = new ArrayList<String>(spells.size());
        for(Spell spell : spells)
        {
            spellNames.add(spell.name);
        }
        return spellNames;
    }

    public void changeWealth(int moneyChange) {
        wealth += moneyChange;
    }

    public int getDamage() {
        //int damage = 10;//BDp+((int)(Math.random()*level));
        return (weapon1.baseDamage + physicalBaseDamage) * (1 + (int)(Math.random() * (level + weapon1.level)));
    }

    public void assignWeapon(Weapon weapon) {
        weapon1 = weapon;
    }

    public Weapon getWeapon1() {
        return weapon1;
    }

    public Weapon getWeapon2() {
        return weapon2;
    }

    public int getPhysicalBaseDamage() {
        return physicalBaseDamage;
    }

    public int getMagicalBaseDamage() {
        return magicalBaseDamage;
    }

    public int getRangedBaseDamage() {
        return rangedBaseDamage;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nlevel: " + level + "\nmoney: " + wealth;
    }
}