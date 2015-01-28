import java.util.Scanner;

public class Tester {
    
    //TODO: have an enum or seperate classes for different enemy types?
    static String[] enemyTypes = { "Blob", "horde of Killer Bees", "Core Hound", "Scary Snake" };
    
    public static void main(String[] args) {       
        System.out.print('\f');//Clears the screen at the start of the program. Only works in BlueJ
        Scanner in = new Scanner(System.in);

        String userName = "";
        System.out.println("Welcome to the world, young adventurer."); //Give a little more of a game feel
        do {
            System.out.println("And what are you called?");
            userName = in.nextLine();
            System.out.println("So you are called "+userName+", is that correct?"); 
        } while(in.nextLine().startsWith("n")); //if input starts with "n", the user will be able to re-enter their name.
            
        Player player = new Player(userName, 1, 1, 1, 1);
        String input = "y";
        while (input.startsWith("y")) {

            Enemy enemy = generateRandomEnemy(player.level);
            System.out.println("A level " + enemy.level + " " + enemy.type + " appeared!");

            while (enemy.isAlive) {
                //Just wait for the player to press a key
                in.nextLine();
                
                //System.out.print("Attack? ");
                //input = in.nextLine();
                //if (!input.startsWith("y")) {
                //    System.out.println("OK. Goodbye!");
                //    return;
                //}

                //Idea for how attacks could work:
                //some sort of Attacker interface, then have an Attack method with params attacker and defender.
                //it would calculate damage, defense, hp lost, etc.

                int playerDamage = player.getDamage();
                int prevHp = enemy.hp;
                enemy.hurt(playerDamage);

                //System.out.println(player.name + " attacked with the " + player.getWeapon1().name + ".");
                System.out.println(player.name + " did " + (prevHp - enemy.hp) + " damage to the " + enemy.type + ".");
                
                //TODO: make enemy attack player.
            }
            System.out.println();
            System.out.println("The " + enemy.type + " was killed!");

            int enemyEXP = enemy.getEXPWorth();
            int levelsGained = player.gainExp(enemyEXP);
            String expWord = enemyEXP == 1 ? "experience point" : "experience points";

            System.out.println(player.name + " gained " + enemyEXP + " " + expWord + "!");

            if (levelsGained > 0) {
                String levelWord = levelsGained == 1 ? " level" : " levels";
                System.out.println("Congrats! " + player.name + " has gone up " + levelsGained + levelWord + "!");
                System.out.println(player.name + " is now level " + player.level + ".");
            }

            if (enemy.droppedWeapon()) {
                Weapon weapon = enemy.getRandWeapon();

                System.out.println("Enemy dropped a level " + weapon.level + " " + weapon.name + ". Would you like to equip it?");
                if(in.nextLine().startsWith("y"))
                {
                    player.assignWeapon(weapon);
                    System.out.println(player.name + " equipped the " + weapon.name + "!");
                }
            }

            System.out.print("Look for another monster? ");
            input = in.nextLine();
        }
    }
    
    public static Enemy generateRandomEnemy(int playerLevel)
    {
        //range is ±(player level / 2) from the player's level.
        int enemyLevel = (int)((Math.random() - .5) * playerLevel) + playerLevel;
        
        String enemyType = enemyTypes[(int)(Math.random() * enemyTypes.length)];
        
        return new Enemy(enemyLevel, enemyType);
    }
}