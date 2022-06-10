package rafael.alcocer.caldera.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * PROBLEM: Write a program to print Max/Min employee salary from the given collection.
 * 
 * INPUT:
 * 
 * Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
 * 
 * Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
 * 
 * Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
 * 
 * Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
 * 
 * Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
 * 
 * Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
 * 
 * SOLUTION:
 * 
 * Use the same list of employees to get the min and max.
 * 
 * OUTPUT:
 * ##### Max Employee Salary #####
 * Employee:
 * Id: 5
 * Name: Emp5
 * Department Id: 500
 * Salary: 88500.45
 * Status: active
 * 
 * ##### Min Employee Salary #####
 * Employee:
 * Id: 6
 * Name: Emp6
 * Department Id: 100
 * Salary: 22690.33
 * Status: active
 */
public class Exercise28Stream {

    public static void main(String[] args) {
        Exercise28Stream x = new Exercise28Stream();
        x.go();
    }

    public void go() {
        List<Employee> employees = generateEmployees();
        
        System.out.println("##### Max Employee Salary #####");
        employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary))
            .ifPresent(System.out::println);
        
        System.out.println("##### Min Employee Salary #####");
        employees.stream()
            .min(Comparator.comparingDouble(Employee::getSalary))
            .ifPresent(System.out::println);
    }

    public List<Employee> generateEmployees() {
		// int id, String name, int deptid, double salary, String status
		Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
		Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
		Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
		Employee e4 = new Employee(4, "Emp4", 300, 75500.30, "active");
		Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
		Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");

		return Arrays.asList(e1, e2, e3, e4, e5, e6);
	}
}
