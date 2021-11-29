import java.util.ArrayList;
import java.util.Random;

public class Player {
    private static ArrayList<String> bucketList=new ArrayList<String>();
    private final int noOfTiles=20;
    private String s;
    private int tileHoped;

    public Player(){
        this.hop();
    }

    public void hop(){
        Random rand= new Random();
        int curr_tile= 1+ rand.nextInt(noOfTiles);
        setTileValue(curr_tile);
    }
    public void setTileValue(int value){
        this.tileHoped= value;
    }
    public int getTileValue(){
        return tileHoped;
    }
    public void addToBucketList(String toy){
        this.s=toy;
        bucketList.add(toy);
    }
    public ArrayList<String> getBucketList(){
        return bucketList;
    }
}
