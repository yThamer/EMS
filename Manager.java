import java.util.Scanner;

public class Manager {
    private EmployeeManager employeeManager;

    public Manager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public void displayOptions() {
        Scanner Scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. List Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = Scanner.nextInt();

            switch (choice) {
                case 1:
                    employeeManager.addEmployee();
                    break;
                case 2:
                    employeeManager.removeEmployee();
                    break;
                case 3:
                    employeeManager.updateEmployee();
                    break;
                case 4:
                    employeeManager.listEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}