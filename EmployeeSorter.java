import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorter {

    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Add employees to the list
        employees.add(new Employee("John Doe", "HR", 30));
        employees.add(new Employee("Jane Smith", "IT", 25));
        employees.add(new Employee("Bob Johnson", "Finance", 35));

        // Sort the list using the EmployeeComparator
        Collections.sort(employees, new EmployeeComparator());

        // Print the sorted list
        System.out.println("Sorted Employees:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() +
                    ", Age: " + employee.getAge());
        }
    }
}
