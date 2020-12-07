abstract public class Employee extends Human {

    private String post;
    private int salary;
    private int experience;

    {
        setPost("No Post");
    }

    public Employee(String fullName, int age, String address, String phoneNumber, String post, int salary, int experience) {
        super(fullName, age, address, phoneNumber);
        setPost(post);
        setSalary(salary);
        setExperience(experience);
    }

    public void tellAboutYouself() {
        System.out.println("I'm a kindergarten employee");
    }

    @Override
    public void printName() {
        System.out.println(getFullName());
    }

    @Override
    public void printMoney() {
        System.out.println(getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "post='" + post + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
