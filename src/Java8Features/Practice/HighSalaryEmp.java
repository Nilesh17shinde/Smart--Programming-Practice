package Java8Features.Practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class HighSalaryEmp {
    public static void main(String[] args) {
        List<Employee> list = Stream.of(
                new Employee(1, "Nilesh Shinde", "Pune", 75000, "Dev"),
                new Employee(8, "Deva Shinde", "Pune city", 60000, "HR"),
                new Employee(2, "Shraddha Y", "Talegaon", 78000, "Dev"),
                new Employee(5, "Milind Shinde", "A. Nagar", 98000, "Agri"),
                new Employee(3, "Gaurav Palaskar", "Nagar", 45000, "HR"),
                new Employee(4, "Vikas Awate", "Mosi", 81000, "Dev")
        ).collect(Collectors.toList());

        // Comparator to compare salaries
        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);

        // Group by department and find the employee with the highest salary in each department
        Map<String, Optional<Employee>> map = list.stream()
                .collect(groupingBy(Employee::getDept,
                        Collectors.reducing(BinaryOperator.maxBy(comparing))));

        // Print the results
        map.forEach((dept, emp) ->
                System.out.println("Department: " + dept + ", Employee: " + emp.orElse(null)));
    }
}
