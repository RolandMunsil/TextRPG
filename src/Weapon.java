public class Weapon extends Item {
    public int baseDamage; //base damage
    //public boolean enchanted; //if it is enchanted or not
    //public double exp; //allows the weapon to go up a level? maybe include
    public String name; //what the weapon is called (if any);
    //public int size; //How big it is, bigger weapon has more potential, harder to use.
    //public int hands; //How many hands it requires
    //public String type; //What type it is

    public Weapon(int level, String name /*, int size, int hands, String type */) {
        this.level = level;
        this.baseDamage = level * 5;
        //this.hands = hands;
        //this.type = type;
        //this.size = size;
        this.name = name;

        //exp = 0;
        
        //if (Math.random() * 10 > 7) {
        //    enchanted = true;
        //}
        //else {
        //    enchanted = false;
        //}
        //monetaryValue = level * 6;
        //if (enchanted) {
        //    monetaryValue *= 2; //if enchanted, more valuable
        //}
    }
}