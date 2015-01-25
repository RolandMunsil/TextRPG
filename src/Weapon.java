public class Weapon extends Item {
    public int damage; //base damage
    public boolean enchanted; //if it is enchanted or not
    public int level; //level of the weapon. Strong level, stronger weapon!
    public double exp; //allows the weapon to go up a level? maybe include
    public String name; //what the weapon is called (if any);
    public int monetaryValue; //How much the weapon is worth
    public int size; //How big it is, bigger weapon has more potential, harder to use.
    public int hands; //How many hands it requires
    public String type; //What type it is

    public Weapon(int level, String name, int size, int hands, String type) {
        this.level = level;
        this.hands = hands;
        this.type = type;
        this.size = size;
        this.name = name;

        exp = 0;

        if (Math.random() * 10 > 7) {
            enchanted = true;
        }
        else {
            enchanted = false;
        }
        monetaryValue = level * 6; //value is determined by level
        if (enchanted) {
            monetaryValue *= 2; //if enchanted, more valuable
        }
    }

    public int getDamage() {
        return damage;
    }

    public boolean getEnchanted() {
        return enchanted;
    }

    public int getLevel() {
        return level;
    }

    public double getExp() {
        return exp;
    }

    public String getName() {
        return name;
    }

    public int getMonetaryValue() {
        return monetaryValue;
    }

    public int getSize() {
        return size;
    }

    public int getHands() {
        return hands;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        String enchantedString = "";
        if (enchanted) {
            enchantedString = "enchanted";
        }
        return "The " + enchantedString + " level " + level + " " + name + " is worth " + monetaryValue;
    }
}