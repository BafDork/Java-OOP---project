final public class Technic extends Object {

    private String model;
    private String manufacturer;
    private boolean working;

    {
        setModel("No Model");
        setManufacturer("No Manufacturer");
    }

    public Technic(String name, int number, int quantity, int price, String model, String manufacturer, boolean working) {
        super(name, number, quantity, price);
        setModel(model);
        setManufacturer(manufacturer);
        setWorking(working);
    }

    @Override
    public String toString() {
        return "Technic{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", working= '" + working + '\'' +
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

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
