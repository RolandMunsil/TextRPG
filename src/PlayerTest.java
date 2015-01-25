import java.util.Scanner;

public class PlayerTest {
    public static void main(String[] args) {
        //Clear the console (only works in BlueJ)
        System.out.print('\f');

        Scanner in = new Scanner(System.in);
        Player player = new Player("Me", 1, 1, 1, 1);
        System.out.println(player);
    }
}