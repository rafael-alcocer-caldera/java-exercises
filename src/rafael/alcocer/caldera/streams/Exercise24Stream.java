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
package rafael.alcocer.caldera.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * PROBLEM: From a list of employees get the top 3 with most higher salary.
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
 * 1. Sort the list with salaries.
 * 
 * 2. Limit to 3
 * 
 * OUTPUT:
 * 
 * Emp5
 * 
 * Emp4
 * 
 * Emp1
 */
public class Exercise24Stream {

	public static void main(String[] args) {
		Exercise24Stream x = new Exercise24Stream();
		x.goOldSchool();
		System.out.println("-----");
		x.goNewSchool();
		System.out.println("-----");
		x.goNewSchool2();
	}

	public void goOldSchool() {
		List<Employee> employees = generateEmployees();

		employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

		for (int i = 0; i < 3; i++) {
			System.out.println(employees.get(i).getName());
		}
	}

	public void goNewSchool() {
		List<Employee> employees = generateEmployees();

		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
				.forEach(e -> System.out.println(e.getName()));
	}

	/**
	 * Here we map the Employee Stream after limit() to the Stream String names.
	 */
	public void goNewSchool2() {
		List<Employee> employees = generateEmployees();

		employees.stream()
			.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			.limit(3)
			.map(e -> e.getName())
			.forEach(System.out::println);
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
