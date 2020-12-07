final public class Educator extends Employee {

    private Group group;

    public Educator(String fullName, int age, String address, String phoneNumber, String post, int salary, int experience) {
        super(fullName, age, address, phoneNumber, post, salary, experience);
    }

    public void tellAboutYouself() {
        System.out.println("I work as a kindergarten teacher");
    }

    @Override
    public String toString() {
        return "Educator{" +
                "group=" + group +
                super.toString() +
                '}';
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
