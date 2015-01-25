public class spellTesterasdf{
    public static void main(String[] args){
        System.out.print('\f');
        Player w = new Player("W",1,1,1,1);
        Spell q = new fireSpellasdf();
        System.out.println(q);
        w.spellAdd(q);
        System.out.println(w.listSpells());
    }
}