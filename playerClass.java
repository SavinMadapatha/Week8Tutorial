//playerClass
import java.util.ArrayList;
import java.util.Scanner;

public class player {
    private String playerName;
    private int playerAge;
    private String playerType;
    private int playerStatistics;

    ArrayList<String> playerList = new ArrayList<String>();
    //constructor
    public player(String playerName, int playerAge, String playerType, int playerStatistics) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStatistics = playerStatistics;
    }

    void addPlayer() {
        System.out.println("Enter the players name you want to add : ");
        String name = new Scanner(System.in).nextLine();
        playerList.add(name);
    }

    void viewAllPlayers() {
        System.out.println("\nCricket Players"+playerList);
    }

    void getBowlingAverage() {
        System.out.println("\nEnter number of wickets taken in the past 15 matches");
        int wickets = new Scanner(System.in).nextInt();
        float avg = wickets/15;
    }

    void getBattingAverage() {
        System.out.println("Enter player's scores total in the past 15 matches : ");
        int score = new Scanner(System.in).nextInt();
        float avg = score/15;
    }

    void getPlayerDetails() {
        System.out.println("Enter player name : ");
        String name = new Scanner(System.in).nextLine();
        this.playerName = name;
        System.out.println("Enter player's age : ");
        int age = new Scanner(System.in).nextInt();
        this.playerAge = age;
        System.out.println("Enter player's type : ");
        String type = new Scanner(System.in).nextLine();
        this.playerType = type;
        System.out.println("Enter player statistics");
        int Statistics = new Scanner(System.in).nextInt();
        this.playerStatistics = playerStatistics;
    }
}

