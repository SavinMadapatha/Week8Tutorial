import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList <Player> playerArrayList = new ArrayList<Player>();
        while(true){
            System.out.println("MENU");
            System.out.println("Add a player                :Press A");
            System.out.println("View All players            :Press V");
            System.out.println("Display two best batmans    :Press B");
            System.out.println("Display two best bowlers    :Press C");
            System.out.println("Display the best Keeper     :Press D");
            System.out.println("To Exit                     :Press Q");

            String option = input.next();

            switch (option) {
                case "A":
                    System.out.println("Enter player's Name:");
                    String playerName = input.nextLine();

                    System.out.println("Enter player Type:");
                    String playerType = input.nextLine();

                    System.out.println("Enter player Age:");
                    int playerAge = input.nextInt();

                    System.out.println("Enter player Statistics:");
                    int playerStatistics = input.nextInt();

                    Player
                    break;
                case "V":

                    break;
                case "B":

                    break;
                case "C":

                    break;
                case "D":

                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            if (option == "Q") {
                break;
            }
        }
    }
}
