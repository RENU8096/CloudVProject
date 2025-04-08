
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-----------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee( 517, "Renuka", 25000);
        Employee emp2 = new Employee(518, "Vidhya", 78000);
        Employee emp3 = new Employee(519, "Monika", 545000);

        // Storing them in a list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying their details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
