public class Spell{
    public int spellDamage;
    public String spellName;
    public int levelRequire;
    public int manaRequire;//or whatever we want to cal it. Mana, energy, etc.
    public Spell(){
        
    }
    public String getSpellName(){ //has to be in this class for the method "getSpellName" to work
        return spellName;
    }
}