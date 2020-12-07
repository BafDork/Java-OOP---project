import java.util.ArrayList;

final public class Staff {

    private ArrayList<Educator> educators;
    private ArrayList<Administration> administrations;

    {
        educators = new ArrayList<>();
        administrations = new ArrayList<>();
    }

    public Staff() {}

    public Staff(ArrayList<Educator> educators, ArrayList<Administration> administrations) {
        setEducators(educators);
        setAdministrations(administrations);
    }

    public void showEducator() {
        System.out.println("All educator:");
        for (Educator educator : educators) System.out.println(educator);
    }

    public void showAdministration() {
        System.out.println("All administration:");
        for (Administration administration : administrations) System.out.println(administration);
    }

    public void addEducator(Educator educator) {
        educators.add(educator);
    }

    public void removeEducator(Educator educator) {
        educators.remove(educator);
    }

    public void addAdministration(Administration administration) {
        administrations.add(administration);
    }

    public void removeAdministration(Administration administration) {
        administrations.remove(administration);
    }

    public ArrayList<Educator> getEducators() {
        return educators;
    }

    public void setEducators(ArrayList<Educator> educators) {
        this.educators = educators;
    }

    public ArrayList<Administration> getAdministrations() {
        return administrations;
    }

    public void setAdministrations(ArrayList<Administration> administrations) {
        this.administrations = administrations;
    }
}
