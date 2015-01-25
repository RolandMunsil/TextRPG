public class Enemy {
    public int hp;
    public int level;
    private int baseDamage;
    private int defense;
    public String type;
    public boolean isAlive;

    public Enemy(int level, String type) {
        this.type = type;
        this.level = level;

        hp = level * 10;
        baseDamage = level * 5;
        defense = level * 2;
        isAlive = true;
    }

    public void hurt(int damageFromPlayer) {
        int defendedDamage = (int)(Math.random() * defense);
        int damageDone = Math.max(0, (damageFromPlayer - defendedDamage));
        hp = hp - damageDone;
        if (hp <= 0) {
            isAlive = false;
        }
    }

    public int getEXP() {
        return level;
    }

    public boolean droppedWeapon() {
        if (Math.random() * level * 10 > 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public Weapon getRandWeapon() {
        int level = (int)(Math.random() * this.level + 1);
        Weapon weapon = new Weapon(level, "Stick", 1, 1, "stick");
        return weapon;
    }
}