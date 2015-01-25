public class fireSpellasdf extends Spell{
    private int burnDamage;
    private int spellDamage;
    public fireSpellasdf(){
        spellName = "Fire";
        levelRequire = 1; //Anyone can use it
        manaRequire = 5; //can be any number
        burnDamage = 3;
    }
    public String toString(){
        return spellName+" spell that can do "+spellDamage+" damage with "+burnDamage+" additional burn damage."
        +"\nIt requires level "+levelRequire+" and "+manaRequire+" mana to use.";
    }
}