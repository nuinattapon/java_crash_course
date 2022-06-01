package me.nattapon.java.functional;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter3Video7 {
    public static void main(String[] args) {
        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Double totalDeveloperSalaries = employees
                .stream()
                .filter((employee) -> employee.jobTitle == "developer")
                .map((developer) -> (double) developer.salary)
                .reduce(0.0, (acc, x) -> acc + x);

        Long numberOfDevelopers = employees
                .stream()
                .filter((employee) -> employee.jobTitle == "developer")
                .count();
        Double averageDeveloperSalary = totalDeveloperSalaries / numberOfDevelopers;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String value = numberFormat.format(averageDeveloperSalary);

        System.out.println(value);

        Map<String, List<Employee>> employeesByJobTitle = employees
                .stream()
                .collect(Collectors.groupingBy(
                        (employee) -> employee.jobTitle
                ))        ;

        System.out.println(employeesByJobTitle);

        Map<String, Float> averageSalariesMap = employees
                .stream()
                .collect(Collectors.groupingBy(
                        (employee) -> employee.jobTitle
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        (entry) -> entry.getKey(),
                        (entry) -> entry.getValue()
                                .stream()
                                .map((employee) -> employee.salary)
                                .reduce(0f, (acc, x) -> acc + x) / entry.getValue().size()
                ));
        averageSalariesMap.entrySet().forEach((m) -> {
            System.out.printf("Job Title %-19s - Average Salary %11s\n", m.getKey(), numberFormat.format(m.getValue()));
        });
    }

    protected static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }
}
