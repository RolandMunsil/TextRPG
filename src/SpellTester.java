public class SpellTester{
    public static void main(String[] args){
        System.out.print('\f');
        Player player = new Player("W",1,1,1,1);
        Spell spell = new FireSpell();
        System.out.println(spell.getSpellName());
        System.out.println(spell);
        player.spellAdd(spell);
        System.out.println(player.listSpells());
    }
}