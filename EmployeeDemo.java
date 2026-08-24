import java.util.Scanner;

class Employee {
    int emp_id;
    String name;
    double salary;
    String designation;

    // Constructor for Fresher
    Employee(String name) {
        this.emp_id = 101;
        this.name = name;
        this.salary = 25000;
        this.designation = "Fresher";
    }

    // Constructor for Executive
    Employee(String name, double salary, String designation) {
        this.emp_id = 102;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    // Constructor for Temporary Member
    Employee() {
        this.emp_id = 103;
        this.name = "Temporary Employee";
        this.salary = 15000;
        this.designation = "Temporary";
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("-------------------------");
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Fresher
        System.out.print("Enter Fresher name: ");
        String fresherName = sc.nextLine();

        // Input for Executive
        System.out.print("Enter Executive name: ");
        String executiveName = sc.nextLine();

        System.out.print("Enter Executive salary: ");
        double executiveSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Executive designation: ");
        String executiveDesignation = sc.nextLine();

        // Create Employee array
        Employee[] employees = new Employee[3];

        // Create 3 Employee objects using overloaded constructors
        employees[0] = new Employee(fresherName);
        employees[1] = new Employee(
            executiveName,
            executiveSalary,
            executiveDesignation
        );
        employees[2] = new Employee();

        // Display employee details
        System.out.println("\nEmployee Details:");

        for (Employee e : employees) {
            e.display();
        }

        sc.close();
    }
}