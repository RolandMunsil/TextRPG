public class FireSpell extends Spell{
    private int burnDamage;
    private int spellDamage;
    private String spellName;
    public FireSpell(){
        spellName = "Fire";
        levelRequire = 1; //Anyone can use it
        manaRequire = 5; //can be any number
        burnDamage = 3;
    }
    public String getSpellName(){
        return spellName;
    }
    public String toString(){
        return spellName+" spell that can do "+spellDamage+" damage with "+burnDamage+" additional burn damage."
        +"\nIt requires level "+levelRequire+" and "+manaRequire+" mana to use.";
    }
}