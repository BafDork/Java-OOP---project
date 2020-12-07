import java.util.ArrayList;


final public class Kindergarten {

    private String address;
    private int buildingAge;
    private boolean stateBuilding;
    private Inventory inventory;
    private Staff staff;
    private ArrayList<Group> groups;
    private int numberOfGroups;
    private static int kindergartensInCity = 0;
    private final static String description = "This class descript an kindergarten.";

    {
        groups = new ArrayList<>();
        kindergartensInCity++;
    }

    public Kindergarten(String address, int buildingAge, boolean stateBuilding, Inventory inventory, Staff staff) {
        setAddress(address);
        setBuildingAge(buildingAge);
        setStateBuilding(stateBuilding);
        setInventory(inventory);
        setStaff(staff);
    }

    public static void description() {
        System.out.println(description);
    }

    public static void howManyKindergartensInCity() {
        System.out.println("Kindergartens in the city: " + kindergartensInCity);
    }

    public boolean availableInInventory(Object object, int quantity) {
        for (Furniture furniture : inventory.getFurnitures()) {
            if (furniture.getName().equals(object.getName()) && furniture.getQuantity() == quantity) return true;
        }
        for (Technic technic : inventory.getTechnics()) {
            if (technic.getName().equals(object.getName()) && technic.getQuantity() == quantity) return true;
        }
        return false;
    }

    public boolean availableInInventory(Object object) {
        for (Furniture furniture : inventory.getFurnitures()) {
            if (furniture.getName().equals(object.getName())) return true;
        }
        for (Technic technic : inventory.getTechnics()) {
            if (technic.getName().equals(object.getName())) return true;
        }
        return false;
    }

    public void showKindergarten() {
        System.out.println(toString());
        inventory.showFurniture();
        inventory.showTechnic();
        staff.showAdministration();
        staff.showEducator();
        for (Group group : groups) {
            group.showGroup();
        }
    }

    @Override
    public String toString() {
        return "Kindergarten{" +
                "address='" + address + '\'' +
                ", buildingAge=" + buildingAge +
                ", stateBuilding=" + stateBuilding +
                ", inventory=" + inventory +
                ", staff=" + staff +
                ", groups=" + groups +
                ", numberOfGroups=" + numberOfGroups +
                '}';
    }

    public void addGroup(Group group) {
        groups.add(group);
        numberOfGroups++;
    }

    public void removeChild(Group group) {
        groups.remove(group);
        numberOfGroups--;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuildingAge() {
        return buildingAge;
    }

    public void setBuildingAge(int buildingAge) {
        this.buildingAge = buildingAge;
    }

    public boolean isStateBuilding() {
        return stateBuilding;
    }

    public void setStateBuilding(boolean stateBuilding) {
        this.stateBuilding = stateBuilding;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }
}
