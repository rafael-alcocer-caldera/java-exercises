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
package rafael.alcocer.caldera.streams.partitioningby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import rafael.alcocer.caldera.streams.Employee;

/**
 * PROBLEM: Write a program to print active and inactive employees in the given
 * collection.
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
 * {false=[Employee:
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
 * ], 
 * 
 * true=[Employee:
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
 * 
 * SOLUTION:
 * 
 * Collect the employees, partition them by status and return them.
 * 
 * true => active
 * 
 * false => inactive
 */
public class Exercise33Stream {

    public static void main(String[] args) {
        Exercise33Stream x = new Exercise33Stream();
        x.go();
    }

    public void go() {
        List<Employee> employees = generateEmployees();

        Map<Boolean, List<Employee>> map = employees.stream()
                .collect(Collectors.partitioningBy(employe -> employe.getStatus().equals("active")));

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
