
import java.util.Scanner;

public class Main {
    // Variables
    static String[] game = new String[]{"7", "8", "9", "4", "5", "6", "1", "2", "3"};
    static boolean checking = false;
    static int player_turn;

    public static void main(String[] args) {
        System.out.println("\n\n    Player 1 will be X and Player 2 will be O\n");
        player_turn = 1;
        turn();
        printBoard();
        System.out.println("        GOODBYE");

    }

    //printing te board game
    static void printBoard() {
        System.out.println("          |---|---|---|");
        System.out.println("          | " + game[0] + " | "
                + game[1] + " | " + game[2]
                + " |");
        System.out.println("          |-----------|");
        System.out.println("          | " + game[3] + " | "
                + game[4] + " | " + game[5]
                + " |");
        System.out.println("          |-----------|");
        System.out.println("          | " + game[6] + " | "
                + game[7] + " | " + game[8]
                + " |");
        System.out.println("          |---|---|---|");
    }

    //changing th turn
    public static void turn() {
        Scanner scanner = new Scanner(System.in);
        while (!checking) {
            printBoard();
            if (player_turn == 1) {
                System.out.println("\n    Player 1 please enter a number:");
                int n1 = scanner.nextInt();
                set_p1(n1);
            } else if (player_turn == 2) {
                System.out.println("\n    Player 2 please enter a number:");
                int n2 = scanner.nextInt();
                set_p2(n2);
            }
        }


    }

    //setter for player 1
    static void set_p1(int num1) {
        switch (num1) {
            case 1:
                game[6] = "X";
                check();
                break;
            case 2:
                game[7] = "X";
                check();
                break;
            case 3:
                game[8] = "X";
                check();
                break;
            case 4:
                game[3] = "X";
                check();
                break;
            case 5:
                game[4] = "X";
                check();
                break;
            case 6:
                game[5] = "X";
                check();
                break;
            case 7:
                game[0] = "X";
                check();
                break;
            case 8:
                game[1] = "X";
                check();
                break;
            case 9:
                game[2] = "X";
                check();
                break;
        }

    }

    //setter for player 2
    static void set_p2(int num2) {

        switch (num2) {
            case 1:
                game[6] = "O";
                check();
                break;
            case 2:
                game[7] = "O";
                check();
                break;
            case 3:
                game[8] = "O";
                check();
                break;
            case 4:
                game[3] = "O";
                check();
                break;
            case 5:
                game[4] = "O";
                check();
                break;
            case 6:
                game[5] = "O";
                check();
                break;
            case 7:
                game[0] = "O";
                check();
                break;
            case 8:
                game[1] = "O";
                check();
                break;
            case 9:
                game[2] = "O";
                check();
                break;
        }
    }

    //checking who win the game
    static void check() {

        if (game[2].equals(game[1]) && game[1].equals(game[0]) && game[2].equals(game[0])) {
            System.out.println("\t  " + game[2] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();

        } else if (game[3].equals(game[4]) && game[4].equals(game[5]) && game[5].equals(game[3])) {
            System.out.println("\t  " + game[3] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (game[6].equals(game[7]) && game[7].equals(game[8]) && game[8].equals(game[6])) {
            System.out.println("\t  " + game[6] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (game[6].equals(game[4]) && game[4].equals(game[2]) && game[6].equals(game[2])) {
            System.out.println("\t  " + game[6] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (game[6].equals(game[3]) && game[3].equals(game[0]) && game[6].equals(game[0])) {
            System.out.println("\t  " + game[6] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (game[0].equals(game[4]) && game[4].equals(game[8]) && game[8].equals(game[0])) {
            System.out.println("\t  " + game[4] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (game[8].equals(game[5]) && game[2].equals(game[5]) && game[8].equals(game[2])) {
            System.out.println("\t  " + game[8] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (game[7].equals(game[4]) && game[4].equals(game[1]) && game[7].equals(game[1])) {
            System.out.println("\t  " + game[7] + "     Win th game\n\n\t\tThanks for playing");
            checking = true;
            turn();
        } else if (player_turn == 1) {
            player_turn = 2;
            turn();
        } else if (player_turn == 2) {
            player_turn = 1;
            turn();
        }
    }
}
