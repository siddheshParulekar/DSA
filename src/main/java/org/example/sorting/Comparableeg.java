package org.example.sorting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableeg {



    public static class Employee implements Comparable<Employee>{

        int id;
        BigDecimal salary;
        String name;

        public Employee(int id, BigDecimal salary, String name) {
            this.id = id;
            this.salary = salary;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", salary=" + salary +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Employee o) {

            if (salary.compareTo(o.getSalary()) > 0 )
                return 1;
            else if (salary.compareTo(o.getSalary())<0) {
                return  -1;
            }else
                return 0;

        }

    }

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, new BigDecimal(22000), "siddhesh"));
        employee.add(new Employee(1, new BigDecimal(1200), "Kaya"));
        employee.add(new Employee(1, new BigDecimal(1100), "maya"));

        Collections.sort(employee,(a,b)->{
            if (a.getName().compareTo(b.getName())>0)
                return 1;
            else if (a.getName().compareTo(b.getName())<0) {
                return -1;
            } else
                return 0;
        });
        System.out.println(employee);
    }
}
