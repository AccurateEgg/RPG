public abstract class Item {
    public String name;
    public abstract class Item {
    public String name;
    public String description;
    public double weight;
    public boolean use;
    public String type;
    public Item(String name, String description, double weight, boolean use, String type) {
        this.name = name;
        this.use = use;
        this.type = type;
        this.description = description;
        this.weight = weight;
    }
    public abstract void use();
    public void showstatistics() {
        System.out.println(description);
        System.out.println(name);
        System.out.println(type);
        System.out.println(weight);
    }
    public void takeout() {
        System.out.println(name);
    }
      
    public void search() {
        System.out.println(name + description);
    }
    public abstract void use();
    public void showstatistics() {
        System.out.println(name);
        System.out.println(type);
        System.out.println(description);
        System.out.println(weight);
    }

      this.name
    public String description;
    public double weight;
    public Item(String name, String description, double weight, boolean use, String type) {
        this.name = name;
        this.use = use;
        this.type = type;
        this.description = description;
        this.weight = weight;
    }

    public void takeout() {
        System.out.println(name);
    }
    public void search() {
        System.out.println(name + description);
    }
}
