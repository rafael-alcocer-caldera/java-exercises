/**
 * Copyright [2023] [RAFAEL ALCOCER CALDERA]
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
package rafael.alcocer.caldera.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import rafael.alcocer.caldera.streams.Employee;

/**
 * PROBLEM: From a list of employees get the positive ids.
 * 
 * INPUT:
 * 
 * Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
 * 
 * Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
 * 
 * Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
 * 
 * Employee e4 = new Employee(-1, "Emp4", 300, 75500.30, "active");
 * 
 * Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
 * 
 * Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
 * 
 * Employee e7 = new Employee(-1, "Emp7", 200, 25990.66, "inactive");
 * 
 * Employee e8 = new Employee(8, "Emp8", 200, 32790.25, "active");
 * 
 * OUTPUT:
 * 
 * ##### ids: [1, 2, 3, 5, 6, 8]
 * 
 * SOLUTION:
 * 
 * 1. Validate that the list is not null.
 * 
 * 2. Stream the list.
 * 
 * 3. Verify that each element is not null.
 * 
 * 4. Get the ids.
 * 
 * 5. From each id, check that all are positive.
 * 
 * 6. Return the list of ids.
 * 
 */
public class Exercise01Optional {

    public static void main(String[] args) {
        Exercise01Optional x = new Exercise01Optional();
        System.out.println("##### ids: " + x.getIds());
    }

    public List<Integer> getIds() {
        List<Employee> employees = generateEmployees();

        List<Integer> ids = Optional.ofNullable(employees)
                .orElseGet(() -> Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(emp -> emp.getId())
                .filter(id -> id > 0)
                .collect(Collectors.toList());

        return ids;
    }

    public List<Employee> generateEmployees() {
        // int id, String name, int deptid, double salary, String status
        Employee e1 = new Employee(1, "Emp1", 100, 50000.60, "active");
        Employee e2 = new Employee(2, "Emp2", 100, 30500.75, "inactive");
        Employee e3 = new Employee(3, "Emp3", 300, 45500.85, "inactive");
        Employee e4 = new Employee(-1, "Emp4", 300, 75500.30, "active");
        Employee e5 = new Employee(5, "Emp5", 500, 88500.45, "active");
        Employee e6 = new Employee(6, "Emp6", 100, 22690.33, "active");
        Employee e7 = new Employee(-1, "Emp7", 200, 25990.66, "inactive");
        Employee e8 = new Employee(8, "Emp8", 200, 32790.25, "active");

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);
    }
}
