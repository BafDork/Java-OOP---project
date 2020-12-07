import java.util.ArrayList;

final public class Parent extends Human {

    private ArrayList<Child> children;

    {
        children = new ArrayList<>();
    }

    public Parent(String fullName, int age, String address, String phoneNumber) {
        super(fullName, age, address, phoneNumber);
    }

    public void showParent() {
        System.out.println("Children:");
        for (Child child : children) System.out.println(child);
    }

    public void tellAboutYouself() {
        System.out.println("I'm a parent");
    }

    @Override
    public void printName() {
        System.out.println(getFullName());
    }

    @Override
    public void printMoney() {
        System.out.println("You don't need to know that");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "children=" + children +
                super.toString() +
                '}';
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public void removeTechnic(Child child) {
        children.remove(child);
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }
}
