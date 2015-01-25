public class Weapon extends Item{
    public int dam; //base damage
    public boolean ench; //if it is enchanted or nah
    public int level; //level of the weapon. Strong level, stronger weapon!
    public double exp; //allows the weapon to go up a level? maybe include
    public String name; //what the weapon is called (if any);
    public int value; //How muc hteh weapon is worth
    public int size; //How big it is, bigger weapon has more potential, harder to use.
    public int hands; //How many hands it requires
    public String type; //What type it is
    public Weapon(int l, String n, int s, int h, String t){
        level = l;
        hands = h;
        type = t;
        exp = 0; //experience points starts at 0
        size = s;
        name = n;
        int enchant = (int)(Math.random()*10); //random to see if item is enchanted
        if(enchant > 7){
            ench = true;
        }
        else{
            ench = false;
        }
        value = level*6; //value is determined by level
        if(ench==true){
            value = value*2; //if enchanted, more valuable
        }
    }
    public int getDamage(){
        return dam;
    }
    public boolean getEnchanted(){
        return ench;
    }
    public int getLevel(){
        return level;
    }
    public double getExp(){
        return exp;
    }
    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
    public int getSize(){
        return size;
    }
    public int getHands(){
        return hands;
    }
    public String getType(){
        return type;
    }
    public String toString(){
        String e = "";
        if(ench = true){
            e = "enchanted";
        }
        return "The "+e+" level "+level+" "+name+" is worth "+value;
    }
}