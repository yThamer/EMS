import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeManager {
    private ArrayList <Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    private boolean isIdUnique(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public void addEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        if (!isIdUnique(id)) {
            System.out.println("Error: Employee ID already exists. \n");
            return;
        }
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, position, salary);
        employees.add(employee);
        System.out.println("Employee added successfully. \n");
    }

    public void addManager() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        if (!isIdUnique(id)) {
            System.out.println("Error: Employee ID already exists. \n");
            return;
        }
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Manager manager = new Manager(id, name, position, salary, department);
        employees.add(manager);
        System.out.println("Manager added successfully. \n");
    }

    public void removeEmployee() {
        System.out.print("Enter ID of the employee to remove: ");
        int id = scanner.nextInt();

        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Employee removed successfully. \n");
    }

    public void updateEmployee() {
        System.out.print("Enter ID of the employee to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new Position: ");
                String position = scanner.nextLine();
                System.out.print("Enter new Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();
                employee.setName(name);
                employee.setPosition(position);
                employee.setSalary(salary);
                System.out.println("Employee updated successfully. \n");
                return;
            }
        }
        System.out.println("Employee not found. \n");
    }

    public void listEmployees() {
        if (employees.isEmpty()){
            System.out.println("Employees is Empty \n");
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}