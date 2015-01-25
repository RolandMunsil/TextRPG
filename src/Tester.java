import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "y";
        Player player = new Player("Evangeline, Slayer of Monstrosities", 1, 1, 1, 1);

        while (input.equals("y")) {
            //Clear the console (only works in BlueJ)
            System.out.print('\f');

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