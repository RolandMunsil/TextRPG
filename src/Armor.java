public class Armor extends Item{
    private int def;
    private boolean enchanted;
    private int level;
    private double exp;
    private String name;
    private int monetaryValue;
    private int size;
    private int hands;
    private String type;
    
    public Armor(int level, String name, int size, int hands, String type){
        this.level = level;
        this.hands = hands;
        this.type = type;
        this.size = size;
        this.name = name;
        
        exp = 0;
        
        if(Math.random()*10 > 7){
        	enchanted = true;
        }
        else{
        	enchanted = false;
        }
        monetaryValue = level*6;
        if(enchanted){
        	monetaryValue *= 2;
        }
    }
    public int getDefense(){
        return def;
    }
    public boolean getEnchanted(){
        return enchanted;
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
    public int getMonetaryValue(){
        return monetaryValue;
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
        String enchantedString = "";
        if(enchanted){
        	enchantedString = "enchanted";
        }
        return "The "+enchantedString+" level "+level+" "+name+" is worth "+monetaryValue+" and has "+def+" defense";
    }
}