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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import rafael.alcocer.caldera.streams.Employee;

/**
 * PROBLEM: Write a program to print employees count working in each department.
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
 * 500-----1
 * 
 * 100-----3
 * 
 * 300-----2
 * 
 * -----
 * 
 * {500=1, 100=3, 300=2}
 * 
 * SOLUTION:
 * 
 * Collect the employees group them by department and do the count.
 */
public class Exercise26Stream {

    public static void main(String[] args) {
        Exercise26Stream x = new Exercise26Stream();
        x.go();
        System.out.println("-----");
        x.go2();
    }

    public void go() {
        List<Employee> employees = generateEmployees();
        
        employees.stream()
            .collect(Collectors.groupingBy(Employee::getDeptId))
            .entrySet()
            .forEach(entry -> System.out.println(entry.getKey() + "-----" + entry.getValue().size()));
    }
    
    public void go2() {
        List<Employee> employees = generateEmployees();
        
        Map<Integer, Long> map = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        
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
