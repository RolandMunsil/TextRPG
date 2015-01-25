public class Player{
    private String name;
    private int BDp;
    private int BDm;
    private int BDr;
    private int str;
    private int dex;
    private int cha;
    private int itl;
    private int level;
    private double exp;
    private Weapon w1;
    private Weapon w2;
    private int wealth;
    /*Variable to add?:
     * array of spells
     * array of items that Player has
     * 
     * Methods to add?
     * use spell
     * die
     * stat boosting
     * equipping items
     */
    public Player(String n, int s, int d, int c, int i){
        name = n;
        str = s;
        dex = d;
        cha = c;
        itl = i;
        level = 1;
        exp = 0;
        BDp = (level+str+(dex/2));
        BDr = (level+dex+(str/2));
        BDm = (level+itl+(dex/2));
        wealth = 0;
    }

    public void gainExp(int a){
        boolean check = true;
        int LC = 0;
        exp = exp+a;
        while (check == true){
            if(exp >=10){
                level++;
                exp = exp-10;
                LC++;
            }
            else{
                check = false;
            }
        }
        System.out.println("You gained "+a+" exp!");
        if(LC>0){
            System.out.println("Congrats! you have gone up "+LC+" level(s)");
            System.out.println("You are now level "+level+"!");
        }
    }

    public void changeWealth(int a){
        wealth = wealth+a;
        if(a>0){
            System.out.println("You have gained "+a+" money.");
        }
        else if(a<0){
            System.out.println("You have lost "+a+" money.");
        }
    }

    public int attackP(){
        int damage = 10;// BDp+((int)(Math.random()*level));
        return damage;
    }

    public void assignWeapon(Weapon a){
        w1 = a;
    }

    public Weapon getWeapon(){
        return w1;
    }

    public String getName(){
        return name;
    }

    public Weapon getW1(){
        return w1;
    }

    public Weapon getW2(){
        return w2;
    }

    public int getBDp(){
        return BDp;
    }

    public int getBDm(){
        return BDm;
    }

    public int getBDr(){
        return BDr;
    }

    public int getStr(){
        return str;
    }

    public int getDex(){
        return dex;
    }

    public int getItl(){
        return itl;
    }

    public int getCha(){
        return cha;
    }

    public int getLevel(){
        return level;
    }

    public double getExp(){
        return exp;
    }

    public String toString(){
        return "name: "+name+"\nlevel: "+level+"\nmoney: "+wealth;
    }
}