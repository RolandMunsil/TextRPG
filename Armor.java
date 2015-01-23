public class Armor extends Item{
    private int def;
    private boolean ench;
    private int level;
    private double exp;
    private String name;
    private int value;
    private int size;
    private int hands;
    private String type;
    public Armor(int l, String n, int s, int h, String t){
        level = l;
        hands = h;
        type = t;
        exp = 0;
        size = s;
        name = n;
        int enchant = (int)(Math.random()*10);
        if(enchant > 7){
            ench = true;
        }
        else{
            ench = false;
        }
        value = level*6;
        if(ench==true){
            value = value*2;
        }
    }
    public int getDefense(){
        return def;
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
        return "The "+e+" level "+level+" "+name+" is worth "+value+" and has "+def+" defense";
    }
}