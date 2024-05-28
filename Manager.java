import java.util.Scanner;

public class Manager extends Employee{
    private EmployeeManager employeeManager;


    public Manager(EmployeeManager employeeManager) {
        super(0, "", "", 0.0);  
        this.employeeManager = employeeManager;
    }


    public Manager(int id, String name, String position, double salary, String department) {
        super(id, name, position, salary);  
    }

    public void displayOptions() {
        Scanner eScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Made by Thamer (: \n--------------------");

            System.out.println("1. Add Employee");
            System.out.println("2. Add Manager");
            System.out.println("3. Remove Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. List Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = eScanner.nextInt();

            switch (choice) {
                case 1:
                    employeeManager.addEmployee();
                    break;
                case 2:
                    employeeManager.addManager();
                    break;
                case 3:
                    employeeManager.removeEmployee();
                    break;
                case 4:
                    employeeManager.updateEmployee();
                    break;
                case 5:
                    employeeManager.listEmployees();
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again. \n");
            }
        }
    }
}
