package rafael.alcocer.caldera.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * PROBLEM: Write a program to print active and inactive employees in the given collection.
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
 * Collect the employees, group them by status and return them.
 * 
 * OUTPUT:
 * 
 * inactive-----[Employee:
 * Id: 2
 * Name: Emp2
 * Department Id: 100
 * Salary: 30500.75
 * Status: inactive
 * , Employee:
 * Id: 3
 * Name: Emp3
 * Department Id: 300
 * Salary: 45500.85
 * Status: inactive
 * ]
 * active-----[Employee:
 * Id: 1
 * Name: Emp1
 * Department Id: 100
 * Salary: 50000.6
 * Status: active
 * , Employee:
 * Id: 4
 * Name: Emp4
 * Department Id: 300
 * Salary: 75500.3
 * Status: active
 * , Employee:
 * Id: 5
 * Name: Emp5
 * Department Id: 500
 * Salary: 88500.45
 * Status: active
 * , Employee:
 * Id: 6
 * Name: Emp6
 * Department Id: 100
 * Salary: 22690.33
 * Status: active
 * ]
 * ------
 * {inactive=[Employee:
 * Id: 2
 * Name: Emp2
 * Department Id: 100
 * Salary: 30500.75
 * Status: inactive
 * , Employee:
 * Id: 3
 * Name: Emp3
 * Department Id: 300
 * Salary: 45500.85
 * Status: inactive
 * ], active=[Employee:
 * Id: 1
 * Name: Emp1
 * Department Id: 100
 * Salary: 50000.6
 * Status: active
 * , Employee:
 * Id: 4
 * Name: Emp4
 * Department Id: 300
 * Salary: 75500.3
 * Status: active
 * , Employee:
 * Id: 5
 * Name: Emp5
 * Department Id: 500
 * Salary: 88500.45
 * Status: active
 * , Employee:
 * Id: 6
 * Name: Emp6
 * Department Id: 100
 * Salary: 22690.33
 * Status: active
 * ]}
 */
public class Exercise27Stream {

    public static void main(String[] args) {
        Exercise27Stream x = new Exercise27Stream();
        x.go();
        System.out.println("------");
        x.go2();
    }

    public void go() {
        List<Employee> employees = generateEmployees();
        
        employees.stream()
            .collect(Collectors.groupingBy(Employee::getStatus))
            .entrySet()
            .forEach(entry -> System.out.println(entry.getKey() + "-----" + entry.getValue()));
    }
    
    public void go2() {
        List<Employee> employees = generateEmployees();
        
        Map<String, List<Employee>> map = employees.stream()
            .collect(Collectors.groupingBy(Employee::getStatus));
        
        System.out.println(map);
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
