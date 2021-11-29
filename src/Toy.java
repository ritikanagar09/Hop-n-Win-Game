public class Toy implements Cloneable {

    public String toy;

    public Toy(String _toy) {
        this.toy=_toy;
    }
    public void display(){
        System.out.println("You won a "+toy);
    }

    public Toy clone() {
        try {
            Toy _clonedToy = (Toy) super.clone();
            return _clonedToy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }



}
