abstract public class Human implements Interface {

    private String fullName;
    private int age;
    private String address;
    private String phoneNumber;

    {
        setFullName("No Name");
        setAddress("No address");
        setPhoneNumber("No phone number");
    }

    public Human(String fullName, int age, String address, String phoneNumber) {
        setFullName(fullName);
        setAge(age);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public void tellAboutYouself() {
        System.out.println("I am human");
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
