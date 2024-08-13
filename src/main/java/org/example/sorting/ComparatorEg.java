package org.example.sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEg {

    String name;
    int salary;
    int age;

    public ComparatorEg(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ComparatorEg{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<ComparatorEg> list = new ArrayList<>();
        list.add(new ComparatorEg("siddhesh",1000,12));
        list.add(new ComparatorEg("jaj",1100,10));
        list.add(new ComparatorEg("maya",1200,11));

        list.sort((a, b) -> {
            if (a.age > b.age)
                return 1;
            else if (a.age < b.age) {
                return -1;
            } else
                return 0;
        });

        System.out.println(list);
    }
}
