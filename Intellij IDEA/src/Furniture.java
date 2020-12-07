final public class Furniture extends Object {

    private String model;
    private String manufacturer;
    private boolean goodCondition;

    {
        setModel("No Model");
        setManufacturer("No Manufacturer");
    }

    public Furniture(String name, int number, int quantity, int price, String model, String manufacturer, boolean goodCondition) {
        super(name, number, quantity, price);
        setModel(model);
        setManufacturer(manufacturer);
        setGoodCondition(goodCondition);
    }

    @Override
    public String toString() {
        return "Technic{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", goodCondition='" + goodCondition + '\'' +
                super.toString() +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isGoodCondition() {
        return goodCondition;
    }

    public void setGoodCondition(boolean goodCondition) {
        this.goodCondition = goodCondition;
    }
}
