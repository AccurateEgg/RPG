public class Things extends Item {
    private int damage;

    public Things(String name, String description, double weight, int damage) {
        super(name, description, weight, true, "Things");
        this.damage = damage;
    }
public class Eating extends Item {
    private int nutrients;

    public Eating(String name, String description, double weight, int nutrients) {
        super(name, description, weight, true, "Eating");
        this.nutrients = nutrients;
      
    public void use() {
        System.out.println(name + damage);
    }
      
  public class Damaging extends Item {
    private int amount;

    public Damaging(String name, String description, double weight, int amount) {
        super(name, description, weight, true, "Damaging");
        this.amount = amount;
      
    public void use() {
        System.out.println(name + nutrients);
    }
}
