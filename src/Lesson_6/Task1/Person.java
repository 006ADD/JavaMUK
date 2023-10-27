package Lesson_6.Task1;

public class Person {
    private String lastName;
    private String name;
    private int year;

    public Person(String lastName, String name, int year) {
        this.lastName = lastName;
        this.name = name;
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
