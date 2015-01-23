//Bryden Robertson
public class Enemy{
    private int hp;
    private int level;
    private int dam;
    private int def;
    private String type;
    private boolean alive;
    public Enemy(int l, String t){
        type = t;
        level = l;
        hp = level*10;
        dam = level*5;
        def = level*2;
        alive = true;
        System.out.println(type+" appeared!");
    }

    public String defend(int d){
        String status;
        int defend = (int)(Math.random()*def);
        int damageDone = (d-defend);
        hp = hp-damageDone;
        if(hp <= 0){
            alive = false;
            status = "Attack did "+d+" damage and defeated enemy!";
        }
        else{
            status = "Attack did "+d+" damage and enemy defended "+defend+" damge.\nhp = "+hp;
        }
        return status;
    }

    public boolean getAlive(){
        return alive;
    }

    public int giveExp(){
        return level;
    }

    public boolean dropWeapon(){
        int check = (int)(Math.random()*level*10);
        //System.out.println(check);
        if(check>level*2){
            System.out.println("Weapon found!");
            return true;
        }
        else{
            System.out.println("Nothing found.");
            return false;
        }
    }

    public Weapon getRandWeapon(){
        int strength = (int)(Math.random()*level+1);
        System.out.println(strength);
        Weapon b = new Weapon(strength,"first",1,1,"stick");
        System.out.println(b);
        return b;
    }
}