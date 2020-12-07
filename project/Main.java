public class Main {
    public static void main(String[] args) {
        Furniture table = new Furniture("Table", 1, 30, 2000, "Model", "Manufacturer", true);
        Technic laptop = new Technic("Laptop", 2, 3, 10000, "Model", "Manufacturer", true);
        Inventory inventory = new Inventory();
        inventory.addFurniture(table);
        inventory.addTechnic(laptop);
        Administration administration = new Administration("A B C", 20, "AAA", "88005553535",
                "Financier", 20000, 2, "Finance", "Financial department");
        Educator educator = new Educator("C B A", 30, "BBB", "89008007006",
                "Educator", 15000, 12);
        Staff staff = new Staff();
        staff.addAdministration(administration);
        staff.addEducator(educator);
        Kindergarten kindergarten = new Kindergarten("CCC", 2, false, inventory, staff);
        Parent parent = new Parent("B A C", 25, "A B C", "89765432109");
        Child child = new Child("B C A", 5, "C B A", "80123456789");
        parent.addChild(child);
        child.addParent(parent);
        Group group = new Group();
        group.addChild(child);
        group.setEducator(educator);
        educator.setGroup(group);
        child.setGroup(group);
        kindergarten.addGroup(group);
        System.out.println(kindergarten);
        kindergarten.showKindergarten();
        administration.tellAboutYouself();
        educator.tellAboutYouself();
        parent.tellAboutYouself();
        child.tellAboutYouself();
        System.out.println(kindergarten.availableInInventory(table));
        System.out.println(kindergarten.availableInInventory(laptop, 10));
    }
}
