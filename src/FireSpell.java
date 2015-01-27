public class FireSpell extends Spell{
    private int burnDamage;
    
    public FireSpell(){
        name = "Fire";
        levelRequired = 1; //Anyone can use it
        manaRequired = 5; //can be any number
        burnDamage = 3;
    }

    public String toString(){
        return name+" spell that can do "+damage+" damage with "+burnDamage+" additional burn damage."
        +"\nIt requires level "+levelRequired+" and "+manaRequired+" mana to use.";
    }
}