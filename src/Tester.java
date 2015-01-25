import java.util.Scanner;
public class Tester{
    public static void main(String[] args){
    	//Clear the console (only works in BlueJ)
        System.out.print('\f');
        
        Scanner in = new Scanner(System.in);
        String input = "y";
        Enemy enemy = new Enemy(1, "blob");
        Player player  = new Player("Alpha", 1,1,1,1);

        while(input.equals("y")){
            System.out.println("Attack?");
            input = in.nextLine();
            
            System.out.println(enemy.defend(player.attackP()));
            
            if(!enemy.getIsAlive()){
                player.gainExp(enemy.giveExp());
                if(enemy.dropWeapon()){
                    player.assignWeapon(enemy.getRandWeapon());
                }
                
                System.out.println("Look again?");
                input = in.nextLine();
                if(input.equals("y")){
                    enemy = new Enemy(1, "blob");
                }
            }
            //Clear the console (only works in BlueJ)
            System.out.print('\f');
        }
    }
}