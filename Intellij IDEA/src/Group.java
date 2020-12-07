import java.util.ArrayList;

final public class Group {

    private ArrayList<Child> group;
    private Educator educator;

    {
        group = new ArrayList<>();
    }

    public Group() {}

    public Group(ArrayList<Child> group, Educator educator) {
        setGroup(group);
        setEducator(educator);
    }

    public void showGroup() {
        System.out.println("Members of the group:");
        for (Child child : group) {
            System.out.println(child);
            child.showParent();
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + group +
                '}';
    }

    public void addChild(Child child) {
        group.add(child);
    }

    public void removeChild(Child child) {
        group.remove(child);
    }

    public ArrayList<Child> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Child> group) {
        this.group = group;
    }

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }
}
