import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Compare by name
        int nameComparison = emp1.getName().compareTo(emp2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        // If names are the same, compare by department
        int departmentComparison = emp1.getDepartment().compareTo(emp2.getDepartment());
        if (departmentComparison != 0) {
            return departmentComparison;
        }

        // If names and departments are the same, compare by age
        return Integer.compare(emp1.getAge(), emp2.getAge());
    }
}
