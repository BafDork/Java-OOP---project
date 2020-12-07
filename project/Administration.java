final public class Administration extends Employee{

    private String fieldOfActivity;
    private String department;

    {
        setFieldOfActivity("No Field of activity");
        setDepartment("No Department");
    }

    public Administration(String fullName, int age, String address, String phoneNumber, String post, int salary, int experience, String fieldOfActivity, String department) {
        super(fullName, age, address, phoneNumber, post, salary, experience);
        setFieldOfActivity(fieldOfActivity);
        setDepartment(department);
    }

    public void tellAboutYouself() {
        System.out.println("I work in the kindergarten administration");
    }

    @Override
    public String toString() {
        return "Administration{" +
                "fieldOfActivity='" + fieldOfActivity + '\'' +
                ", department='" + department + '\'' +
                super.toString() +
                '}';
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
