import java.util.ArrayList;
public class Tiles {
    private int tileHoped;
    private ArrayList<Toy> toyList= new ArrayList<Toy>();
    public Tiles(int t){
        this.tileHoped=t;

        toyList.add(new Toy("Jerry"));//1
        toyList.add(new Toy("SpiderMan"));//2
        toyList.add(new Toy("pokemon"));//3
        toyList.add(new Toy("Doraemon"));//4
        toyList.add(new Toy("Shinchan"));//5
        toyList.add(new Toy("Baby Boss"));
        toyList.add(new Toy("Motu Patlu"));
        toyList.add(new Toy("Harry Potter"));
        toyList.add(new Toy("Thor"));
        toyList.add(new Toy("Donald Duck"));
        toyList.add(new Toy("Oggy"));
        toyList.add(new Toy("Black Bear"));
        toyList.add(new Toy("Batman"));
        toyList.add(new Toy("Mickey Mouse"));
        toyList.add(new Toy("Cindrella"));
        toyList.add(new Toy("Alladin"));
        toyList.add(new Toy("power Rangers"));
        toyList.add(new Toy("Minnion"));
        toyList.add(new Toy("Tom"));
        toyList.add(new Toy("Bheem"));
        this.cloneToy();

    }


    public void cloneToy(){
        Toy toy1=toyList.get(tileHoped).clone();
        toy1.display();
        String t=toy1.toy;
        Player _player= new Player();
        _player.addToBucketList(t);


    }





}
