public class SpellTester{
    public static void main(String[] args){
        System.out.print('\f');
        Player player = new Player("W",1,1,1,1);
        Spell spell = new FireSpell();
        System.out.println(spell.name);
        System.out.println(spell);
        player.addSpell(spell);
        System.out.println(player.getSpellNames());
    }
}