public class Player {
    private String name;
    private int physicalBaseDamage;
    private int magicalBaseDamage;
    private int rangedBaseDamage;
    private int strength;
    private int dexterity;
    private int charisma;
    private int intelligence;
    private int level;
    private double exp;
    private Weapon weapon1;
    private Weapon weapon2;
    private int wealth;

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

        physicalBaseDamage = (level + strength + (dexterity / 2));
        rangedBaseDamage = (level + dexterity + (strength / 2));
        magicalBaseDamage = (level + intelligence + (dexterity / 2));
    }

    public void gainExp(int gainedExp) {
        System.out.println("You gained " + gainedExp + " exp!");

        int levelsGained = 0;
        exp += gainedExp;
        while (exp >= 10) {
            exp -= 10;
            levelsGained++;
        }
        if (levelsGained > 0) {
            level += levelsGained;

            System.out.println("Congrats! you have gone up " + levelsGained + " level(s)");
            System.out.println("You are now level " + level + "!");
        }
    }

    public void changeWealth(int moneyChange) {
        wealth += moneyChange;
        if (moneyChange > 0) {
            System.out.println("You have gained " + moneyChange + " money.");
        }
        else if (moneyChange < 0) {
            System.out.println("You have lost " + moneyChange + " money.");
        }
    }

    public int attackP() {
        //int damage = 10;//BDp+((int)(Math.random()*level));
        return 10;
    }

    public void assignWeapon(Weapon weapon) {
        weapon1 = weapon;
    }

    public Weapon getWeapon() {
        return weapon1;
    }

    public String getName() {
        return name;
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

    public int getLevel() {
        return level;
    }

    public double getExp() {
        return exp;
    }

    public String toString() {
        return "name: " + name + "\nlevel: " + level + "\nmoney: " + wealth;
    }
}