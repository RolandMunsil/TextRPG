import java.util.ArrayList;
public class Player {
    
    //Damage
//    private int physicalBaseDamage;
//    private int magicalBaseDamage;
//    private int rangedBaseDamage;
    
    //Stats
    private int strength;
    private int dexterity;
//    private int charisma;
//    private int intelligence;
    private int defense;
    
    //Qualities (yes it's not a good name)
    public String name;
    public int level;
    public double exp;
//    public int wealth;
    public int hp;
    public boolean isAlive;
    
    //Weapons
    private Weapon weapon;
//    private Weapon weapon2;
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

    public Player(String name, int hp, int strength, int dexterity, int defense) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
//        this.charisma = charisma;
//        this.intelligence = intelligence;
        this.defense = defense;

        level = 1;
        exp = 0;
//        wealth = 0;
        isAlive = true;
        this.hp = hp;

//        physicalBaseDamage = (level + strength + (dexterity / 2));
//        rangedBaseDamage = (level + dexterity + (strength / 2));
//        magicalBaseDamage = (level + intelligence + (dexterity / 2));
        
        weapon = new Weapon(level, "Skullcrusher Omega");
    }
    public void playerDeath(){
        System.out.println("You have died!");
//        wealth = wealth/2;
//        System.out.println("You have lost "+wealth+" wealth...");
    }
    
    public void hurt(int damageFromEnemy) {
        //In the range (defense / 2) to defense
        int defendedDamage = (int)((Math.random() + 1) / 2 * defense);
        //Ensure damage done is never negative
        int damageDone = Math.max(0, (damageFromEnemy - defendedDamage));
        hp = hp - damageDone;
        if (hp <= 0) {
            isAlive = false;
        }
    }

    public int gainExp(int gainedExp) {
        //20 exp = 1 level
        
        exp += gainedExp;
        int levelsGained = (int)(exp / 20);
        exp = exp % 20;
        
        
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

//    public void changeWealth(int moneyChange) {
//        wealth += moneyChange;
//    }
    
    private int calculateBaseDamage() {
        return (level + strength + (dexterity / 2));
    }

    public int getDamage() {
        //int damage = 10;//BDp+((int)(Math.random()*level));
        return 1 + (int)((weapon.baseDamage + calculateBaseDamage()) * (0.25 + (Math.random() * (level + weapon.level))));
    }

    public void assignWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

//    public Weapon getWeapon2() {
//        return weapon2;
//    }

//    public int getPhysicalBaseDamage() {
//        return physicalBaseDamage;
//    }
//
//    public int getMagicalBaseDamage() {
//        return magicalBaseDamage;
//    }
//
//    public int getRangedBaseDamage() {
//        return rangedBaseDamage;
//    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

//    public int getIntelligence() {
//        return intelligence;
//    }
//
//    public int getCharisma() {
//        return charisma;
//    }

    @Override
    public String toString() {
        return "name: " + name + "\nlevel: " + level;
    }
}