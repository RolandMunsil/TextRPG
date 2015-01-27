import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {       
        System.out.print('\f');//Moved command here becuase it clears the screen at the start of the program. Only works in BlueJ
        Scanner in = new Scanner(System.in);
        String input = "n";
        
        String userName = "";
        System.out.println("Welcome to the world, young adventurer."); //Give a little more of a game feel
        do {
            System.out.println("And what are you called?");
            userName = in.nextLine();
            System.out.println("So you are called "+userName+", is that correct?");
            input = in.nextLine(); //if input = "n", the user will be able to re-enter their name.
        } while(input.equals("n"));
            
        Player player = new Player(userName, 1, 1, 1, 1);
        input = "y";
        while (input.equals("y")) {

            Enemy enemy = new Enemy(1, "Blob");
            System.out.println("A level " + enemy.level + " " + enemy.type + " appeared!");

            while (enemy.isAlive) {
                System.out.print("Attack? ");
                input = in.nextLine();
                if (!input.equals("y")) {
                    System.out.println("OK. Goodbye!");
                    return;
                }

                //Idea for how attacks could work:
                //some sort of Attacker interface, then have an Attack method with params attacker and defender.
                //it woulc calculate damage, defense, hp lost, etc.

                int playerDamage = player.getDamage();
                int prevHp = enemy.hp;
                enemy.hurt(playerDamage);

                System.out.println(player.name + " attacked with the " + player.getWeapon1().name + ".");
                System.out.println(player.name + " did " + (prevHp - enemy.hp) + " damage to the " + enemy.type + ".");
            }
            System.out.println();
            System.out.println("The " + enemy.type + " was killed!");

            int enemyEXP = enemy.getEXP();
            int levelsGained = player.gainExp(enemyEXP);
            String expWord = enemyEXP == 1 ? "experience point" : "experience points";

            System.out.println(player.name + " gained " + enemyEXP + " " + expWord + "!");

            if (levelsGained > 0) {
                String levelWord = levelsGained == 1 ? "level" : "levels";
                System.out.println("Congrats! " + player.name + " has gone up " + levelsGained + levelWord + "!");
                System.out.println("They are now level " + player.level + ".");
            }

            if (enemy.droppedWeapon()) {
                Weapon weapon = enemy.getRandWeapon();
                player.assignWeapon(weapon);
                System.out.println("Enemy dropped a level " + weapon.level + " " + weapon.name + ".");
                System.out.println(player.name + " equipped the " + weapon.name + "!");
            }

            System.out.print("Look for another monster? ");
            input = in.nextLine();
        }
    }
}