public class SpellTester{
    public static void main(String[] args){
        System.out.print('\f');
        Player w = new Player("W",1,1,1,1);
        Spell m = new FireSpell();
        System.out.println(m.getSpellName());
        System.out.println(m);
        w.spellAdd(m);
        System.out.println(w.listSpells());
    }
}