
public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Manager manager = new Manager(employeeManager);
        manager.displayOptions();
    }
}