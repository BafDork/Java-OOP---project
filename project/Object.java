abstract public class Object implements Interface {

    private String name;
    private int number;
    private int quantity;
    private int price;

    {
        setName("No Name");
    }

    public Object(String name, int number, int quantity, int price) {
        this.name = name;
        this.number = number;
        this.quantity = quantity;
        this.price = price;
    }

    public int getFullCost() {
        System.out.println(this.number + " " + this.name + " cost " + this.price * this.number);
        return this.price * this.number;
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

    @Override
    public void printMoney() {
        System.out.println(getPrice());
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
