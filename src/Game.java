import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private int tileLanded;

    public Game(int tile) {
        this.tileLanded = tile;
        this.startGame();
    }

    public void startGame() {


        if (tileLanded % 2 == 0 && tileLanded != 20) {
            Tiles _tile = new Tiles(tileLanded);
            

        } else if (tileLanded == 20) {
            System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");


        } else {
            boolean done = false;
            boolean b=false;
            boolean b1=false;
            boolean a=false;
            boolean a1=false;



            while(!done) {
                System.out.println("Question Answer Round: Integer or String");
                Scanner sc = new Scanner(System.in);
                String inp = sc.next();
                 b = inp.equals("Integer");
                 b1 = inp.equals("integer");
                 a = inp.equals("String");
                 a1 = inp.equals("string");

                if (b || b1 || a || a1) {
                    done = true;
                } else {
                    System.out.println("Incorrect format of Input");
                    System.out.println("Try Again");
                }
            }


            if (b || b1) {
                Random rand = new Random();
                int limit = 3000;
                int num1, num2;
                num1 = rand.nextInt(limit);
                num2 = rand.nextInt(limit);
                System.out.println("Calculate the result of " + num1 + " divided by " + num2);
                Calculator<Integer> _cal = new Calculator<Integer>(num1, num2);
                int ans1 = (Integer) _cal.Calculate();
                boolean done1 = false;
                int enteredNum = 0;
                while (!done1) {
                    try {
                        Scanner sc1 = new Scanner(System.in);
                        enteredNum = sc1.nextInt();
                        done1 = true;
                    } catch (NumberFormatException inp1) {
                        System.out.println("Wrong Input");
                        System.out.println("Try Again");

                    }
                    if (enteredNum == ans1) {
                        System.out.println("Correct Answer");
                        Tiles _tile1 = new Tiles(tileLanded);
                    } else {
                        System.out.println("Incorrect Answer");
                        System.out.println("You did not win any soft toy");
                    }

                }

            } else if (a || a1) {
                int leftLimit = 97; // letter 'a'
                int rightLimit = 122; // letter 'z'
                int targetStringLength = 4;
                Random random = new Random();

                String Str1 = random.ints(leftLimit, rightLimit + 1)
                        .limit(targetStringLength)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                String Str2 = random.ints(leftLimit, rightLimit + 1)
                        .limit(targetStringLength)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                System.out.println("Calculate the concatenation of strings " + Str1 + " and " + Str2);
                Calculator<String> _cal1 = new Calculator<String>(Str1, Str2);
                String ConcatenatedString = (String) _cal1.Calculate();

                boolean done1 = false;
                String enteredString = "e";
                Scanner sc2 = new Scanner(System.in);
                while (!done1) {
                    try {
                        enteredString = sc2.next();
                        done1 = true;
                    } catch (InputMismatchException inp3) {
                        System.out.println("Wrong Input");
                        System.out.println("Try Again");

                    }
                    if (enteredString.equals(ConcatenatedString)) {
                        System.out.println("Correct Answer");
                        Tiles _tile2 = new Tiles(tileLanded);
                    } else {
                        System.out.println("Incorrect Answer");
                        System.out.println("You did not win any soft toy");
                    }
                }
            }
        }
    }
}





