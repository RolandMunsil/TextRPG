import java.util.Scanner;
public class Tester{
    public static void main(String[] args){
        System.out.print('\f');
        Scanner in = new Scanner(System.in);
        String input;
        Enemy w = new Enemy(1, "blob");
        Player me  = new Player("Alpha", 1,1,1,1);
        input = "y";
        while(input.equals("y")){
            System.out.println("Attack?");
            input = in.nextLine();
            System.out.println(w.defend(me.attackP()));
            if(w.getAlive()==false){
                me.gainExp(w.giveExp());
                if(w.dropWeapon()==true){
                    me.assignWeapon(w.getRandWeapon());
                }
                System.out.println("Look again?");
                input = in.nextLine();
                if(input.equals("y")){
                    w = new Enemy(1, "blob");
                }
            }
            System.out.print('\f');
        }
    }
}