public class Enemy {
    //TODO: move to Tester or more general class?
    static String[] randomWeaponNames = { "Stick", "Atom Bomb", "Rapier", "Inferno Sword", "Bone Sabre", "Scimitar", "pair of Poison Daggers" };
    
    public int hp;
    public int level;
    private int baseDamage;
    private int defense;
    public String type;
    public boolean isAlive;

    public Enemy(int level, String type) {
        this.type = type;
        this.level = level;

        hp = level * 25;
        baseDamage = level * 5;
        defense = level * 5;
        isAlive = true;
    }

    public void hurt(int damageFromPlayer) {
        //In the range (defense / 2) to defense
        int defendedDamage = (int)((Math.random() + 1) / 2 * defense);
        //Always do at least 1 damage - feels better
        int damageDone = Math.max(1, (damageFromPlayer - defendedDamage));
        hp = hp - damageDone;
        if (hp <= 0) {
            isAlive = false;
        }
    }

    public int getEXPWorth() {
        return (int)(level * 10 * (Math.random() + 1));
    }

    public boolean droppedWeapon() {
        return ((int)(Math.random() * level * 2) == 0);
    }

    //TODO: move to Tester or more general class?
    public Weapon getRandWeapon() {
        int level = (int)((Math.random() + 1.5) * this.level);
        String name = randomWeaponNames[(int)(Math.random() * randomWeaponNames.length)];
        Weapon weapon = new Weapon(level, name);
        return weapon;
    }
}