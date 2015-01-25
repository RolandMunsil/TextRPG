public class Enemy {
    private int hp;
    private int level;
    private int damage;
    private int defense;
    private String type;
    private boolean isAlive;

    public Enemy(int level, String type) {
        this.type = type;
        this.level = level;

        hp = level * 10;
        damage = level * 5;
        defense = level * 2;
        isAlive = true;

        System.out.println(type + " appeared!");
    }

    public String defend(int damageFromPlayer) {
        String status;

        int defend = (int)(Math.random() * defense);
        int damageDone = (damageFromPlayer - defend);
        hp = hp - damageDone;
        if (hp <= 0) {
            isAlive = false;
            status = "Attack did " + damageFromPlayer + " damage and defeated enemy!";
        }
        else {
            status = "Attack did " + damageFromPlayer + " damage and enemy defended " + defend + " damge.\nhp = " + hp;
        }
        return status;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public int giveExp() {
        return level;
    }

    public boolean dropWeapon() {
        int check = (int)(Math.random() * level * 10);
        //System.out.println(check);
        if (check > level * 2) {
            System.out.println("Weapon found!");
            return true;
        }
        else {
            System.out.println("Nothing found.");
            return false;
        }
    }

    public Weapon getRandWeapon() {
        int strength = (int)(Math.random() * level + 1);
        System.out.println(strength);
        Weapon weapon = new Weapon(strength, "first", 1, 1, "stick");
        System.out.println(weapon);
        return weapon;
    }
}