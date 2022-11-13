import java.util.*;
import java.io.Console;

public class FirstGame {
    // final static int ROCK = 1, SCISSOR = 2, PAPER = 3;

    // public String restart(){
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Press '[S]' for [solo] and '[M]' for [Multiplayer]");
            String type = sc.next();
            String restart;
            do {
                if (!((type.equalsIgnoreCase("solo")) || (type.equalsIgnoreCase("s"))
                        || (type.equalsIgnoreCase("multiplayer"))
                        || (type.equalsIgnoreCase("m")))) {
                    System.out.println("Invalid Input!");
                } else if ((type.equalsIgnoreCase("solo")) || (type.equalsIgnoreCase("s"))) {
                    System.out.println(
                            "\n   ######Hello, I am Robo speed 1 Terahertz Memory 1 Zettabyte. Welcome to the Solo play Mode. Let's Play######");
                    int y = 0;
                    int r = 0;
                    int i;
                    System.out.print("Total round : ");
                    int z = sc.nextInt();
                    for (i = 1; i <= z;) {
                        // for (i = 1; i <= 5;) {
                        String enter = sc.nextLine();
                        if (enter.isEmpty()) {
                            System.out.print("\n\t\t\t\t\tPress [enter] to continue..");
                        }
                        if (sc.hasNextLine()) {
                            String[] arr = { "rock", "paper", "scissor" };
                            Random random = new Random();
                            int robo = random.nextInt(arr.length);
                            // System.out.println(arr[robo]);
                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRound : " + i);
                            System.out.println("Enter your Move!");
                            System.out.println("Rock\nPaper\nScissor\n");
                            System.out.print("Your Move : ");
                            String choise = sc.next();
                            // String rock, paper, scissor, r, s, S, P, R, p;
                            // rock = r = "R";
                            // paper = p = "P";
                            // scissor = s "S";
                            if (arr[robo].equalsIgnoreCase(choise)) {
                                System.out.println("Robo move : " + arr[robo]);
                                System.out.println("\t\t\t\t\t\tGame is a tie.");
                                i++;
                            } else if (!((choise.equalsIgnoreCase("rock")) || (choise.equalsIgnoreCase("r"))
                                    || ((choise.equalsIgnoreCase("paper")) || (choise.equalsIgnoreCase("p"))
                                            || ((choise.equalsIgnoreCase("scissor"))
                                                    || (choise.equalsIgnoreCase("s")))))) {
                                System.out.println("Invalid Input!");
                            } else {
                                switch (arr[robo]) {
                                    case "rock":
                                        if ((choise.equalsIgnoreCase("paper")) || (choise.equalsIgnoreCase("p"))) {
                                            // int y=0;
                                            {
                                                y += 1;
                                                i++;
                                            }
                                            System.out.println("Robo move : " + arr[robo]);
                                            System.out.println("\t\t\t\t\t\tYou won!");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRobo's : " + (r));
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYour's : " + (y));

                                        } else {
                                            // int m;
                                            {
                                                r += 1;
                                                i++;
                                            }

                                            System.out.println("Robo move : " + arr[robo]);
                                            System.out.println("\t\t\t\t\t\tRobo won!");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRobo's : " + (r));
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYour's : " + (y));

                                        }
                                        break;
                                    case "paper":
                                        if ((choise.equalsIgnoreCase("scissor")) || (choise.equalsIgnoreCase("s"))) {
                                            // int n;
                                            {
                                                y += 1;
                                                i++;
                                            }

                                            System.out.println("Robo move : " + arr[robo]);
                                            System.out.println("\t\t\t\t\t\tYou won!");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRobo's : " + (r));
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYour's : " + (y));

                                        } else {
                                            // int o;
                                            {
                                                r += 1;
                                                i++;
                                            }

                                            System.out.println("Robo move : " + arr[robo]);
                                            System.out.println("\t\t\t\t\t\tRobo won!");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRobo's : " + (r));
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYour's : " + (y));

                                        }
                                        break;
                                    case "scissor":
                                        if ((choise.equalsIgnoreCase("rock")) || (choise.equalsIgnoreCase("r"))) {

                                            // int p;
                                            {
                                                y += 1;
                                                i++;
                                            }
                                            System.out.println("Robo move : " + arr[robo]);
                                            System.out.println("\t\t\t\t\t\tYou won!");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRobo's : " + (r));
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYour's : " + (y));

                                        } else {
                                            // int q;
                                            {
                                                r += 1;
                                                i++;
                                            }
                                            System.out.println("Robo move : " + arr[robo]);
                                            System.out.println("\t\t\t\t\t\tRobo won!");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRobo's : " + (r));
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYour's : " + (y));

                                            break;
                                        }

                                }
                            }
                        }
                    }
                    if (y == r) {
                        System.out.println("\n\n\n\t\t\t\t\t\tGame is a tie!\n\n");

                    } else if (y > r) {
                        System.out.println("\n\n\n\t\t\t\t\tCongrats! you won the Game.\n\n");
                    } else {
                        System.out.println("\n\n\n\t\t\t\t\tYou lose! Robo won the Game.\n\n");
                    }
                } else if ((type.equalsIgnoreCase("multiplayer")) || (type.equalsIgnoreCase("m"))) {
                    System.out.println("\t\t\t\t######Welcome to the Duo Play Mode######");
                    System.out.print("Enter your Name\nPlayer 1 : ");
                    String name1 = sc.next();
                    System.out.print("Player 2 : ");
                    String name2 = sc.next();
                    String mulRe;
                    // for (i = 1; i <= 5; i++) {
                    // int i;
                    do {
                        int i;
                        System.out.print("\nTotal round : ");
                        int z = sc.nextInt();
                        int n1 = 0;
                        int n2 = 0;
                        for (i = 1; i <= z;) {
                            String click = sc.nextLine();
                            if (click.isEmpty()) {
                                System.out.print("\n\t\t\t\t\tPress [enter] to continue..");
                            }
                            if (sc.hasNextLine()) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tRound : " + i);
                                Console console = System.console();
                                // System.out.println("\n");
                                String player1 = new String(console.readPassword(
                                        (name1) + " and " + (name2)
                                                + " please choose any from the following...[enter number(1,2,3)]\n\n"
                                                + (name1) + "\t\t\t    " + (name2)
                                                + "\n(1)     -     Rock       -    (8)\n(2)     -    Scissors    -    (9)\n(3)     -     Paper      -    (0)\n\n"
                                                + (name1) + "  [1,2,3] :"));
                                // int player1 = sc.nextInt();
                                // if (player1 == 1 || player1 == 2 || player1 == 3) {
                                if (player1.equals("1") || player1.equals("2") || player1.equals("3")) {

                                    // System.out.println("Player 2: \nChoose (1) - Rock, (2) - Scissors, or (3) -
                                    // Paper: ");
                                    // int player2 = sc.nextInt();
                                    String player2 = new String(console.readPassword(name2 + "  [8,9,0] :"));
                                    System.out.println("");
                                    if (player2.equals("8") || player2.equals("9") || player2.equals("0")) {
                                        // if (player2 == "8" || player2 == "9" || player2 == "0") {

                                        // if (player1 == player2) {
                                        // System.out.print("\t\t\t\t\t\tGame is a tie");
                                        // } else {
                                        switch (player1) {
                                            case "1":
                                                if (player2.equals("8")) {
                                                    System.out.println((name1) + " move : " + ("rock"));
                                                    System.out.println((name2) + " move : " + ("rock"));
                                                    System.out.println("\t\t\t\t\t\tGame is a tie");
                                                    i++;
                                                } else if (player2.equals("9")) {
                                                    {
                                                        n1 = n1 + 1;
                                                        i++;
                                                    }
                                                    System.out.println((name1) + " move : " + ("rock"));
                                                    System.out.println((name2) + " move : " + ("scissor"));
                                                    System.out.println("\t\t\t\t\t\t" + (name1) + " won!");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name1) + " : "
                                                                    + (n1));
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name2) + " : "
                                                                    + (n2));
                                                } else {
                                                    {
                                                        n2 = n2 + 1;
                                                        i++;
                                                    }
                                                    System.out.println((name1) + " move : " + ("rock"));
                                                    System.out.println((name2) + " move : " + ("paper"));
                                                    System.out.println("\t\t\t\t\t\t" + (name2) + " won!");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name1) + " : "
                                                                    + (n1));
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name2) + " : "
                                                                    + (n2));
                                                }
                                                break;
                                            case "2":
                                                if (player2.equals("9")) {
                                                    System.out.println((name1) + " move : " + ("scissor"));
                                                    System.out.println((name2) + " move : " + ("scissor"));
                                                    System.out.println("\t\t\t\t\t\tGame is a tie");
                                                    i++;
                                                } else if (player2.equals("0")) {
                                                    {
                                                        n1 = n1 + 1;
                                                        i++;
                                                    }
                                                    System.out.println((name1) + " move : " + ("scissor"));
                                                    System.out.println((name2) + " move : " + ("paper"));
                                                    System.out.println("\t\t\t\t\t\t" + (name1) + " won!");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name1) + " : "
                                                                    + (n1));
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name2) + " : "
                                                                    + (n2));
                                                } else {
                                                    {
                                                        n2 = n2 + 1;
                                                        i++;
                                                    }
                                                    System.out.println((name1) + " move : " + ("scissor"));
                                                    System.out.println((name2) + " move : " + ("rock"));
                                                    System.out.println("\t\t\t\t\t\t" + (name2) + " won!");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name1) + " : "
                                                                    + (n1));
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name2) + " : "
                                                                    + (n2));
                                                }
                                                break;
                                            case "3":
                                                if (player2.equals("0")) {
                                                    System.out.println((name1) + " move : " + ("paper"));
                                                    System.out.println((name2) + " move : " + ("paper"));
                                                    System.out.println("\t\t\t\t\t\tGame is a tie");
                                                    i++;
                                                } else if (player2.equals("8")) {
                                                    {
                                                        n1 = n1 + 1;
                                                        i++;
                                                    }
                                                    System.out.println((name1) + " move : " + ("paper"));
                                                    System.out.println((name2) + " move : " + ("rock"));
                                                    System.out.println("\t\t\t\t\t\t" + (name1) + " won!");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name1) + " : "
                                                                    + (n1));
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name2) + " : "
                                                                    + (n2));
                                                } else {
                                                    {
                                                        n2 = n2 + 1;
                                                        i++;
                                                    }
                                                    System.out.println((name1) + " move : " + ("paper"));
                                                    System.out.println((name2) + " move : " + ("scissor"));
                                                    System.out.println("\t\t\t\t\t\t" + (name2) + " won!");
                                                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t -Score-");
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name1) + " : "
                                                                    + (n1));
                                                    System.out
                                                            .println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + (name2) + " : "
                                                                    + (n2));
                                                }
                                                break;
                                            // }
                                        }
                                    } else {
                                        System.out.println("Invalid Input");
                                    }
                                } else {
                                    System.out.println("Invalid Input");
                                }
                            }
                            // System.out.println("im mausam");
                        }
                        if (n1 == n2) {
                            System.out.println("\n\n\n\t\t\t\t\t\tGame is a tie!\n\n");
                        } else if (n1 > n2) {
                            System.out.println("\n\n\n\t\t\t\t\tCongrats! " + (name1) + " won the Game.\n\n");
                        } else {
                            System.out.println("\n\n\n\t\t\t\t\tCongrats! " + (name2) + " won the Game.\n\n");
                        }
                        System.out.println("\t\t\t\t\t   Play again ?[yes/no]\n\n\n");
                        mulRe = sc.next();
                    } while ((mulRe.equalsIgnoreCase("yes")) || (mulRe.equalsIgnoreCase("yes"))
                            || (mulRe.startsWith("y")));
                    break;
                }
                // else if ((type.startsWith("solo"))) {
                System.out.println("\t\t\t\t\t   Play again ?[yes/no]\n\n\n");
                restart = sc.next();
                // return restart;
                if ((restart.equalsIgnoreCase("yes")) || (restart.equalsIgnoreCase("y"))
                        || (restart.startsWith("yes"))) {
                    System.out.println("\t\t\t\t*******Game Restarted*******\n");
                    // }
                }
            } while ((restart.equalsIgnoreCase("yes")) || (restart.equalsIgnoreCase("y"))
                    || (restart.startsWith("yes")));
        }
        System.out.println("\t\t\t\t\t     **Thankyou!**\n\n\n");
    }
}