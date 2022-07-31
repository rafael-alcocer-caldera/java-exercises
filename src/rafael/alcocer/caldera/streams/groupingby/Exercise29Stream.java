/**
 * Copyright [2022] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.streams.groupingby;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import rafael.alcocer.caldera.streams.Employee;

/**
 * PROBLEM: Write a program to print the max salary of an employee from each department.
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
 * OUTPUT:
 * 
 * Employee:
 * Id: 5
 * Name: Emp5
 * Department Id: 500
 * Salary: 88500.45
 * Status: active
 *
 * Employee:
 * Id: 1
 * Name: Emp1
 * Department Id: 100
 * Salary: 50000.6
 * Status: active
 * 
 * Employee:
 * Id: 4
 * Name: Emp4
 * Department Id: 300
 * Salary: 75500.3
 * Status: active
 * 
 * ------
 * 
 * {500=Optional[Employee:
 * Id: 5
 * Name: Emp5
 * Department Id: 500
 * Salary: 88500.45
 * Status: active
 * ], 100=Optional[Employee:
 * Id: 1
 * Name: Emp1
 * Department Id: 100
 * Salary: 50000.6
 * Status: active
 * ], 300=Optional[Employee:
 * Id: 4
 * Name: Emp4
 * Department Id: 300
 * Salary: 75500.3
 * Status: active
 * ]}
 * 
 * SOLUTION:
 * 
 * Collect employees and group them by department and compare their salary.
 */
public class Exercise29Stream {

    public static void main(String[] args) {
        Exercise29Stream x = new Exercise29Stream();
        x.go();
        System.out.println("------");
        x.go2();
    }

    public void go() {
        List<Employee> employees = generateEmployees();
        
        employees.stream()
            .collect(Collectors.groupingBy(Employee::getDeptId))
            .entrySet()
            .stream()
            .map(entry -> entry.getValue().stream().max(Comparator.comparingDouble(Employee::getSalary)).get())
            .collect(Collectors.toList())
            .stream()
            .forEach(System.out::println);
    }
    
    public void go2() {
        List<Employee> employees = generateEmployees();
        
        Map<Integer, Optional<Employee>> map = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        
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
