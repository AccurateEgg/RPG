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

  public Bag(int max, double weight) {
    this.max = max;
    this.weight = weight;
    this.items = new ArrayList<Item>();
  }

public class Bag {
    public int max; 
    public ArrayList<Item> items; 
    public double weight; 
  
 public void open() {
        System.out.println("Opened");
  }

      public void store(Item item) {
            items.add(item);
            System.out.println("Put");
    }
  
    public void carry() {
        System.out.println("Carry");
    }

    public void showItems() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        Bag bag = new Bag(0, 1);

        bag.carry();
        bag.open();
        Item sigmaboy = new Item("");
        bag.store();
    }
}
this.name
