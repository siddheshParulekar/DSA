package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee>{
       BigDecimal salary;
       String name;

     public Employee(BigDecimal salary, String name) {
         this.salary = salary;
         this.name = name;
     }

     public BigDecimal getSalary() {
           return salary;
       }

       public String getName() {
           return name;
       }

    @Override
    public int compareTo(Employee o) {
        return this.salary.compareTo(o.getSalary());

    }


     public static void main(String[] args) {
         Employee employee = new Employee(new BigDecimal(20000),"Siddhesh");

         List<Employee> employees = new ArrayList<>();
         employees.add(new Employee(new BigDecimal(20000),"Siddhesh"));
         employees.add(new Employee(new BigDecimal(12000),"kla"));

         employees.add(new Employee(new BigDecimal(2000),"ria"));

         employees.add(new Employee(new BigDecimal(22000),"miza"));
        // Collections.sort(employees);

         List<Employee> sortedLisst = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
         employees.forEach(x-> System.out.println(x.getSalary()));

     }


}
