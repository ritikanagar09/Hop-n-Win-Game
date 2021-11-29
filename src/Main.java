import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hit Enter to initialize the Game");
        System.out.println("Game is ready");


        List<String> numOfTimeHope= Arrays.asList("First","Second","Third","Fourth","Fifth");

        for(int i=0;i<5;i++) {
            System.out.print("Hit Enter for your "+ numOfTimeHope.get(i)+" hop");
            String s = sc.nextLine();

            Player _player = new Player();
            int tileVal = _player.getTileValue();
            System.out.println("You landed on Tile " + tileVal);
            Game _game = new Game(tileVal);
        }
        System.out.println("Game Over\n" +
                "Soft toys won by you are:");

        Player _player= new Player();
        List<String> _bucketOfToys= _player.getBucketList();
        ListIterator<String> itr = _bucketOfToys.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ,");
        }


    }
}
