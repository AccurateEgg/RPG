import java.util.*;

class Item {
    String name;

      public String String() {
        return name;
    }
}

     public Item(String name) {
        this.name = name;
    }

  public Bag(int maximum, double weight) {
    this.maximum = maximum;
    this.weight = weight;
    this.items = new ArrayList<Item>();
  }

public class Bag {
    public int maximum; 
    public ArrayList<Item> items; 
    public double weight; 
  
 public void open() {
        System.out.println("Opened");
  }

      public void keep(Item item) {
            items.add(item);
            System.out.println("Keep");
    }
  
    public void hold() {
        System.out.println("Hold");
    }

    public void showItems() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        Bag bag = new Bag(0, 1);

        bag.hold();
        bag.open();
        Item sigmaboy = new Item("");
        bag.keep();
    }
}
