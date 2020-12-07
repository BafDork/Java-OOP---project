import java.util.ArrayList;

final public class Child extends Human {

    private ArrayList<Parent> parents;
    private Group group;

    {
        parents = new ArrayList<>();
    }

    public Child(String fullName, int age, String address, String phoneNumber) {
        super(fullName, age, address, phoneNumber);
    }

    public void showParent() {
        System.out.println("Parents:");
        for (Parent parent : parents) System.out.println(parent);
    }

    public void tellAboutYouself() {
        System.out.println("I am child");
    }

    @Override
    public void printName() {
        System.out.println(getFullName());
    }

    @Override
    public void printMoney() {
        System.out.println("I'm not making any money yet");
    }

    @Override
    public String toString() {
        return "Child{" +
                super.toString() +
                '}';
    }

    public void addParent(Parent parent) {
        parents.add(parent);
    }

    public void removeParent(Parent parent) {
        parents.remove(parent);
    }

    public ArrayList<Parent> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Parent> parents) {
        this.parents = parents;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
