public class Admin extends Employee {
    private String department;

    public Admin(int id, String name, String position, double salary, String department) {
        super(id, name, position, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department = " + department + "]";
    }
}