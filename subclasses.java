public class Stuff extends Item {
    private int pain;

    public stuff(String name, String description, double weight, int pain) {
        super(name, description, weight, true);
        this.pain = pain;
    }
public class Eating extends Item {
    private int nutrients;

    public Eating(String name, String description, double weight, int nutrients) {
        super(name, description, weight, true);
        this.nutrients = nutrients;
      
    public void use() {
        System.out.println(name + pain);
    }
      
  public class Hurt extends Item {
    private int amount;
    public Hurt(String name, String description, double weight, int amount) {
        super(name, description, weight, true);
        this.amount = amount;
      
    public void use() {
        System.out.println(name + nutrients);
    }
}
