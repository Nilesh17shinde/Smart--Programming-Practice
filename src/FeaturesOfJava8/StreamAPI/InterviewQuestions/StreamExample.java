package FeaturesOfJava8.StreamAPI.InterviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        Date joiningDateNilesh=dateFormat.parse("17-07-2021");
        Date joiningDateShraddha=dateFormat.parse("01-08-2024");
        Date joiningDateGaurav=dateFormat.parse("08-05-2024");
        Date joiningDateVikas=dateFormat.parse("09-05-2023");
        Date joiningDateDeva=dateFormat.parse("08-10-2024");
        Date joiningDateGautami=dateFormat.parse("08-08-2022");
        Date joiningDateAmit=dateFormat.parse("30-05-2023");

        List<Employee> employees= Arrays.asList(
                new Employee("Nilesh",300000.0,joiningDateNilesh,"M"),
                new Employee("Shraddha",35000.0,joiningDateShraddha,"F"),
                new Employee("Gaurav",39000.0,joiningDateGaurav,"M"),
                new Employee("Vikas",20000.0,joiningDateVikas,"M"),
                new Employee("Deva",47000.0,joiningDateDeva,"M"),
                new Employee("Gautami",50000.0,joiningDateGautami,"F"),
                new Employee("Amit",15000.0,joiningDateAmit,"M")
        );
        System.out.println("Total Employees");
        employees.stream().forEach(System.out::println);

//        Find Max Salary
        System.out.println("----------------Maximum Salary---------------");
//        Employee getMaxSalary=employees.stream().max((a,b)->Double.compare(a.getSalary(),b.getSalary())).get();
        Employee getMaxSalary=employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(getMaxSalary);

//        Minimum salary
        System.out.println("------------Minimum Salary--------------");
//        Employee getMinSalary=employees.stream().min((a,b)->Double.compare(a.getSalary(),b.getSalary())).get();
        Employee getMinSalary=employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(getMinSalary);

//        Find Second Max Salary
        System.out.println("--------------------------Second Max Salary-------------------");
        Employee secondMax=employees.stream()
                .sorted((a,b)->Double.compare(b.getSalary(), a.getSalary()))
                .skip(1)
                .findFirst()
                        .get();
        System.out.println(secondMax);

//        Most Senior Based on Joining Date

        System.out.println("-----------------Most Senior Employee Joining Date--------------");

        Optional<Employee> seniorEmployee=employees.stream()
                .min((a,b)->a.getJoiningDate().compareTo(b.getJoiningDate()));
        seniorEmployee.ifPresent(System.out::println);

//        Count the employee basrd on Gender

        System.out.println("-----------Employee Count with Gender-----------");

        Map<String,Long> ListEmp=employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(ListEmp);
    }
}
