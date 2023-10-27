package Lesson_7.Task1;

import Lesson_6.Task1.Person;

public class Employee1 extends Person {
    private int workExp;
    public Employee1(String lastName, String name, int year, int workExp) {
        super(lastName, name, year);
        this.workExp = workExp;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public void salary(){//оклад
        if(workExp==1)
            System.out.println("Your salary: " + 500 + " y.e.");
        else if(workExp<=2 && 5>workExp)
            System.out.println("Your salary: " + 1500 + "y.e.");
        else if(workExp>=5 && 10>=workExp)
            System.out.println("Your salary: " + 3500 + " y.e.");
        else if(workExp>10)
            System.out.println("Zachem vam eto luchshe otkroite IT companiy!");
    }
}
