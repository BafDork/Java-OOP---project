import java.util.ArrayList;

final public class Inventory {

    private ArrayList<Technic> technics;
    private ArrayList<Furniture> furnitures;

    {
        technics = new ArrayList<>();
        furnitures = new ArrayList<>();
    }

    public Inventory() {}

    public Inventory(ArrayList<Technic> technics, ArrayList<Furniture> furnitures) {
        setTechnics(technics);
        setFurnitures(furnitures);
    }

    public void showTechnic() {
        System.out.println("All technic:");
        for (Technic technic : technics) System.out.println(technic);
    }

    public void showFurniture() {
        System.out.println("All furniture:");
        for (Furniture furniture : furnitures) System.out.println(furniture);
    }

    public void addTechnic(Technic technic) {
        technics.add(technic);
    }

    public void removeTechnic(Technic technic) {
        technics.remove(technic);
    }

    public void addFurniture(Furniture furniture) {
        furnitures.add(furniture);
    }

    public void removeFurniture(Furniture furniture) {
        furnitures.remove(furniture);
    }

    public ArrayList<Technic> getTechnics() {
        return technics;
    }

    public void setTechnics(ArrayList<Technic> technics) {
        this.technics = technics;
    }

    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }

    public void setFurnitures(ArrayList<Furniture> furnitures) {
        this.furnitures = furnitures;
    }
}
